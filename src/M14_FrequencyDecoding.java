/**
 * @author Lydia Chung
 * @version  04/22/2019
 */
import java.util.*;
import java.io.*;
public class M14_FrequencyDecoding
{
	private File subset;
	private File output;
	private int [ ] freqList = new int[26];
	public M14_FrequencyDecoding(File subset, File output)
	{
		this.subset = subset;
		this.output = output;
	}
	public void calcFrequencies(File frequencies) throws IOException
	{
		PrintWriter file = new PrintWriter(frequencies);
		Scanner scan = new Scanner(subset);
		String text = "";
		while (scan.hasNext()) {
			text += scan.next() + scan.nextLine();
		}
		char [ ] fulltext = (text).toLowerCase().toCharArray();
		for (char c : fulltext) {
			if (c >= 97 && c <= 122) {
				freqList[c - 97]++;
			}
		}
		for (int i = 0; i < freqList.length; i++) {
			file.println((char)(i + 97) + ": " + freqList[i]);
		}
		file.close();
	}
}