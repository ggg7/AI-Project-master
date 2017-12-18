import java.io.*;

public class AbilityTypeID
{
   String physical = "0x1";
   String fire = "0x4";
   String shadow = "0x20";
   String rbi;
   String ri;
   String bti;
   String mi;
   String ei;
   String ofi;
   String fsi;
   String bhi;
   String kji;
   String hsmi;
   String ogi;
   String hsi;
   String ci;
   String wwi;
   String hli;
   
   public AbilityTypeID(){}
   
   public String getRagingID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Raging Blow"))
            {
               String[] rb = line.split(",");
               rbi = rb[11];
               if(rbi.equals(physical))
               {
                  rbi = "Physical";
               }
               if(rbi.equals(fire))
               {
                  rbi = "Fire";
               }
               if(rbi.equals(shadow))
               {
                  rbi = "Shadow";
               }
               
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return rbi;
   }
   
   public String getRampageID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Rampage"))
            {
               String[] rb = line.split(",");
               ri = rb[11];
               if(ri.equals(physical))
               {
                  ri = "Physical";
               }
               if(ri.equals(fire))
               {
                  ri = "Fire";
               }
               if(ri.equals(shadow))
               {
                  ri = "Shadow";
               }
               
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return ri;
   }
   
   public String getBloodThirstID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Bloodthirst"))
            {
               String[] rb = line.split(",");
               bti = rb[11];
               if(bti.equals(physical))
               {
                  bti = "Physical";
               }
               if(bti.equals(fire))
               {
                  bti = "Fire";
               }
               if(bti.equals(shadow))
               {
                  bti = "Shadow";
               }
               
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return bti;
   }
   
   public String getMeleeID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SWING_DAMAGE"))
            {
               mi = "Physical";
            } 
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return mi;
   }
   
   public String getExecuteID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Execute"))
            {
               String[] rb = line.split(",");
               ei = rb[11];
               if(ei.equals(physical))
               {
                  ei = "Physical";
               }
               if(ei.equals(fire))
               {
                  ei = "Fire";
               }
               if(ei.equals(shadow))
               {
                  ei = "Shadow";
               }
               
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return ei;
   }
    
   public String getOdynsFuryID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Odyn's Fury"))
            {
               String[] rb = line.split(",");
               ofi = rb[11];
               if(ofi.equals(physical))
               {
                  ofi = "Physical";
               }
               if(ofi.equals(fire))
               {
                  ofi = "Fire";
               }
               if(ofi.equals(shadow))
               {
                  ofi = "Shadow";
               }
               
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return ofi;
   }
   
   public String getFuriousSlashID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Furious Slash"))
            {
               String[] rb = line.split(",");
               fsi = rb[11];
               if(fsi.equals(physical))
               {
                  fsi = "Physical";
               }
               if(fsi.equals(fire))
               {
                  fsi = "Fire";
               }
               if(fsi.equals(shadow))
               {
                  fsi = "Shadow";
               }
               
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return fsi;
   }
   
   public String getBrutalHaymakerID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Brutal Haymaker"))
            {
               String[] rb = line.split(",");
               bhi = rb[11];
               if(bhi.equals(physical))
               {
                  bhi = "Physical";
               }
               if(bhi.equals(fire))
               {
                  bhi = "Fire";
               }
               if(bhi.equals(shadow))
               {
                  bhi = "Shadow";
               }
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return bhi;
   }
   
   public String getKJWishID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Kil'jaeden's Burning Wish"))
            {
               String[] rb = line.split(",");
               kji = rb[11];
               if(kji.equals(physical))
               {
                  kji = "Physical";
               }
               if(kji.equals(fire))
               {
                  kji = "Fire";
               }
               if(kji.equals(shadow))
               {
                  kji = "Shadow";
               }
               
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return kji;
   }
   
   public String getHiddenSatyrID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Mark of the Hidden Satyr"))
            {
               String[] rb = line.split(",");
               hsmi = rb[11];
               if(hsmi.equals(physical))
               {
                  hsmi = "Physical";
               }
               if(hsmi.equals(fire))
               {
                  hsmi = "Fire";
               }
               if(hsmi.equals(shadow))
               {
                  hsmi = "Shadow";
               }
               
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return hsmi;
   }
   
   public String getOdynGloryID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Odyn's Glory"))
            {
               String[] rb = line.split(",");
               ogi = rb[11];
               if(ogi.equals(physical))
               {
                  ogi = "Physical";
               }
               if(ogi.equals(fire))
               {
                  ogi = "Fire";
               }
               if(ogi.equals(shadow))
               {
                  ogi = "Shadow";
               }
               
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return ogi;
   }
   
   public String getHelyaScornID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Helya's Scorn"))
            {
               String[] rb = line.split(",");
               hsi = rb[11];
               if(hsi.equals(physical))
               {
                  hsi = "Physical";
               }
               if(hsi.equals(fire))
               {
                  hsi = "Fire";
               }
               if(hsi.equals(shadow))
               {
                  hsi = "Shadow";
               }
               
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return hsi;
   }
   
   public String getChargeID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Charge"))
            {
               String[] rb = line.split(",");
               ci = rb[11];
               if(ci.equals(physical))
               {
                  ci = "Physical";
               }
               if(ci.equals(fire))
               {
                  ci = "Fire";
               }
               
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return ci;
   }
   
   public String getWhirlwindID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Whirlwind"))
            {
               String[] rb = line.split(",");
               wwi = rb[11];
               if(wwi.equals(physical))
               {
                  wwi = "Physical";
               }
               if(wwi.equals(fire))
               {
                  wwi = "Fire";
               }
               
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return wwi;
   }
   
   public String getHeroicLeapID()
   {
      try{
         FileReader fr = new FileReader("Tomb1.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("Heroic Leap"))
            {
               String[] rb = line.split(",");
               hli = rb[11];
               if(hli.equals(physical))
               {
                  hli = "Physical";
               }
               if(hli.equals(fire))
               {
                  hli = "Fire";
               }
               
            }  
         }
         br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      return hli;
   }
}