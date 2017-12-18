import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileWriter {
   
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	private static final String FILE_HEADER = "Boss, Raging Blow, Rampage, Bloodthirst, Melee, Execute, Odyn's Fury, "
                                             + "Furious Slash, Brutal Haymaker, Kil'Jaeden's Burning Wish, Mark of the Hidden Satyr, "
                                             + "Odyn's Glory, Helya's Scorn, Charge, Whirlwind, Heroic Leap";

	public static void writeCsvFile(String fileName) {
   
      GorothEncounter ge = new GorothEncounter();
      HarjatanEncounter he = new HarjatanEncounter();
      MistressSasszEncounter mse = new MistressSasszEncounter();
      InquisitionEncounter ie = new InquisitionEncounter();
      SistersEncounter se = new SistersEncounter();
      DesolateHostEncounter dhe = new DesolateHostEncounter();
      MaidenEncounter me = new MaidenEncounter();
      AvatarEncounter ae = new AvatarEncounter();
      KilJaedenEncounter kje = new KilJaedenEncounter();
      
      GorothHitCounter gcc = new GorothHitCounter();
      HarjatanHitCounter hcc = new HarjatanHitCounter();
      MistressHitCounter mcc = new MistressHitCounter();
      InquisitionHitCounter icc = new InquisitionHitCounter();
      SistersHitCounter scc = new SistersHitCounter();
      DesolateHostHitCounter dhcc = new DesolateHostHitCounter();
      MaidenHitCounter mvcc = new MaidenHitCounter();
      AvatarHitCounter acc = new AvatarHitCounter();
      KilJaedenHitCounter kjcc = new KilJaedenHitCounter();
      
      AbilityTypeID ati = new AbilityTypeID();
		
		TombData td1 = new TombData("Goroth", ge.totalRagingBlowDamage(), ge.totalRampageDamage(), ge.totalBloodThirstDamage(),
                                   ge.totalMeleeDamage(), ge.totalExecuteDamage(), ge.totalOdynsFuryDamage(), ge.totalFuriousSlashDamage(),
                                   ge.totalBrutalHaymakerDamage(), ge.totalKJBurningWishDamage(), ge.totalHiddenSatyrDamage(),
                                   ge.totalOdynsGloryDamage(), ge.totalHelyasScornDamage(), ge.totalChargeDamage(), ge.totalWhirlWindDamage(),
                                   ge.totalHeroicLeapDamage());
      TombData td2 = new TombData("Harjatan", he.totalRagingBlowDamage(), he.totalRampageDamage(), he.totalBloodThirstDamage(),
                                   he.totalMeleeDamage(), he.totalExecuteDamage(), he.totalOdynsFuryDamage(), he.totalFuriousSlashDamage(),
                                   he.totalBrutalHaymakerDamage(), he.totalKJBurningWishDamage(), he.totalHiddenSatyrDamage(),
                                   he.totalOdynsGloryDamage(), he.totalHelyasScornDamage(), he.totalChargeDamage(), he.totalWhirlWindDamage(),
                                   he.totalHeroicLeapDamage());
      TombData td3 = new TombData("Mistress Sassz'ine", mse.totalRagingBlowDamage(), mse.totalRampageDamage(), mse.totalBloodThirstDamage(),
                                   mse.totalMeleeDamage(), mse.totalExecuteDamage(), mse.totalOdynsFuryDamage(), mse.totalFuriousSlashDamage(),
                                   mse.totalBrutalHaymakerDamage(), mse.totalKJBurningWishDamage(), mse.totalHiddenSatyrDamage(),
                                   mse.totalOdynsGloryDamage(), mse.totalHelyasScornDamage(), mse.totalChargeDamage(), mse.totalWhirlWindDamage(),
                                   mse.totalHeroicLeapDamage());
      TombData td4 = new TombData("Demonic Inquisition", ie.totalRagingBlowDamage(), ie.totalRampageDamage(), ie.totalBloodThirstDamage(),
                                   ie.totalMeleeDamage(), ie.totalExecuteDamage(), ie.totalOdynsFuryDamage(), ie.totalFuriousSlashDamage(),
                                   ie.totalBrutalHaymakerDamage(), ie.totalKJBurningWishDamage(), ie.totalHiddenSatyrDamage(),
                                   ie.totalOdynsGloryDamage(), ie.totalHelyasScornDamage(), ie.totalChargeDamage(), ie.totalWhirlWindDamage(),
                                   ie.totalHeroicLeapDamage());
      TombData td5 = new TombData("Sisters of the Moon", se.totalRagingBlowDamage(), se.totalRampageDamage(), se.totalBloodThirstDamage(),
                                   se.totalMeleeDamage(), se.totalExecuteDamage(), se.totalOdynsFuryDamage(), se.totalFuriousSlashDamage(),
                                   se.totalBrutalHaymakerDamage(), se.totalKJBurningWishDamage(), se.totalHiddenSatyrDamage(),
                                   se.totalOdynsGloryDamage(), se.totalHelyasScornDamage(), se.totalChargeDamage(), se.totalWhirlWindDamage(),
                                   se.totalHeroicLeapDamage());
      TombData td6 = new TombData("Desolate Host", dhe.totalRagingBlowDamage(), dhe.totalRampageDamage(), dhe.totalBloodThirstDamage(),
                                   dhe.totalMeleeDamage(), dhe.totalExecuteDamage(), dhe.totalOdynsFuryDamage(), dhe.totalFuriousSlashDamage(),
                                   dhe.totalBrutalHaymakerDamage(), dhe.totalKJBurningWishDamage(), dhe.totalHiddenSatyrDamage(),
                                   dhe.totalOdynsGloryDamage(), dhe.totalHelyasScornDamage(), dhe.totalChargeDamage(), dhe.totalWhirlWindDamage(),
                                   dhe.totalHeroicLeapDamage());
      TombData td7 = new TombData("Maiden of Vigilance", me.totalRagingBlowDamage(), me.totalRampageDamage(), me.totalBloodThirstDamage(),
                                   me.totalMeleeDamage(), me.totalExecuteDamage(), me.totalOdynsFuryDamage(), me.totalFuriousSlashDamage(),
                                   me.totalBrutalHaymakerDamage(), me.totalKJBurningWishDamage(), me.totalHiddenSatyrDamage(),
                                   me.totalOdynsGloryDamage(), me.totalHelyasScornDamage(), me.totalChargeDamage(), me.totalWhirlWindDamage(),
                                   me.totalHeroicLeapDamage());
      TombData td8 = new TombData("Fallen Avatar", ae.totalRagingBlowDamage(), ae.totalRampageDamage(), ae.totalBloodThirstDamage(),
                                   ae.totalMeleeDamage(), ae.totalExecuteDamage(), ae.totalOdynsFuryDamage(), ae.totalFuriousSlashDamage(),
                                   ae.totalBrutalHaymakerDamage(), ae.totalKJBurningWishDamage(), ae.totalHiddenSatyrDamage(),
                                   ae.totalOdynsGloryDamage(), ae.totalHelyasScornDamage(), ae.totalChargeDamage(), ae.totalWhirlWindDamage(),
                                   ae.totalHeroicLeapDamage());
      TombData td9 = new TombData("Kil'Jaeden", kje.totalRagingBlowDamage(), kje.totalRampageDamage(), kje.totalBloodThirstDamage(),
                                   kje.totalMeleeDamage(), kje.totalExecuteDamage(), kje.totalOdynsFuryDamage(), kje.totalFuriousSlashDamage(),
                                   kje.totalBrutalHaymakerDamage(), kje.totalKJBurningWishDamage(), kje.totalHiddenSatyrDamage(),
                                   kje.totalOdynsGloryDamage(), kje.totalHelyasScornDamage(), kje.totalChargeDamage(), kje.totalWhirlWindDamage(),
                                   kje.totalHeroicLeapDamage());
      PlayerSpellsElements pse1 = new PlayerSpellsElements("Element", ati.getRagingID(), ati.getRampageID(), ati.getBloodThirstID(),
                                                            ati.getMeleeID(), ati.getExecuteID(), ati.getOdynsFuryID(), ati.getFuriousSlashID(),
                                                            ati.getBrutalHaymakerID(), ati.getKJWishID(), ati.getHiddenSatyrID(), ati.getOdynGloryID(),
                                                            ati.getHelyaScornID(), ati.getChargeID(), ati.getWhirlwindID(), ati.getHeroicLeapID());
      PlayerSpellsHits psc1 = new PlayerSpellsHits("Goroth Hits", gcc.ragingBlow(), gcc.rampage(), gcc.bloodthirst(), gcc.melee(), gcc.execute(),
                                                     gcc.odynsFury(), gcc.furiousSlash(), gcc.brutalHaymaker(), gcc.kjWish(), gcc.hiddenSatyr(),
                                                     gcc.odynsGlory(), gcc.helyasScorn(), gcc.charge(), gcc.whirlwind(), gcc.heroicLeap());                                            
      PlayerSpellsHits psc2 = new PlayerSpellsHits("Harjatan Hits", hcc.ragingBlow(), hcc.rampage(), hcc.bloodthirst(), hcc.melee(), hcc.execute(),
                                                     hcc.odynsFury(), hcc.furiousSlash(), hcc.brutalHaymaker(), hcc.kjWish(), hcc.hiddenSatyr(),
                                                     hcc.odynsGlory(), hcc.helyasScorn(), hcc.charge(), hcc.whirlwind(), hcc.heroicLeap());                                            
      PlayerSpellsHits psc3 = new PlayerSpellsHits("Mistress Sassz'ine Hits", mcc.ragingBlow(), mcc.rampage(), mcc.bloodthirst(), mcc.melee(), mcc.execute(),
                                                     mcc.odynsFury(), mcc.furiousSlash(), mcc.brutalHaymaker(), mcc.kjWish(), mcc.hiddenSatyr(),
                                                     mcc.odynsGlory(), mcc.helyasScorn(), mcc.charge(), mcc.whirlwind(), mcc.heroicLeap());                                                                                                                                                                                                                                      
      PlayerSpellsHits psc4 = new PlayerSpellsHits("Inquisition Hits", icc.ragingBlow(), icc.rampage(), icc.bloodthirst(), icc.melee(), icc.execute(),
                                                     icc.odynsFury(), icc.furiousSlash(), icc.brutalHaymaker(), icc.kjWish(), icc.hiddenSatyr(),
                                                     icc.odynsGlory(), icc.helyasScorn(), icc.charge(), icc.whirlwind(), icc.heroicLeap());
      PlayerSpellsHits psc5 = new PlayerSpellsHits("Sisters of the Moon Hits", scc.ragingBlow(), scc.rampage(), scc.bloodthirst(), scc.melee(), scc.execute(),
                                                     scc.odynsFury(), scc.furiousSlash(), scc.brutalHaymaker(), scc.kjWish(), scc.hiddenSatyr(),
                                                     scc.odynsGlory(), scc.helyasScorn(), scc.charge(), scc.whirlwind(), scc.heroicLeap());
      PlayerSpellsHits psc6 = new PlayerSpellsHits("Desolate Host Hits", dhcc.ragingBlow(), dhcc.rampage(), dhcc.bloodthirst(), dhcc.melee(), dhcc.execute(),
                                                     dhcc.odynsFury(), dhcc.furiousSlash(), dhcc.brutalHaymaker(), dhcc.kjWish(), dhcc.hiddenSatyr(),
                                                     dhcc.odynsGlory(), dhcc.helyasScorn(), dhcc.charge(), dhcc.whirlwind(), dhcc.heroicLeap());
      PlayerSpellsHits psc7 = new PlayerSpellsHits("Maiden Hits", mvcc.ragingBlow(), mvcc.rampage(), mvcc.bloodthirst(), mvcc.melee(), mvcc.execute(),
                                                     mvcc.odynsFury(), mvcc.furiousSlash(), mvcc.brutalHaymaker(), mvcc.kjWish(), mvcc.hiddenSatyr(),
                                                     mvcc.odynsGlory(), mvcc.helyasScorn(), mvcc.charge(), mvcc.whirlwind(), mvcc.heroicLeap());
      PlayerSpellsHits psc8 = new PlayerSpellsHits("Fallen Avatar Hits", acc.ragingBlow(), acc.rampage(), acc.bloodthirst(), acc.melee(), acc.execute(),
                                                     acc.odynsFury(), acc.furiousSlash(), acc.brutalHaymaker(), acc.kjWish(), acc.hiddenSatyr(),
                                                     acc.odynsGlory(), acc.helyasScorn(), acc.charge(), acc.whirlwind(), acc.heroicLeap());
      PlayerSpellsHits psc9 = new PlayerSpellsHits("Kil'Jaeden Hits", kjcc.ragingBlow(), kjcc.rampage(), kjcc.bloodthirst(), kjcc.melee(), kjcc.execute(),
                                                     kjcc.odynsFury(), kjcc.furiousSlash(), kjcc.brutalHaymaker(), kjcc.kjWish(), kjcc.hiddenSatyr(),
                                                     kjcc.odynsGlory(), kjcc.helyasScorn(), kjcc.charge(), kjcc.whirlwind(), kjcc.heroicLeap());
		List<TombData> td = new ArrayList<TombData>();
      td.add(td1);
      td.add(td2);
      td.add(td3);
      td.add(td4);
      td.add(td5);
      td.add(td6);
      td.add(td7);
      td.add(td8);
      td.add(td9);
      List<PlayerSpellsHits> psc = new ArrayList<PlayerSpellsHits>();
      psc.add(psc1);
      psc.add(psc2);
      psc.add(psc3);
      psc.add(psc4);
      psc.add(psc5);
      psc.add(psc6);
      psc.add(psc7);
      psc.add(psc8);
      psc.add(psc9);
      List<PlayerSpellsElements> pse = new ArrayList<PlayerSpellsElements>();
      pse.add(pse1);
      
		
		FileWriter fileWriter = null;
				
		try {
			fileWriter = new FileWriter("TombData.csv");

			fileWriter.append(FILE_HEADER.toString());

			fileWriter.append(NEW_LINE_SEPARATOR);

			for (TombData tombdata : td) {
				fileWriter.append(String.valueOf(tombdata.getBossName()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getRagingBlow()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getRampage()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getBloodthirst()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getMelee()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getExecute()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getOdynsFury()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getFuriousSlash()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getBrutalHaymaker()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getKJBurningWish()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getHiddenSatyr()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getOdynsGlory()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getHelyasScorn()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getCharge()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getWhirlwind()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(tombdata.getHeroicLeap()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(NEW_LINE_SEPARATOR);
			}
         
         for (PlayerSpellsHits player : psc) {
				fileWriter.append(String.valueOf(player.getHit()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getRagingHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getRampageHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getBloodThirstHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getMeleeHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getExecuteHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getOdynsFuryHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getFuriousSlashHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getBrutalHaymakerHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getKJWishHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getHiddenSatyrHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getOdynGloryHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getHelyaScornHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getChargeHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getWhirlwindHits()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getHeroicLeapHits()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(NEW_LINE_SEPARATOR);
			}
         
         for(PlayerSpellsElements player : pse) {
            fileWriter.append(String.valueOf(player.getElement()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(player.getRagingElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getRampageElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getBloodThirstElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getMeleeElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getExecuteElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getOdynsFuryElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getFuriousSlashElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getBrutalHaymakerElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getKJWishElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getHiddenSatyrElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getOdynGloryElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getHelyaScornElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getChargeElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getWhirlwindElement()));
				fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(player.getHeroicLeapElement()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			System.out.println("CSV file created");
			
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter");
			e.printStackTrace();
		} finally {
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter");
                e.printStackTrace();
			}
			
		}
	}
}
