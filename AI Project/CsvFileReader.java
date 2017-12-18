import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileReader {
	
	private static final String COMMA_DELIMITER = ",";
	
	private static final int TOMB_BOSS_IDX = 0;
   private static final int TOMB_RAGINGBLOW_IDX = 1;
   private static final int TOMB_RAMPAGE_IDX = 2;
   private static final int TOMB_BLOODTHIRST_IDX = 3;
   private static final int TOMB_MELEE_IDX = 4;
   private static final int TOMB_EXECUTE_IDX = 5;
   private static final int TOMB_ODYNSFURY_IDX = 6;
   private static final int TOMB_FURIOUSSLASH_IDX = 7;
   private static final int TOMB_BRUTALHAYMAKER_IDX = 8;
   private static final int TOMB_KJBURNINGWISH_IDX = 9;
   private static final int TOMB_HIDDENSATYR_IDX = 10;
   private static final int TOMB_ODYNSGLORY_IDX = 11;
   private static final int TOMB_HELYASSCORN_IDX = 12;
   private static final int TOMB_CHARGE_IDX = 13;
   private static final int TOMB_WHIRLWIND_IDX = 14;
   private static final int TOMB_HEROICLEAP_IDX = 15;
   
   private static final int SPELL_ELEMENT_IDX = 0;
   private static final int SPELL_RAGINGBLOW_IDX = 1;
   private static final int SPELL_RAMPAGE_IDX = 2;
   private static final int SPELL_BLOODTHIRST_IDX = 3;
   private static final int SPELL_MELEE_IDX = 4;
   private static final int SPELL_EXECUTE_IDX = 5;
   private static final int SPELL_ODYNSFURY_IDX = 6;
   private static final int SPELL_FURIOUSSLASH_IDX = 7;
   private static final int SPELL_BRUTALHAYMAKER_IDX = 8;
   private static final int SPELL_KJBURNINGWISH_IDX = 9;
   private static final int SPELL_HIDDENSATYR_IDX = 10;
   private static final int SPELL_ODYNSGLORY_IDX = 11;
   private static final int SPELL_HELYASSCORN_IDX = 12;
   private static final int SPELL_CHARGE_IDX = 13;
   private static final int SPELL_WHIRLWIND_IDX = 14;
   private static final int SPELL_HEROICLEAP_IDX = 15;

	
	public static void readCsvFile(String fileName) {

		BufferedReader fileReader = null;
     
        try {

        	List<TombData> tombData = new ArrayList<TombData>();
         List<PlayerSpellsElements> playerS = new ArrayList<PlayerSpellsElements>();
        	
            String line = "";

            fileReader = new BufferedReader(new FileReader("TombData.csv"));
            
            fileReader.readLine();

            while ((line = fileReader.readLine()) != null)
            {
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {
                	//Create a new student object and fill his  data
					TombData tombdata = new TombData(String.valueOf(tokens[TOMB_BOSS_IDX]), Integer.parseInt(tokens[TOMB_RAGINGBLOW_IDX]),
                                   Integer.parseInt(tokens[TOMB_RAMPAGE_IDX]), Integer.parseInt(tokens[TOMB_BLOODTHIRST_IDX]),
                                   Integer.parseInt(tokens[TOMB_MELEE_IDX]), Integer.parseInt(tokens[TOMB_EXECUTE_IDX]),
                                   Integer.parseInt(tokens[TOMB_ODYNSFURY_IDX]), Integer.parseInt(tokens[TOMB_FURIOUSSLASH_IDX]),
                                   Integer.parseInt(tokens[TOMB_BRUTALHAYMAKER_IDX]), Integer.parseInt(tokens[TOMB_KJBURNINGWISH_IDX]),
                                   Integer.parseInt(tokens[TOMB_HIDDENSATYR_IDX]), Integer.parseInt(tokens[TOMB_ODYNSGLORY_IDX]),
                                   Integer.parseInt(tokens[TOMB_HELYASSCORN_IDX]), Integer.parseInt(tokens[TOMB_CHARGE_IDX]),
                                   Integer.parseInt(tokens[TOMB_WHIRLWIND_IDX]), Integer.parseInt(tokens[TOMB_HEROICLEAP_IDX]));
                                   
					tombData.add(tombdata);
				   }
            }
            
            for (TombData td : tombData) {
				   System.out.println(td.toString());
			   }
            while ((line = fileReader.readLine()) != null)
            {
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {
                	//Create a new student object and fill his  data
					PlayerSpellsElements pse = new PlayerSpellsElements(String.valueOf(tokens[SPELL_ELEMENT_IDX]), String.valueOf(tokens[SPELL_RAGINGBLOW_IDX]),
                                                                   String.valueOf(tokens[SPELL_RAMPAGE_IDX]), String.valueOf(tokens[SPELL_BLOODTHIRST_IDX]),
                                                                   String.valueOf(tokens[SPELL_MELEE_IDX]), String.valueOf(tokens[SPELL_EXECUTE_IDX]),
                                                                   String.valueOf(tokens[SPELL_ODYNSFURY_IDX]), String.valueOf(tokens[SPELL_FURIOUSSLASH_IDX]),
                                                                   String.valueOf(tokens[SPELL_BRUTALHAYMAKER_IDX]), String.valueOf(tokens[SPELL_KJBURNINGWISH_IDX]),
                                                                   String.valueOf(tokens[SPELL_HIDDENSATYR_IDX]), String.valueOf(tokens[SPELL_ODYNSGLORY_IDX]),
                                                                   String.valueOf(tokens[SPELL_HELYASSCORN_IDX]), String.valueOf(tokens[SPELL_CHARGE_IDX]),
                                                                   String.valueOf(tokens[SPELL_WHIRLWIND_IDX]), String.valueOf(tokens[SPELL_HEROICLEAP_IDX]));
                                   
					playerS.add(pse);
				   }
            }
            
            for (PlayerSpellsElements player : playerS) {
				   System.out.println(player.toString());
			   }
        } 
        catch (Exception e) {
        	   System.out.println("Error in CsvFileReader");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
            	System.out.println("Error while closing fileReader");
               e.printStackTrace();
            } catch (NumberFormatException nfe) {
               System.out.println(nfe.getMessage());
            }
        }

	}

}
