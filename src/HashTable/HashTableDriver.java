package HashTable;

public class HashTableDriver {
    public static void main(String[] args) {

        Hashtable<String , Integer> hash = new Hashtable();

        String paragraph = " Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations ";


        String[] paragraphArray = paragraph.toLowerCase().split(" ");

        for(String word: paragraphArray) {

            Integer value =  hash.get(word);

            if( value == null)
                value = 1;
            else
                value = value + 1;
            hash.add(word , value);
        }
        System.out.println(hash);
        hash.remove("avoidable");
        System.out.println(hash);
    }
}