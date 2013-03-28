
public class ArmyGroup {
	int mount =0, ground=0, range=0, total=0;
	double vigor, honedWeps, hero, atkBuff, hlthBuff;
	double atkMod = 1;
	double hlthMod = 1;
	
	public ArmyGroup(){
		
	}
	public void setMount(int count){
		mount = count;
		total = mount + ground + range;
	}
	public void setGround(int count){
		ground = count;
		total = mount + ground + range;
	}
	public void setRange(int count){
		range = count;
		total = mount + ground + range;
	}
	public void setVigor(int level){
		vigor = level *.05;
		hlthMod += vigor;
	}
	public void setHonedWeps(int level){
		honedWeps = level * .05;
		atkMod += honedWeps; 
	}
	public void setHero(int level){
		hero = level * .05;
		atkMod += hero;
		hlthMod += hero;
	}
}
