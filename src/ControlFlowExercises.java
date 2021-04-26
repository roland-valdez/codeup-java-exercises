public class ControlFlowExercises {
    public static void main (String[] arg){
//        double i = 2;
//        do {
//                System.out.printf("\n%.0f",i);
//            i = i * i;
//        }while(i <= 1000000);

        for (double i = 2; i <= 1000000; i = i * i){
            System.out.printf("\n%.0f",i);
        }
    }

}
