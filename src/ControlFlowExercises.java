public class ControlFlowExercises {
    public static void main (String[] arg){
        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i += 2;
        }while(i <= 100);

    }

}
