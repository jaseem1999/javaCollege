import java.util.Scanner;
class Product{
        public static void main(String ar[]){
                int pcode = 0;
                String pname = null;
                int pprice = 0;
                Details p1 = new Details();
                Details p2 = new Details();
                Details p3 = new Details();
                System.out.println("Enter p1 Details");
                p1.read(pcode,pprice,pname);
                System.out.println("Enter p2 Details");
                p2.read(pcode,pprice,pname);
                System.out.println("Enter p3 Details");
                p3.read(pcode,pprice,pname);
                System.out.println("Lowest Price product Details");
                if(p1.pp < p2.pp && p1.pp < p3.pp){
                        System.out.println("Lowest Price product is :: "+p1.pn+" Product Price :: "+p1.pp+" Product Code :: "+ p1.pc);
                }else if(p2.pp < p3.pp){
                        System.out.println("Lowest Price Product is:: "+p2.pn+"Product price :: "+p2.pp+" Product code :: "+ p2.pp);
                }else{
                        System.out.println("Lowest pricr Product is :: "+p3.pn+"Product price ::  "+p3.pp+" Product code iss "+p3.pp);
                }
        }
}
class Details{
        int pp;
        String pn;
        int pc;
        public void read(int pcode,int pprice,String pname){
                pp = pprice;
                pn = pname;
                pc = pcode;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the product name :: ");
                pn = sc.next();
                System.out.print("Enter the product code :: ");
                pc = sc.nextInt();
                System.out.print("Enter the profduct price ::");
                pp = sc.nextInt();
        }
}