/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author Lydia Chung
 * @version 03/02/2019
 */
public class M12_StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "    You miss 100% of the shots you don't take.    ";

        //  Add examples below for the following methods:
        //    trim()
        System.out.println(sample.trim());
        //    length()
        System.out.println("Length: " + sample.length());
        //    indexOf with one and two parameters
        System.out.println(sample.indexOf("o"));
        System.out.println(sample.indexOf("o", 25));
        //    substring() with one and two parameters
        System.out.println(sample.substring(25));
        System.out.println(sample.substring(25, 30));
        //    compareTo()
        System.out.println(sample.compareTo("    You miss 99% of the shots you don't take.    "));
        //    any other String methods you'd like to try
        System.out.println(sample.trim().toUpperCase());

    }

}