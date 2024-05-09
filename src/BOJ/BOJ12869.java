package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ12869 {
    static int scv[] ={0, 0, 0};
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int attack = 0;
        int aliveNumofSCV = 0;

        for(int i = 0 ; i < n; i++)
            scv[i] = scanner.nextInt();


        if(n==3){
            while(true){
                Arrays.sort(scv);
                System.out.println(Arrays.toString(scv));
                aliveNumofSCV = aliveNumofScv();
                attack++;
                if(aliveNumofSCV==3){
                    scv[2] -=9;
                    scv[1] -=3;
                    scv[0] -=1;
                }
                else if(aliveNumofSCV==2){
                    scv[2] -=9;
                    scv[1] -=3;
                }
                else if(aliveNumofSCV==1){
                    scv[2] -= 9;
                }

                if((scv[0] <= 0 && scv[1] <= 0) &&scv[2] <=0){
                        break;
                }
            }
        }
        else if(n==2){
            while(true){
                Arrays.sort(scv);
                aliveNumofSCV = aliveNumofScv();
                attack++;
                if(aliveNumofSCV==2){
                    scv[1] -=9;
                    scv[0] -=3;
                }
                else if(aliveNumofSCV==1){
                    scv[0] -= 9;
                }
                if(scv[0] <= 0 && scv[1] <= 0)
                    break;
            }
        }
        else{
            while(true){
                attack++;
                scv[0] -=9;
                if(scv[0] <= 0)
                    break;
            }
        }
        System.out.println(attack);
    }
    public static int aliveNumofScv(){
        int count = 0;
        for(int i : scv)
            if(i>0)
                count++;
        return count;
    }
}
