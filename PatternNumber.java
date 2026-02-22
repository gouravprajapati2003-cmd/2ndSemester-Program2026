public class PatternNumber {
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=6; i++) {
            for(j=1; j<=6; j++) {
                if(i==1 || i==6 || j==1 || j==6) {
                    System.out.print("3 ");
                }else if (i==2  || i==5 || j==2 || j==5){
                    System.out.print("4 ");
                }else {
                    System.out.print("5 ");
                }
            }
            System.out.println(" ");
        }
    }
}

// Q. Print this pattern.
// 333333
// 344443
// 345543
// 345543
// 344443
// 333333