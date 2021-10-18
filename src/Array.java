/*Create an int array of size 5, initialize it with values(10,20,30,40,50). Create a public boolean search(int arr[],
int search_element) this method will return true if the search element is present in the array else it will  print a
message "element not found"
 */
import java.util.Scanner;
class Array {


    public boolean search(int arr[], int search_element) {
        int d = 0;
        for (int i = 0; i < arr.length; i++) {
            if (search_element == arr[i]) {
                d = d + 1;
                break;
            } else
                continue;
        }
        if(d==1)
            return true;
        else
            return false;

    }
}
class Jack{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr1={10,20,30,40,50};
        Array obj =new Array();
        boolean c=obj.search(arr1,s.nextInt());
        if(c==true)
            System.out.println(c);
        else
        {
            System.out.println("element not found");
        }

    }
}
