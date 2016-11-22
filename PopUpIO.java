import java.io.*;
import javax.swing.JOptionPane;

public class PopUpIO
{

  public static int getInt(String prompt, String errorMessage)
   {
      boolean done = false;
      int value = 0;
      do {
         try {
            String input = JOptionPane.showInputDialog (prompt);
            value = Integer.parseInt (input);
            done = true;
         }
         catch (Exception e) {
            JOptionPane.showMessageDialog (null, errorMessage);
         }
      } while (!done);
      return value;
   }

   public static int getInt(String prompt)
   {
      return getInt (prompt, "Please enter a valid integer value");
   }
   
   public static int getInt (String prompt, int defaultValue)
   {
      int value = defaultValue;
      String input;
      try {
         input = JOptionPane.showInputDialog (prompt);
         value = Integer.parseInt (input);
      }
      catch (Exception e) {
         value = defaultValue;
      }
      return value;
   }

   public static float getFloat (String prompt, String errorMessage)
   {
      boolean done = false;
      float value = 0;
      do {
         try {
            String input = JOptionPane.showInputDialog (prompt);
            value = Float.parseFloat (input);
            done = true;
         }
         catch (Exception e) 
         {
            JOptionPane.showMessageDialog (null, errorMessage);
         }
      } while (!done);
      return value;
   }
   
   public static float getFloat (String prompt)
   {
     return getFloat (prompt, "Please enter a valid double value");
   }
   
   public static float getFloat (String prompt, float defaultValue)
   {
      float value = 0;
      try {
         String input = JOptionPane.showInputDialog (prompt);
         value = Float.parseFloat (input);
     }
      catch (Exception e) {
         value = defaultValue;
      }
      return value;
   }

   public static String getString(String prompt, String defaultValue)
   {
      String input = "";
      try {
         input = JOptionPane.showInputDialog (prompt);
      }
      catch (Exception e) {
         input = defaultValue;
      }
      return input.trim();
   }

   public static String getString(String prompt)
   {
      boolean done = false;
      String input = "";
      do {
         input = JOptionPane.showInputDialog (prompt);
         if (input != null)
            done = true;
         else   
            JOptionPane.showMessageDialog (null, "Please enter a valid String value");
      } while (!done);
      return input.trim();
         
   }

   public static boolean getYesNo(String prompt, String title)
   {
      int n = JOptionPane.showConfirmDialog(null, prompt, title, JOptionPane.YES_NO_OPTION);
      return (n == 0);
   }

   public static int clickButton(String prompt, String title, String button1, String button2)
   {
      Object[] options = {button1, button2};
      int n = JOptionPane.showOptionDialog(null, prompt, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]); //default button title      int n = JOptionPane.showConfirmDialog(null, prompt, title, JOptionPane.YES_NO_OPTION);
      return n + 1;
   }


   public static int clickButton(String prompt, String title, String ... buttonText)
   {
      //Object[] options = {button1, button2};
      int n = JOptionPane.showOptionDialog(null, prompt, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttonText, buttonText[0]); //default button title      int n = JOptionPane.showConfirmDialog(null, prompt, title, JOptionPane.YES_NO_OPTION);
      return n + 1;
   }


   public static void println (long value)
   {
      JOptionPane.showMessageDialog (null, value);
   }

   public static void println (double value)
   {
      JOptionPane.showMessageDialog (null, value);
   }

   public static void println (char value)
   {
      JOptionPane.showMessageDialog (null, value);
   }

   public static void println (String value)
   {
      JOptionPane.showMessageDialog (null, value);
   }

   public static void println (boolean value)
   {
      JOptionPane.showMessageDialog (null, value);
   }

   public static void println (Object value)
   {
      JOptionPane.showMessageDialog (null, value);
   }
}