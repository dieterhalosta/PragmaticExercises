package org.fasttrackit.westaco_test;
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
//import com.testdome.service.BookSearchService;

public class TheRealTest1 {
    /*
    * Using Spring AOP, in the ServiceAOP class:
    *   * Add the appropriate annotation to the ServiceAOP.serviceAdvice method to intercept all methods in the com.testdome.service package and invoke the ServiceCallback bean before the method is executed.
    *   * Add the appropriate annotation to the ServiceAOP.searchServiceAdvice to intercept the bookExists method of BookSearchService and invoke SearchCallback bean. The bookName argument should be passed to the callback.
    *   * Add the appropriate annotation to the ServiceAOP.repositoryAdvice to intercept the getBooks method of the BookRepository class and invoke the RepositoryCallback bean.
    * */



    interface ServiceCallback {
        public void callback(String methodName);
    }
    interface SearchCallback {
        public void callback(String searchedBook);
    }
    interface RepositoryCallback {
        public void callback();
    }

    @Aspect
    public static class ServiceAOP {
        @Autowired ServiceCallback serviceCallback;
        @Autowired SearchCallback searchCallback;
        @Autowired RepositoryCallback repositoryCallback;

        public void serviceAdvice(JoinPoint jp) {
            serviceCallback.callback(jp.getSignature().getName());
        }

        public void repositoryAdvice(JoinPoint jp) {
            repositoryCallback.callback();
        }

        public void searchServiceAdvice(JoinPoint joinPoint) throws Throwable {
            searchCallback.callback((String) joinPoint.getArgs()[0]);
        }

        public static void main(String[] args) {
            AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext();
            config.register(Config.class);
            config.refresh();

//            BookSearchService service = config.getBean(BookSearchService.class);
//            System.out.println(service.bookExists("Book2"));
        }
    }

    @Configuration
    @EnableAspectJAutoProxy
    @Import(ServiceAOP.class)
//    @ComponentScan(basePackages="com.testdome.service")
    class Config {
        @Bean
        public ServiceCallback serviceCallback() {
            return (methodName) -> System.out.println(methodName);
        }
        @Bean
        public SearchCallback searchCallback() {
            return (book) -> System.out.println(book);
        }
        @Bean
        public RepositoryCallback repositoryCallback() {
            return () -> System.out.println("Repository called!");
        }
    }
}
