public class PlayerSpellsElements
{
   String element;
   String ragingBlow;
   String rampage;
   String bloodThirst;
   String melee;
   String execute;
   String odynsFury;
   String furiousSlash;
   String brutalHaymaker;
   String kjWish;
   String hiddenSatyr;
   String odynsGlory;
   String helyasScorn;
   String charge;
   String whirlwind;
   String heroicLeap;
   
   public PlayerSpellsElements(String e, String rb, String r, String bt, String m, String ex,
                               String of, String fs, String bh, String kj, String hs, String og,
                               String hls, String c, String ww, String hl){
       element = e;
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
   
   public String getElement()
   {
      return element;
   }
   
   public String getRagingElement()
   {
      return ragingBlow;
   }
   
   public String getRampageElement()
   {
      return rampage;
   }
   
   public String getBloodThirstElement()
   {
      return bloodThirst;
   }
   
   public String getMeleeElement()
   {
      return melee;
   }
   
   public String getExecuteElement()
   {
      return execute;
   }
   
   public String getOdynsFuryElement()
   {
      return odynsFury;
   }
   
   public String getFuriousSlashElement()
   {
      return furiousSlash;
   }
   
   public String getBrutalHaymakerElement()
   {
      return brutalHaymaker;
   }
   
   public String getKJWishElement()
   {
      return kjWish;
   }
   
   public String getHiddenSatyrElement()
   {
      return hiddenSatyr;
   }
   
   public String getOdynGloryElement()
   {
      return odynsGlory;
   }
   
   public String getHelyaScornElement()
   {
      return helyasScorn;
   }
   
   public String getChargeElement()
   {
      return charge;
   }
   
   public String getWhirlwindElement()
   {
      return whirlwind;
   }
   
   public String getHeroicLeapElement()
   {
      return heroicLeap;
   }
}