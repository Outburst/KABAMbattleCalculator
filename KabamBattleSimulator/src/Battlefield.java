
public class Battlefield {
	final double WEAK = .9;
	final double STRONG = 1.4;
	
	public void battle(ArmyGroup attacker, ArmyGroup defender){
		double AAtkModifier = attacker.atkMod;
		double AHlthModifier = attacker.hlthMod;
		double DAtkModifier = defender.atkMod;
		double DHlthModifier = defender.hlthMod;	
	
		double AGgroup = attacker.ground;
		double AMgroup = attacker.mount;
		double ARgroup = attacker.range;
		double DGgroup = defender.ground;
		double DMgroup = defender.mount;
		double DRgroup = defender.range;
		if(AMgroup != 0 || AGgroup != 0 || ARgroup != 0){
			System.out.println("modifiers: " + AAtkModifier + " " + DHlthModifier);
			//the troops duke it out in their strongest matchups
			DMgroup = DMgroup * DHlthModifier - (AGgroup * (AAtkModifier * STRONG));
			DGgroup = DGgroup * DHlthModifier - (ARgroup * (AAtkModifier * STRONG));
			DRgroup = DRgroup * DHlthModifier - (AMgroup * (AAtkModifier * STRONG));
			System.out.println("(STRONG)modified defender post battle results: " + DMgroup + " " + DGgroup + " " + DRgroup);
			//lets see how they did...
			if(DMgroup > 0){
				AGgroup = 0;
			} else if(DMgroup < 0){
				AGgroup = (DMgroup * -1) / (AAtkModifier * STRONG);	
				DMgroup = 0;
			}
			if(DGgroup > 0){
				ARgroup = 0;
			} else if(DGgroup < 0){
				ARgroup = (DGgroup * -1) / (AAtkModifier * STRONG);	
				DGgroup = 0;
			}
			if(DRgroup > 0){
				AMgroup = 0;
			} else if(DRgroup < 0){
				AMgroup = (DRgroup * -1) / (AAtkModifier * STRONG);	
				DRgroup = 0;
			}
			System.out.println("(STRONG) reduced attacker post battle counts: " + AMgroup + " " + AGgroup + " " + ARgroup);
			
			//if there are any survivors, we move on from fighting strong matchups to neutral matchups
			if(DMgroup > 0){
				DMgroup = DMgroup - (AMgroup * AAtkModifier);
			}
			if(DGgroup > 0){
				DGgroup = DGgroup - (AGgroup * AAtkModifier);
			}
			if(DRgroup > 0){
				DRgroup = DRgroup - (ARgroup * AAtkModifier);
			}
			System.out.println("(NUETRAL)modified defender post battle results: " + DMgroup + " " + DGgroup + " " + DRgroup);
			//again, lets see how they did
			if(DMgroup > 0){
				AMgroup = 0;
			} else if(DMgroup < 0){
				AMgroup = (DMgroup * -1) / AAtkModifier;
				DMgroup = 0;
			}
			if(DGgroup > 0){
				AGgroup = 0;
			} else if (DGgroup < 0){
				AGgroup = (DGgroup * -1) / AAtkModifier;	
				DGgroup = 0;
			}
			if(DRgroup > 0){
				ARgroup = 0;
			} else if (DRgroup < 0){
				ARgroup = (DRgroup * -1) / AAtkModifier;
				DRgroup = 0;
			}
			System.out.println("(NUETRAL)reduced attacker post battle counts: " + AMgroup + " " + AGgroup + " " + ARgroup);
			
			//finally, if after all that someone is still alive we move onto fighting weak match ups
			if(DMgroup > 0){
				DMgroup = DMgroup - (ARgroup * (AAtkModifier * WEAK));
			}
			if(DGgroup > 0){
				DGgroup = DGgroup - (AMgroup * (AAtkModifier * WEAK));
			}
			if(DRgroup > 0){
				DRgroup = DRgroup - (AGgroup * (AAtkModifier * WEAK));
			}
			System.out.println("(WEAK)modified defender post battle results: " + DMgroup + " " + DGgroup + " " + DRgroup);
			
			//one last round of seeing how the fights went.
			if(DMgroup > 0){
				ARgroup = 0;
			} else if(DMgroup < 0){
				ARgroup = (DMgroup * -1) / (AAtkModifier * WEAK);
				DMgroup = 0;
			}
			if(DGgroup > 0){
				AMgroup = 0;
			} else if (DGgroup < 0){
				AMgroup = (DGgroup * -1) / (AAtkModifier * WEAK);
				DGgroup = 0;
			}
			if(DRgroup > 0){
				AGgroup = 0;
			} else if (DRgroup < 0){
				AGgroup = (DRgroup * -1) / (AAtkModifier * WEAK);
				DRgroup = 0;
			}
			System.out.println("(WEAK)reduced attacker post battle counts: " + AMgroup + " " + AGgroup + " " + ARgroup);

			attacker.setGround((int)AGgroup);
			attacker.setRange((int)ARgroup);
			attacker.setMount((int)AMgroup);
			defender.setGround((int)(DGgroup/DHlthModifier));
			defender.setRange((int)(DRgroup/DHlthModifier));
			defender.setMount((int)(DMgroup/DHlthModifier));
		}
	}	
}
