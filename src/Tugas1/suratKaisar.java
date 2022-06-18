package Tugas1;

import java.util.Scanner;

public class suratKaisar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String isiText = in.nextLine();
        int nilai = in.nextInt();
        //contoh memasukkan Pemrograman maka akan keluar Rgotqitcocp
        //11
        //2

        menthodCaesar(isiText,nilai);

    }
    public static void menthodCaesar(String isiText,int nilai){
        String chiperText="";
        char alpabet;


        for (int i=0;i<isiText.length();i++){
            //Menggeser satu karakter pada setiap perulangan
            alpabet = isiText.charAt(i);
            //jika alfabet terletak di antara a dan z
            if(alpabet>='a' && alpabet<='z'){
                //geser alpabet
                alpabet = (char) (alpabet+nilai);
                //jika pengeseran alfabet lebih dari besar dari 'z'
                if (alpabet>'z'){
                    alpabet=(char) (alpabet+'a'-'z'-1);
                }
                chiperText = chiperText+alpabet;
            }else if (alpabet>='A' && alpabet<='Z'){
                //Geser alpabet
                alpabet = (char) (alpabet+nilai);
                //jika pergeseran alpabet lebih besar dari 'Z'
                if (alpabet>'Z'){
                    alpabet=(char) (alpabet+'A'-'Z'-1);
                }
                chiperText = chiperText+alpabet;
            }
            else {
                chiperText = chiperText+alpabet;
            }
        }
        System.out.println(chiperText);
    }
}
