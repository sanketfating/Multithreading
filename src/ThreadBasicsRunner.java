public class ThreadBasicsRunner {
    public static void main(String[] args){
        char mychar = "piper".charAt(3);
        System.out.println(mychar);
        System.out.println("apple".compareTo("banana"));
        boolean isDivisibleBy5;
        //Task1
        for (int i = 101; i<=199; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask1 Done ");

        //Task2
        for (int i = 201; i<=299; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask2 Done ");

        //Task3
        for (int i = 301; i<=399; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask3 Done");

        System.out.print("\nMain method is completed");

    }

}
