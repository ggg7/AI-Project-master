public class PlayerSpellsHits
{
   String hit;
   int ragingBlow;
   int rampage;
   int bloodThirst;
   int melee;
   int execute;
   int odynsFury;
   int furiousSlash;
   int brutalHaymaker;
   int kjWish;
   int hiddenSatyr;
   int odynsGlory;
   int helyasScorn;
   int charge;
   int whirlwind;
   int heroicLeap;
   
   public PlayerSpellsHits(String hi, int rb, int r, int bt, int m, int ex,
                               int of, int fs, int bh, int kj, int hs, int og,
                               int hls, int c, int ww, int hl){
       hit = hi;
       ragingBlow = rb;
       rampage = r;
       bloodThirst = bt;
       melee = m;
       execute = ex;
       odynsFury = of;
       furiousSlash = fs;
       brutalHaymaker = bh;
       kjWish = kj;
       hiddenSatyr = hs;
       odynsGlory = og;
       helyasScorn = hls;
       charge = c;
       whirlwind = ww;
       heroicLeap = hl;
                               
   }
   
   public String getHit()
   {
      return hit;
   }
   
   public int getRagingHits()
   {
      return ragingBlow;
   }
   
   public int getRampageHits()
   {
      return rampage;
   }
   
   public int getBloodThirstHits()
   {
      return bloodThirst;
   }
   
   public int getMeleeHits()
   {
      return melee;
   }
   
   public int getExecuteHits()
   {
      return execute;
   }
   
   public int getOdynsFuryHits()
   {
      return odynsFury;
   }
   
   public int getFuriousSlashHits()
   {
      return furiousSlash;
   }
   
   public int getBrutalHaymakerHits()
   {
      return brutalHaymaker;
   }
   
   public int getKJWishHits()
   {
      return kjWish;
   }
   
   public int getHiddenSatyrHits()
   {
      return hiddenSatyr;
   }
   
   public int getOdynGloryHits()
   {
      return odynsGlory;
   }
   
   public int getHelyaScornHits()
   {
      return helyasScorn;
   }
   
   public int getChargeHits()
   {
      return charge;
   }
   
   public int getWhirlwindHits()
   {
      return whirlwind;
   }
   
   public int getHeroicLeapHits()
   {
      return heroicLeap;
   }
}