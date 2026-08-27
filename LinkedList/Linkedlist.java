// LinkedList using prebuilt class
import java.util.LinkedList;
import java.util.Scanner;
class Linkedlist{
    public static void main(String[]args){
        LinkedList<Integer> list = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of nodes");
		int n = scan.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("Enter the value");
			int value = scan.nextInt();
			list.add(value);
		}
		for(int values:list) {
			System.out.print(values+"->");
		}
		System.out.print("null");
    }
}