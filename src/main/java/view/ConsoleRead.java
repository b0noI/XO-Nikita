package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleRead {

    private static String consoleInput;

    private static final String HOW_TO_END_PROGRAM = "Enter exit for End";

    public static String readFromConsole(String message){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

        System.out.println(message);


            try {
                consoleInput = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        checkEmptyFieldAndEndProgram();

        return consoleInput;
    }

    private static void checkEmptyFieldAndEndProgram() {
        if(consoleInput.equals("exit")){
            System.out.println("User end programm");
            System.exit(0);
        }
    }

    public static void instructionHowStopProgram(){
        System.out.println(HOW_TO_END_PROGRAM);
    }

}
