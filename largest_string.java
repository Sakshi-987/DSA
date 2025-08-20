public class largest_string {
    public static void main(String args[]) {
        String fruits[] = { "apple", "mango", "banana" };

        String largest = fruits[0];
        String smallest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
        //comparing lexographically i.e letter vise comparasion 
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
            if(smallest.compareTo(fruits[i])>0){
            smallest = fruits[i];
            }
        }
        System.out.println(largest);
         System.out.println(smallest);
    }
}
