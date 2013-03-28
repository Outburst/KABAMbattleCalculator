
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.*;


@SuppressWarnings("serial")
public class Main extends JPanel implements KeyListener, ActionListener {

	JPanel userWindow;
	JLabel K_AT1G, K_AT1M, K_AT1R, K_AT2G, K_AT2M, K_AT2R, K_AT3G, K_AT3M, K_AT3R,
	K_DT1G, K_DT1M, K_DT1R, K_DT2G, K_DT2M, K_DT2R, K_DT3G, K_DT3M, K_DT3R,
	K_WT1G, K_WT1M, K_WT1R, K_WT2G, K_WT2M, K_WT2R, K_WT3G, K_WT3M, K_WT3R,
	AtkResearchLvl, HlthResearchLvl, HeroLvl; 
	
	JTextField AT1G, AT1M, AT1R, AT2G, AT2M, AT2R, AT3G, AT3M, AT3R,
	DT1G, DT1M, DT1R, DT2G, DT2M, DT2R, DT3G, DT3M, DT3R,
	WT1G, WT1M, WT1R, WT2G, WT2M, WT2R, WT3G, WT3M, WT3R,
	AAtkResearch, AHlthResearch, DAtkResearch, DHlthResearch, AHeroLvl, DHeroLvl;
	
	int Agroup=0, Dgroup=0;


