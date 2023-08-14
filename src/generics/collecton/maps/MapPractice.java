package generics.collecton.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Noah", 23);
        map.put("Emperor", 35);
        map.put("Sarah", 16);
        map.put("tobi", 16);
        map.put("Oyin", 60);

        System.out.println(map.get("Noah"));

        for (Map.Entry<String, Integer> el : map.entrySet()) {
            System.out.println("Key = " + el.getKey() + " Value = " + el.getValue());
        }

        /*
         * list: stores in insertion order, you can also specify position of insertion
         * set: stores in insertion order, and doesn't allow duplicated values
         * queue: stores in insertion order, it allows retrieval in fifo
         * stack: stores in insertion order, it allows retrieval in lifo
         * map: stores data in key value pairs, it doesn't allow duplicate keys, but can allow duplicate values
         */
        
        Map<String, Double> accountList = new HashMap<>();
        User alash = new User("Alash", "222222222", 2000.0);
        User tobi = new User("Tobi", "11111111111", 1000.0);
        User pelorina = new User("Pelumi", "333333333", 3000.0);
        
        User[] users = {alash, tobi, pelorina};
        
        for (User user : users) {
            accountList.put(user.username, user.accountBalance);
        }

        System.out.println("users = " + Arrays.toString(users));

        //transversal or iterating through a map
        for (Map.Entry<String, Double> element : accountList.entrySet()) {
            System.out.println("Key = " + element.getKey() + " Value " + element.getValue());
        }

        Iterator<String> accountListIterator = accountList.keySet().iterator();
        while (accountListIterator.hasNext()) {
            String key = accountListIterator.next();
            System.out.println("key " + key + " Value: " + accountList.get(key));
        }
        

    }
    
    static class User{
        public String username;
        public String accountNumber;
        public Double accountBalance;

        public User(String username, String accountNumber, Double accountBalance) {
            this.username = username;
            this.accountNumber = accountNumber;
            this.accountBalance = accountBalance;
        }

        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    ", accountNumber='" + accountNumber + '\'' +
                    ", accountBalance=" + accountBalance +
                    '}';
        }
    }

}
