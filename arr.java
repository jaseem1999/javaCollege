import java.util.Scanner;

class Input{
        public static void main(String arr[]){
                Scanner sc = new Scanner(System.in);
                Display d = new Display();
                int a[] = new int[5];
                System.out.println("Enter the 5 values");
                for(int i = 0; i<5; i++){
                        a[i] = sc.nextInt();
                }
                d.outPut(a);
                d.sort(a);
                d.sum(a);
                d.maxMin(a);
                d.search(a);
        }
}

class Display{
        public void outPut(int a[]){
                for(int i=0; i<5;i++){
                        System.out.println(a[i]);
                }
                System.out.println();
        }

        public void sort(int a[]){
                for(int i = 0; i<5; i++){
                        for(int j = i+1;j<5;j++){
                                if(a[i] > a[j]){
                                        int t = a[i];
                                        a[i] = a[j];
                                        a[j] = t;
                                }
                        }
                        System.out.println(a[i]);
                }
        }
        public void sum(int a[]){
                int sum = 0;
                for(int i = 0; i < 5; i++){
                        sum += a[i];
                }
                System.out.println("Sum of ::"+sum);
        }
        public void maxMin(int a[]){
                System.out.println("Max ::"+ a[4]);
                System.out.println("Min ::"+ a[0]);
        }
	  public void search(int a[]){
                System.out.print("Enter the Search Number ::");
                Scanner sc = new Scanner(System.in);
                int s = sc.nextInt();
                for(int i = 0; i < 5;i++){
                        if(a[i] == s){
                                System.out.println("Found :: "+a[i]+" index:: "+i);
                                return;
                        }

                }
                System.out.println("Not found");
                return;
         }
}
