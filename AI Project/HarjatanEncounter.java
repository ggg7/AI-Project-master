import java.io.*;

public class HarjatanEncounter implements Bosses
{
   int RBD;  
   int MD;   
   int RD;   
   int BTD;  
   int ED;  
   int OFD;  
   int FSD;
   int BHD;
   int KJBWD;
   int SMD;
   int OGD;  
   int HSD;
   int CD;
   int WWD;
   int HLD;
   
   public HarjatanEncounter(){}
   
   public int totalRagingBlowDamage()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int rbD = 0;
         RBD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Raging Blow"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] rB = line.split(",");
                     rbD = Integer.parseInt(rB[25]);
                     RBD += rbD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return RBD;      
   }
   
   public int totalRampageDamage()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int rD = 0;
         RD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Rampage"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] r = line.split(",");
                     rD = Integer.parseInt(r[25]);
                     RD += rD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return RD;      
   }
   
   public int totalBloodThirstDamage()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int btD = 0;
         BTD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Bloodthirst"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] r = line.split(",");
                     btD = Integer.parseInt(r[25]);
                     BTD += btD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return BTD;      
   }
   
   public int totalMeleeDamage()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int mD = 0;
         MD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SWING_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
               {
                  String[] m = line.split(",");
                  mD = Integer.parseInt(m[22]);
                  MD += mD;

               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return MD;      
   }
   
   public int totalExecuteDamage()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int eD = 0;
         ED = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Execute"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] e = line.split(",");
                     eD = Integer.parseInt(e[25]);
                     ED += eD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return ED;
   }
   public int totalOdynsFuryDamage()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int ofD = 0;
         OFD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\"") | line.contains("SPELL_PERIODIC_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Odyn's Fury"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] of = line.split(",");
                     ofD = Integer.parseInt(of[25]);
                     OFD += ofD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return OFD;
   }
   public int totalFuriousSlashDamage()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int fsD = 0;
         FSD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Furious Slash"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] fs = line.split(",");
                     fsD = Integer.parseInt(fs[25]);
                     FSD += fsD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return FSD;
   }
   public int totalBrutalHaymakerDamage()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int bhD = 0;
         BHD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Brutal Haymaker"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] bh = line.split(",");
                     bhD = Integer.parseInt(bh[25]);
                     BHD += bhD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return BHD;
   }
   public int totalKJBurningWishDamage()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int kjbwD = 0;
         KJBWD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Kil'jaeden's Burning Wish"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] kjbw = line.split(",");
                     kjbwD = Integer.parseInt(kjbw[25]);
                     KJBWD += kjbwD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return KJBWD;
   }
   public int totalHiddenSatyrDamage()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int smD = 0;
         SMD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Mark of the Hidden Satyr"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] hs = line.split(",");
                     smD = Integer.parseInt(hs[25]);
                     SMD += smD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return SMD;
   }
   public int totalOdynsGloryDamage()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int ogD = 0;
         OGD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Odyn's Glory"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] og = line.split(",");
                     ogD = Integer.parseInt(og[25]);
                     OGD += ogD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return OGD;
   }
   public int totalHelyasScornDamage()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int hsD = 0;
         HSD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Helya's Scorn"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] hs = line.split(",");
                     hsD = Integer.parseInt(hs[25]);
                     HSD += hsD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return HSD;
   }
   public int totalChargeDamage()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int cD = 0;
         CD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Charge"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] c = line.split(",");
                     cD = Integer.parseInt(c[25]);
                     CD += cD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return CD;
   }
   
   public int totalWhirlWindDamage()
   {
       try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int wwD = 0;
         WWD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Whirlwind"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] ww = line.split(",");
                     wwD = Integer.parseInt(ww[25]);
                     WWD += wwD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return WWD;     
   }
   
   public int totalHeroicLeapDamage()
   { 
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         int hlD = 0;
         HLD = 0;
         
         while((line = br.readLine()) != null)
         {

            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Heroic Leap"))
               {
                  if(line.contains("Harjatan") | line.contains("Razorjaw Wavemender"))
                  {
                     String[] hl = line.split(",");
                     hlD = Integer.parseInt(hl[25]);
                     HLD += hlD;

                  }
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return HLD;     
   }
   
   public int totalDamageDealt()
   {
      int total = totalRagingBlowDamage() + totalRampageDamage() + totalBloodThirstDamage() + totalMeleeDamage()
               + totalExecuteDamage() + totalOdynsFuryDamage() + totalFuriousSlashDamage() + totalBrutalHaymakerDamage()
               +  totalKJBurningWishDamage() + totalHiddenSatyrDamage() + totalOdynsGloryDamage() + totalHelyasScornDamage()
               + totalChargeDamage() + totalWhirlWindDamage() + totalHeroicLeapDamage();
      
      return total;
   }
   
   public String harjatanDisplay()
   {  
      System.out.println("Harjatan/Razorjaw Wavemender damage "
             + "\nRaging Blow: " + totalRagingBlowDamage()
             + "\nRampage: " + totalRampageDamage()
             + "\nBloodthirst: " + totalBloodThirstDamage()
             + "\nMelee: " + totalMeleeDamage()
             + "\nExecute: " + totalExecuteDamage()
             + "\nOdyn's Fury: " + totalOdynsFuryDamage()
             + "\nFurious Slash: " + totalFuriousSlashDamage()
             + "\nBrutal Haymaker: " + totalBrutalHaymakerDamage()
             + "\nKil'Jaeden's Burning Wish: " + totalKJBurningWishDamage()
             + "\nMark of the Hidden Satyr: " + totalHiddenSatyrDamage()
             + "\nOdyn's Glory: " + totalOdynsGloryDamage()
             + "\nHelya's Scorn: " + totalHelyasScornDamage()
             + "\nCharge: " + totalChargeDamage()
             + "\nWhirlwind: " + totalWhirlWindDamage()
             + "\nHeroic Leap: " + totalHeroicLeapDamage());
      
      System.out.println("");
      return "The total damage dealt to Harjatan and the Razorjaw Wavemenders was " + totalDamageDealt() + ".\nProceeding to third boss completed through this run.\n";
   }
}