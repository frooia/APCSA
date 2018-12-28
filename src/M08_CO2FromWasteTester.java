/**
 * This class tests the M08_CO2FromWaste class.
 *
 * @author Lydia Chung
 * @version 12/26/2018
 *
 */
import java.util.ArrayList;

public class M08_CO2FromWasteTester
{
   public static void main(String[] args)
   {
       ArrayList<M08_CO2FromWaste> households = new ArrayList<M08_CO2FromWaste>();
       
       //households in ArrayList
       households.add(new M08_CO2FromWaste(4, true, false, false, false));
       households.add(new M08_CO2FromWaste(2, true, true, false, true));
       households.add(new M08_CO2FromWaste(7, false, false, false, true));
       households.add(new M08_CO2FromWaste(5, true, true, false, true));
       households.add(new M08_CO2FromWaste(1, false, false, false, false));
       households.add(new M08_CO2FromWaste(12, false, true, false, false));
       
       for(M08_CO2FromWaste dataRecord : households)
       {
           dataRecord.calcGrossWasteEmission();
           dataRecord.calcWasteReduction();
           dataRecord.calcNetWasteReduction();
       }

       System.out.println("|       |        |                                         |             Pounds of CO2             |");
       System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
       System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
       System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");


       for(int index = 0; index < households.size(); index ++)
       {
           M08_CO2FromWaste dataRecord = households.get(index);
           System.out.printf("%2s %-3d %1s %4d %-5s %-5s %-3s %-6s %-3s %-5s %-3s %-5s %-3s %8.2f %-4s %7.2f %-5s %7.2f %-2s", "|  ", index, "|", 
        		   dataRecord.getNumPeople(), "  |  ", 
        		   dataRecord.getPaper(), " | ", 
        		   dataRecord.getPlastic(), " | ", 
        		   dataRecord.getGlass(), " | ",
        		   dataRecord.getCans(), " | ",
        		   dataRecord.getEmissions(), " |  ",
        		   dataRecord.getReduction(), "  |  ",
        		   dataRecord.getNetEmissions(), " |");
           System.out.println();
       }
   }
}
