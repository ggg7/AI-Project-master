public class TombData {
	
	private String bossName;
   private int ragingblow;
   private int rampage;
   private int bloodthirst;
   private int melee;
   private int execute;
   private int odynfury;
   private int furiousslash;
   private int brutalhaymaker;
   private int kjburningwish;
   private int hiddensatyr;
   private int odynglory;
   private int helyascorn;
   private int charge;
   private int whirlwind;
   private int heroicleap;
   
	

	public TombData(String bossName, int ragingblow, int rampage, int bloodthirst,
      int melee, int execute, int odynfury, int furiousslash, int brutalhaymaker,
      int kjburningwish, int hiddensatyr, int odynglory, int helyascorn, int charge,
      int whirlwind, int heroicleap) 
   {
		super();
		this.bossName = bossName;
		this.ragingblow = ragingblow;
		this.rampage = rampage;
		this.bloodthirst = bloodthirst;
		this.melee = melee;
      this.execute = execute;
      this.odynfury = odynfury;
      this.furiousslash = furiousslash;
      this.brutalhaymaker = brutalhaymaker;
      this.kjburningwish = kjburningwish;
      this.hiddensatyr = hiddensatyr;
      this.odynglory = odynglory;
      this.helyascorn = helyascorn;
      this.charge = charge;
      this.whirlwind = whirlwind;
      this.heroicleap = heroicleap;
	}

	public String getBossName() {
		return bossName;
	}

	public void setBossName(String bossName) {
		this.bossName = bossName;
	}
   
   public int getRagingBlow() {
		return ragingblow;
	}

	public void setRagingBlow(int ragingblow) {
		this.ragingblow = ragingblow;
	}
   
   public int getRampage() {
		return rampage;
	}

	public void setRampage(int rampage) {
		this.rampage = rampage;
	}
   
   public int getBloodthirst() {
		return bloodthirst;
	}

	public void setBloodthirst(int bloodthirst) {
		this.bloodthirst = bloodthirst;
	}
   
   public int getMelee() {
		return melee;
	}

	public void setMelee(int melee) {
		this.melee = melee;
	}
   
   public int getExecute() {
		return execute;
	}

	public void setExecute(int execute) {
		this.execute = execute;
	}
   
   public int getOdynsFury() {
		return odynfury;
	}

	public void setOdynsFury(int odynfury) {
		this.odynfury = odynfury;
	}
   
   public int getFuriousSlash() {
		return furiousslash;
	}

	public void setFurious(int furiousslash) {
		this.furiousslash = furiousslash;
	}
   
   public int getBrutalHaymaker() {
		return brutalhaymaker;
	}

	public void setBrutalHaymaker(int brutalhaymaker) {
		this.brutalhaymaker = brutalhaymaker;
	}
   
   public int getKJBurningWish() {
		return kjburningwish;
	}

	public void setKJBurningWish(int kjburningwish) {
		this.kjburningwish = kjburningwish;
	}
   
   public int getHiddenSatyr() {
		return rampage;
	}

	public void setHiddenSatyr(int hiddensatyr) {
		this.hiddensatyr = hiddensatyr;
	}
   
   public int getOdynsGlory() {
		return odynglory;
	}

	public void setOdynsGlory(int odynglory) {
		this.odynglory = odynglory;
	}
   
   public int getHelyasScorn() {
		return helyascorn;
	}

	public void setHelyasScorn(int helyascorn) {
		this.helyascorn = helyascorn;
	}
   
   public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}
   
   public int getWhirlwind() {
		return whirlwind;
	}

	public void setWhirlwind(int whirlwind) {
		this.whirlwind = whirlwind;
	}
   
   public int getHeroicLeap() {
		return heroicleap;
	}

	public void setHeroicLeap(int heroicleap) {
		this.heroicleap = heroicleap;
	}

	public String toString() {
		return "Boss [Name = " + bossName + ", Raging Blow = " + ragingblow + ", Rampage = + " + rampage + ", Bloodthirst = " + bloodthirst 
            + ", Melee = " + melee + ", Execute = " + execute + "\nOdyn's Fury = " + odynfury + ", Furious Slash = " + furiousslash 
            + ", Brutal Haymaker = " + brutalhaymaker + ", Kil'Jaeden's BurningWish = " + kjburningwish 
            + ", Mark of the Hidden Satyr = " + hiddensatyr + "\nOdyn's Glory = " + odynglory + ", Helya's Scorn = "+ helyascorn 
            + ", Charge = " + charge + ", Whirlwind = " + whirlwind + ", Heroic Leap = " + heroicleap + "]\n";
	}
}
