package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by никита on 01.05.2015.
 */
public class ConsoleRead {

    public static String consoleInput;
    public static String stopInput = "press Enter for End";


    public static String readFromConsole(String message){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        System.out.println(message);
        System.out.println(stopInput);

            try {
                consoleInput = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        checkEmptyFieldAndEndProgram();

        return consoleInput;
    }

    private static void checkEmptyFieldAndEndProgram() {
        if(!consoleInput.equals("")){
            System.out.println("User end programm");
            System.exit(0);
        }
        ;
    }


}
