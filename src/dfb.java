import java.util.Scanner;

public class dfb {
        public static void main(String[] args) {
            int[][] a=new int[5][5];
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    a[i][j]=(int) (Math.random()*100);
                }
            }
            System.out.println("a矩阵为：");
            for(int i=0;i<5;i++){
                for(int j=0,k=1;j<5;j++){

                    System.out.printf("%4d",a[i][j]);

                }
                System.out.println();
            }

            System.out.println("a矩阵的转置为：");
            for(int i=0;i<5;i++){
                for(int j=i;j<5;j++){

                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;

                }
            }

            for(int i=0;i<5;i++){
                for(int j=0,k=1;j<5;j++){

                    System.out.printf("%4d",a[i][j]);

                }
                System.out.println();
            }
        }
    }


