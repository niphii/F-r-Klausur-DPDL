package Streams_Klausuraufgabe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Launcher {

    public static void main(String[] args) throws IOException {

        File f1 = new File("src/Streams/history.txt");
        f1.createNewFile();
        FileWriter fw = new FileWriter(f1);
        PrintWriter pw = new PrintWriter(fw);
        pw.write("Call History:");
        Calendar c = new GregorianCalendar();
        pw.write(" Call by " + args[0] + " at local time: " + c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        pw.write(" Call by " + args[1] + " at local time: " + c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        pw.write(" Call by " + args[2] + " at local time: " + c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        pw.close();
    }
}


//2. Variante!

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Stream {

    public static void main(String[] args) throws IOException {

        File file = new File("history.txt");
        FileWriter FW = new FileWriter(file);
        PrintWriter PW = new PrintWriter(FW);

        String head = "Call History:";
        String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);

        PW.println(head);
        PW.println("    Call by " + args[0] + " " + args[1] + " at local time: " + timeStamp);
        PW.println("    Call by " + args[2] + " " + args[3] + " at local time: " + timeStamp);
        PW.println("    Call by " + args[4] + " " + args[5] + " at local time: " + timeStamp);

        PW.close();
        FW.close();

    }

}