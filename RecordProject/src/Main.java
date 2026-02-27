public class Main {
    static void main() {

        for (int i = 1 ; i<=5 ; i++){
            Student s = new Student("1200"+ i , 
                    switch(i){
                case 1 -> "Fitsum";
                case 2 -> "Ermias";
                case 3 -> "Abel";
                case 4 -> "Zeru";
                case 5 -> "Aron";
                        default ->"Unkonwn";
                    },
                    "12/23/2001",
                    "SWE");
            System.out.println(s);
        }
    }
}
