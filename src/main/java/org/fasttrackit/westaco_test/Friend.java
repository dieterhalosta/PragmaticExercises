package org.fasttrackit.westaco_test;
import java.util.Collection;
import java.util.ArrayList;

public class Friend {

    /*
    *   Given a data structure representing a social network, implement method canBeConnected on class Friend.
    *
    *   The method should check if a connection to the given member exists, efficiently with respect to time used. That should be
    *   either a direct friendship or chain of members between them who are mutual friends.
    *
    *   For example, if A and B are friends and B and C are friends, then A.canBeConnected(C) should return true, since C is a friend
    *   of B and B is a friend of A.
    * */

    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(Friend friend) {
        //Check if friend has friends
        //Check if friends[0] has friends
        //Check if friends[0].friends[0] is different from friend - if different return true, else move to next


        if(friend.friends.isEmpty()){
            return false;
        } else {
            for(int i=0; i< friends.size(); i++){
                boolean contains = friends.contains(getFriends());
                if (contains){

                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");

        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(c));
    }
}