	public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                makeGUI();
            }
        });
    }

	 private static void makeGUI() {

		    
		//Create and set up the window.
			JFrame.setDefaultLookAndFeelDecorated(true);
		    JFrame frame = new JFrame("Kabam Battle Simulator");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    //Add contents to the window.

		    Main application = new Main();
		    frame.setContentPane(application.window());

		    //Display the window.
		    frame.setFocusable(false);
		    frame.setVisible(true);
		    frame.setLayout(null);
		    frame.setLocation(50,50);
		    frame.setSize(630, 600);
		    
		}
	 
	 
	 public JPanel window(){

		userWindow = new JPanel();
		userWindow.setLayout(null);
		userWindow.setFocusable(true);
		 
		JLabel attacker = new JLabel("ATTACKER");
		attacker.setBounds(100,40,100,30);
		JLabel defender = new JLabel("DEFENDER");
		defender.setBounds(350,40,100,30);
		
		//establish column of troop type labels
		JLabel T1M = new JLabel("Tier 1 Mounts:");
		T1M.setBounds(10,100,100,20);
		JLabel T1G = new JLabel("Tier 1 Ground:");
		T1G.setBounds(10,130,100,20);
		JLabel T1R = new JLabel("Tier 1 Ranged:");
		T1R.setBounds(10,160,100,20);
		
		JLabel T2M = new JLabel("Tier 2 Mounts:");
		T2M.setBounds(10,200,100,20);
		JLabel T2G = new JLabel("Tier 2 Ground:");
		T2G.setBounds(10,230,100,20);
		JLabel T2R = new JLabel("Tier 2 Ranged:");
		T2R.setBounds(10,260,100,20);
		
		JLabel T3M = new JLabel("Tier 3 Mounts:");
		T3M.setBounds(10,300,100,20);
		JLabel T3G = new JLabel("Tier 3 Ground:");
		T3G.setBounds(10,330,100,20);
		JLabel T3R = new JLabel("Tier 3 Ranged:");
		T3R.setBounds(10,360,100,20);
		
		AtkResearchLvl = new JLabel("Attack Lvl:");
		AtkResearchLvl.setBounds(10, 400, 100, 20);
		HlthResearchLvl = new JLabel("Health Lvl:");
		HlthResearchLvl.setBounds(10, 430, 100, 20);
		HeroLvl = new JLabel("Hero Level:");
		HeroLvl.setBounds(10, 460, 100, 20);
		
		//establish boxes for attackers T1's
		JLabel survive1 = new JLabel("Survivors:");
		survive1.setBounds(170,70,100,30);
		JLabel troops1 = new JLabel("Troops:");
		troops1.setBounds(100,70,100,30);
		
	    AT1M = new JTextField(50);
		AT1M.setBounds(100, 100, 60, 20);
		AT1M.setText("0");
		AT1G = new JTextField(50);
		AT1G.setBounds(100, 130, 60, 20);
		AT1G.setText("0");
		AT1R = new JTextField(50);
		AT1R.setBounds(100, 160, 60, 20);
		AT1R.setText("0");

	    K_AT1M = new JLabel();
		K_AT1M.setBounds(170, 100, 60, 20);
		K_AT1M.setText("");
		K_AT1G = new JLabel();
		K_AT1G.setBounds(170, 130, 60, 20);
		K_AT1G.setText("");
		K_AT1R = new JLabel();
		K_AT1R.setBounds(170, 160, 60, 20);
		K_AT1R.setText("");
		
		 
		//establish for attackers T2's
	    AT2M = new JTextField(50);
		AT2M.setBounds(100, 200, 60, 20);
		AT2M.setText("0");
		AT2G = new JTextField(50);
		AT2G.setBounds(100, 230, 60, 20);
		AT2G.setText("0");
		AT2R = new JTextField(50);
		AT2R.setBounds(100, 260, 60, 20);
		AT2R.setText("0");
		
	    K_AT2M = new JLabel();
		K_AT2M.setBounds(170, 200, 60, 20);
		K_AT2M.setText("");
		K_AT2G = new JLabel();
		K_AT2G.setBounds(170, 230, 60, 20);
		K_AT2G.setText("");
		K_AT2R = new JLabel();
		K_AT2R.setBounds(170, 260, 60, 20);
		K_AT2R.setText("");
		
		//establish boxes for attackers T3's
	    AT3M = new JTextField(50);
		AT3M.setBounds(100, 300, 60, 20);
		AT3M.setText("0");
		AT3G = new JTextField(50);
		AT3G.setBounds(100, 330, 60, 20);
		AT3G.setText("0");
		AT3R = new JTextField(50);
		AT3R.setBounds(100, 360, 60, 20);
		AT3R.setText("0");	
		
	    K_AT3M = new JLabel();
		K_AT3M.setBounds(170, 300, 60, 20);
		K_AT3M.setText("");
		K_AT3G = new JLabel();
		K_AT3G.setBounds(170, 330, 60, 20);
		K_AT3G.setText("");
		K_AT3R = new JLabel();
		K_AT3R.setBounds(170, 360, 60, 20);
		K_AT3R.setText("");
		
		//establish boxes for defenders T1's
		JLabel survive2 = new JLabel("Survivors:");
		survive2.setBounds(520,70,100,30);
		JLabel troops2 = new JLabel("Troops:");
		troops2.setBounds(450,70,100,30);
		
		DT1M = new JTextField(50);
		DT1M.setBounds(450, 100, 60, 20);
		DT1M.setText("0");
		DT1G = new JTextField(50);
		DT1G.setBounds(450, 130, 60, 20);
		DT1G.setText("0");
		DT1R = new JTextField(50);
		DT1R.setBounds(450, 160, 60, 20);
		DT1R.setText("0");
		
		K_DT1M = new JLabel();
		K_DT1M.setBounds(520, 100, 60, 20);
		K_DT1M.setText("");
		K_DT1G = new JLabel();
		K_DT1G.setBounds(520, 130, 60, 20);
		K_DT1G.setText("");
		K_DT1R = new JLabel();
		K_DT1R.setBounds(520, 160, 60, 20);
		K_DT1R.setText("");
		
		//establish boxes for defenders T2's
		DT2M = new JTextField(50);
		DT2M.setBounds(450, 200, 60, 20);
		DT2M.setText("0");
		DT2G = new JTextField(50);
		DT2G.setBounds(450, 230, 60, 20);
		DT2G.setText("0");
		DT2R = new JTextField(50);
		DT2R.setBounds(450, 260, 60, 20);
		DT2R.setText("0");
		
		K_DT2M = new JLabel();
		K_DT2M.setBounds(520, 200, 60, 20);
		K_DT2M.setText("");
		K_DT2G = new JLabel();
		K_DT2G.setBounds(520, 230, 60, 20);
		K_DT2G.setText("");
		K_DT2R = new JLabel();
		K_DT2R.setBounds(520, 260, 60, 20);
		K_DT2R.setText("");
		
		//establish boxes for defenders T3's
		DT3M = new JTextField(50);
		DT3M.setBounds(450, 300, 60, 20);
		DT3M.setText("0");
		DT3G = new JTextField(50);
		DT3G.setBounds(450, 330, 60, 20);
		DT3G.setText("0");
		DT3R = new JTextField(50);
		DT3R.setBounds(450, 360, 60, 20);
		DT3R.setText("0");
		
		K_DT3M = new JLabel();
		K_DT3M.setBounds(520, 300, 60, 20);
		K_DT3M.setText("");
		K_DT3G = new JLabel();
		K_DT3G.setBounds(520, 330, 60, 20);
		K_DT3G.setText("");
		K_DT3R = new JLabel();
		K_DT3R.setBounds(520, 360, 60, 20);
		K_DT3R.setText("");
		
		//establish boxes for defenders T1 walls
		JLabel survive3 = new JLabel("Survivors:");
		survive3.setBounds(370,70,100,30);
		JLabel wall = new JLabel("Defenses:");
		wall.setBounds(300,70,100,30);
		
		WT1M = new JTextField(50);
		WT1M.setBounds(300, 100, 60, 20);
		WT1M.setText("0");
		WT1G = new JTextField(50);
		WT1G.setBounds(300, 130, 60, 20);
		WT1G.setText("0");
		WT1R = new JTextField(50);
		WT1R.setBounds(300, 160, 60, 20);
		WT1R.setText("0");
		
		K_WT1M = new JLabel();
		K_WT1M.setBounds(370, 100, 60, 20);
		K_WT1M.setText("");
		K_WT1G = new JLabel();
		K_WT1G.setBounds(370, 130, 60, 20);
		K_WT1G.setText("");
		K_WT1R = new JLabel();
		K_WT1R.setBounds(370, 160, 60, 20);
		K_WT1R.setText("");
				
		//establish boxes for defenders T2 walls
		WT2M = new JTextField(50);
		WT2M.setBounds(300, 200, 60, 20);
		WT2M.setText("0");
		WT2G = new JTextField(50);
		WT2G.setBounds(300, 230, 60, 20);
		WT2G.setText("0");
		WT2R = new JTextField(50);
		WT2R.setBounds(300, 260, 60, 20);
		WT2R.setText("0");
		
		K_WT2M = new JLabel();
		K_WT2M.setBounds(370, 200, 60, 20);
		K_WT2M.setText("");
		K_WT2G = new JLabel();
		K_WT2G.setBounds(370, 230, 60, 20);
		K_WT2G.setText("");
		K_WT2R = new JLabel();
		K_WT2R.setBounds(370, 260, 60, 20);
		K_WT2R.setText("");		
				
		//establish boxes for defenders T3 walls
		WT3M = new JTextField(50);
		WT3M.setBounds(300, 300, 60, 20);
		WT3M.setText("0");
		WT3G = new JTextField(50);
		WT3G.setBounds(300, 330, 60, 20);
		WT3G.setText("0");
		WT3R = new JTextField(50);
		WT3R.setBounds(300, 360, 60, 20);
		WT3R.setText("0");
		
		K_WT3M = new JLabel();
		K_WT3M.setBounds(370, 300, 60, 20);
		K_WT3M.setText("");
		K_WT3G = new JLabel();
		K_WT3G.setBounds(370, 330, 60, 20);
		K_WT3G.setText("");
		K_WT3R = new JLabel();
		K_WT3R.setBounds(370, 360, 60, 20);
		K_WT3R.setText("");	
		
		//make aditional info fields. Buffs, hero, research
		AAtkResearch = new JTextField(2);
		AAtkResearch.setBounds(100,400, 20, 20);
		AAtkResearch.setText("9");
		AHlthResearch = new JTextField(2);
		AHlthResearch.setBounds(100,430, 20, 20);
		AHlthResearch.setText("9");
		AHeroLvl = new JTextField(3);
		AHeroLvl.setBounds(100,460,30,20);
		AHeroLvl.setText("0");
		
		DAtkResearch = new JTextField(2);
		DAtkResearch.setBounds(300,400, 20, 20);
		DAtkResearch.setText("9");
		DHlthResearch = new JTextField(2);
		DHlthResearch.setBounds(300,430, 20, 20);
		DHlthResearch.setText("9");
		DHeroLvl = new JTextField(3);
		DHeroLvl.setBounds(300,460,30,20);
		DHeroLvl.setText("0");
		
		
		//make the button for computing results
		JButton start = new JButton("Calculate Battle Results");
		start.setActionCommand("start");
		start.setFocusable(false);
		start.setBounds(190,500,250,40);
		start.addActionListener(this);
		 
		//put attacker fields onto display
		userWindow.add(AT1M);
		userWindow.add(AT1G);
		userWindow.add(AT1R);
		 
		userWindow.add(K_AT1M);
		userWindow.add(K_AT1G);
		userWindow.add(K_AT1R);
		 
		userWindow.add(AT2M);
		userWindow.add(AT2G);
		userWindow.add(AT2R);
		 
		userWindow.add(K_AT2M);
		userWindow.add(K_AT2G);
		userWindow.add(K_AT2R);
		 
		userWindow.add(AT3M);
		userWindow.add(AT3G);
		userWindow.add(AT3R);
		 
		userWindow.add(K_AT3M);
		userWindow.add(K_AT3G);
		userWindow.add(K_AT3R);
		
		//put defender fields onto display
		userWindow.add(DT1M);
		userWindow.add(DT1G);
		userWindow.add(DT1R);
		
		userWindow.add(K_DT1M);
		userWindow.add(K_DT1G);
		userWindow.add(K_DT1R);		
		
		userWindow.add(DT2M);
		userWindow.add(DT2G);
		userWindow.add(DT2R);
		
		userWindow.add(K_DT2M);
		userWindow.add(K_DT2G);
		userWindow.add(K_DT2R);		
	 
		userWindow.add(DT3M);
		userWindow.add(DT3G);
		userWindow.add(DT3R);
		
		userWindow.add(K_DT3M);
		userWindow.add(K_DT3G);
		userWindow.add(K_DT3R);
		 
		//put wall fields onto display
		userWindow.add(WT1M);
		userWindow.add(WT1G);
		userWindow.add(WT1R);
		
		userWindow.add(K_WT1M);
		userWindow.add(K_WT1G);
		userWindow.add(K_WT1R);
		
		userWindow.add(WT2M);
		userWindow.add(WT2G);
		userWindow.add(WT2R);
		
		userWindow.add(K_WT2M);
		userWindow.add(K_WT2G);
		userWindow.add(K_WT2R);
		 
		userWindow.add(WT3M);
		userWindow.add(WT3G);
		userWindow.add(WT3R);
		
		userWindow.add(K_WT3M);
		userWindow.add(K_WT3G);
		userWindow.add(K_WT3R);
		 
		//put labels onto display
		userWindow.add(survive1);
		userWindow.add(survive2);
		userWindow.add(survive3);
		userWindow.add(attacker);
		userWindow.add(defender);
		userWindow.add(troops1);
		userWindow.add(troops2);
		userWindow.add(wall);
		userWindow.add(T1M);
		userWindow.add(T1G);
		userWindow.add(T1R);
		userWindow.add(T2M);
		userWindow.add(T2G);
		userWindow.add(T2R);
		userWindow.add(T3M);
		userWindow.add(T3G);
		userWindow.add(T3R);
		userWindow.add(AtkResearchLvl);
		userWindow.add(HlthResearchLvl);
		userWindow.add(HeroLvl);
		 
		//put research and hero fields onto display
		userWindow.add(AAtkResearch);
		userWindow.add(AHlthResearch);
		userWindow.add(AHeroLvl);
		
		userWindow.add(DAtkResearch);
		userWindow.add(DHlthResearch);
		userWindow.add(DHeroLvl);
		
		userWindow.add(start);
		userWindow.addComponentListener(new ComponentAdapter(){
		});
		 
		
		 return userWindow;
	 }

	 
	@Override
	public void keyPressed(KeyEvent keyevent) {
	}

	@Override
	public void keyTyped(KeyEvent keyevent) {}
	@Override
	public void keyReleased(KeyEvent keyevent) {}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if("start".equals(evt.getActionCommand())){
			attackerHitDefender();
			
			
		}
		}
	
	public void attackerHitDefender(){

		Battlefield battlefield = new Battlefield();
		ArmyGroup attacker = new ArmyGroup();
		ArmyGroup defender = new ArmyGroup();
		Agroup = 0;
		Dgroup = 0;
		
		//apply buffs and boosts. static throughout the battle
		//attacker
		attacker.setHero(Integer.parseInt(AHeroLvl.getText()));
		attacker.setHonedWeps(Integer.parseInt(AAtkResearch.getText()));
		attacker.setVigor(Integer.parseInt(AHlthResearch.getText()));
		//defender
		defender.setHero(Integer.parseInt(DHeroLvl.getText()));
		defender.setHonedWeps(Integer.parseInt(DAtkResearch.getText()));
		defender.setVigor(Integer.parseInt(DHlthResearch.getText()));
		
		while(Agroup < 3 && Dgroup < 6){
			settupGroups(attacker, defender);
			battlefield.battle(attacker,  defender);
			printResults(attacker, defender);
		}


			
	}
	public void settupGroups(ArmyGroup attacker, ArmyGroup defender){
		if(attacker.total == 0 || Dgroup == 6){	
			if(Agroup == 0){
				attacker.setGround(Integer.parseInt(AT1G.getText()));
				attacker.setMount(Integer.parseInt(AT1M.getText()));
				attacker.setRange(Integer.parseInt(AT1R.getText()));
			}else if(Agroup == 1) {
				attacker.setGround(Integer.parseInt(AT2G.getText())*2);
				attacker.setMount(Integer.parseInt(AT2M.getText())*2);
				attacker.setRange(Integer.parseInt(AT2R.getText())*2);
			}else if(Agroup == 2) {
				attacker.setGround(Integer.parseInt(AT3G.getText())*4);
				attacker.setMount(Integer.parseInt(AT3M.getText())*4);
				attacker.setRange(Integer.parseInt(AT3R.getText())*4);
			}else if(Agroup == 3) {
			}
		}
		if(defender.total == 0 || Agroup == 3){
			if(Dgroup == 0){
				defender.setGround(Integer.parseInt(WT1G.getText()));
				defender.setMount(Integer.parseInt(WT1M.getText()));
				defender.setRange(Integer.parseInt(WT1R.getText()));
			}else if(Dgroup == 1){
				defender.setGround(Integer.parseInt(WT2G.getText())*2);
				defender.setMount(Integer.parseInt(WT2M.getText())*2);
				defender.setRange(Integer.parseInt(WT2R.getText())*2);
			}else if(Dgroup == 2){
				defender.setGround(Integer.parseInt(WT3G.getText())*4);
				defender.setMount(Integer.parseInt(WT3M.getText())*4);
				defender.setRange(Integer.parseInt(WT3R.getText())*4);
			}else if(Dgroup == 3){
				defender.setGround(Integer.parseInt(DT1G.getText()));
				defender.setMount(Integer.parseInt(DT1M.getText()));
				defender.setRange(Integer.parseInt(DT1R.getText()));
			}else if(Dgroup == 4){
				defender.setGround(Integer.parseInt(DT2G.getText())*2);
				defender.setMount(Integer.parseInt(DT2M.getText())*2);
				defender.setRange(Integer.parseInt(DT2R.getText())*2);
			}else if(Dgroup == 5){
				defender.setGround(Integer.parseInt(DT3G.getText())*4);
				defender.setMount(Integer.parseInt(DT3M.getText())*4);
				defender.setRange(Integer.parseInt(DT3R.getText())*4);
			}else if(Dgroup == 6){
			}
		}
	}
	
	public void printResults(ArmyGroup attacker, ArmyGroup defender){
		if(attacker.total == 0 || Dgroup == 6){
			if(Agroup == 0){
				K_AT1R.setText(Integer.toString(attacker.range));
				K_AT1M.setText(Integer.toString(attacker.mount));			
				K_AT1G.setText(Integer.toString(attacker.ground));
				Agroup++;
			}else if(Agroup == 1){
				K_AT2R.setText(Integer.toString(attacker.range));
				K_AT2M.setText(Integer.toString(attacker.mount));			
				K_AT2G.setText(Integer.toString(attacker.ground));
				Agroup++;
			}else if(Agroup == 2){
				K_AT3R.setText(Integer.toString(attacker.range));
				K_AT3M.setText(Integer.toString(attacker.mount));			
				K_AT3G.setText(Integer.toString(attacker.ground));
				Agroup++;
			}
		}
		if(defender.total == 0 || Agroup == 3){
			if(Dgroup == 0){
				K_WT1R.setText(Integer.toString(defender.range));
				K_WT1M.setText(Integer.toString(defender.mount));			
				K_WT1G.setText(Integer.toString(defender.ground));
				Dgroup++;
			}else if(Dgroup == 1){
				K_WT2R.setText(Integer.toString(defender.range/2));
				K_WT2M.setText(Integer.toString(defender.mount/2));			
				K_WT2G.setText(Integer.toString(defender.ground/2));
				Dgroup++;
			}else if(Dgroup == 2){
				K_WT3R.setText(Integer.toString(defender.range/4));
				K_WT3M.setText(Integer.toString(defender.mount/4));			
				K_WT3G.setText(Integer.toString(defender.ground/4));
				Dgroup++;
			}else if(Dgroup == 3){
				K_DT1R.setText(Integer.toString(defender.range));
				K_DT1M.setText(Integer.toString(defender.mount));			
				K_DT1G.setText(Integer.toString(defender.ground));
				Dgroup++;
			}else if(Dgroup == 4){
				K_DT2R.setText(Integer.toString(defender.range/2));
				K_DT2M.setText(Integer.toString(defender.mount/2));			
				K_DT2G.setText(Integer.toString(defender.ground/2));
				Dgroup++;
			}else if(Dgroup == 5){
				K_DT3R.setText(Integer.toString(defender.range/4));
				K_DT3M.setText(Integer.toString(defender.mount/4));			
				K_DT3G.setText(Integer.toString(defender.ground/4));
				Dgroup++;
			}
		}
	}
}

	
	 
