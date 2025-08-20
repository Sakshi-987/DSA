public class updated_array {

    public static void update(int arr[]) {
        System.out.println("original marks.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("updated marks");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 50;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 40, 45, 43, 46, 49 };

        update(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}