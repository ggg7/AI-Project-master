import java.io.*;

public class InquisitionHitCounter
{
   int rbi;
   int ri;
   int bti;
   int mi;
   int ei;
   int ofi;
   int fsi;
   int bhi;
   int kji;
   int hsmi;
   int ogi;
   int hsi;
   int ci;
   int wwi;
   int hli;
   
   public InquisitionHitCounter(){}
   
   public int ragingBlow()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Raging Blow"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     rbi++;
                  }
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
   
   public int rampage()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Rampage"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     ri++;
                  }
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
   
   public int bloodthirst()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Bloodthirst"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     bti++;
                  }
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
   
   public int melee()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SWING_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            { 
               if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
               {
                  mi++;
               }
            }
         }
      br.close();   
      }
      catch (Exception e) 
      {  System.out.println(e);
      }
      
      return mi;
   }
   
   public int execute()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Execute"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     ei++;
                  }
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
   
   public int odynsFury()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Odyn's Fury"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     ofi++;
                  }
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
   
   public int furiousSlash()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Furious Slash"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     fsi++;
                  }
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
   
   public int brutalHaymaker()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Brutal Haymaker"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     bhi++;
                  }
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
   
   public int kjWish()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Kil'jaeden's Burning Wish"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     kji++;
                  }
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
   
   public int hiddenSatyr()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Mark of the Hidden Satyr"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     hsmi++;
                  }
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
   
   public int odynsGlory()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Odyn's Glory"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     ogi++;
                  }
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
   
   public int helyasScorn()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Helya's Scorn"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     hsi++;
                  }
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
   
   public int charge()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Charge"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     ci++;
                  }
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
   
   public int whirlwind()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Whirlwind"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     wwi++;
                  }
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
   
   public int heroicLeap()
   {
      try{
         FileReader fr = new FileReader("Tomb2.txt");
         BufferedReader br = new BufferedReader(fr);
         
         String line;
         
         
         while((line = br.readLine()) != null)
         {
            if(line.contains("SPELL_DAMAGE,Player-157-067A545E,\"Larryg-DemonSoul\""))
            {
               if(line.contains("Heroic Leap"))
               {
                  if(line.contains("Belac") | line.contains("Atrigan") | line.contains("Tormented Soul"))
                  {
                     hli++;
                  }
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