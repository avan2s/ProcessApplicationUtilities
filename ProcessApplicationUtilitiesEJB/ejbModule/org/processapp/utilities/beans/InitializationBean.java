package org.processapp.utilities.beans;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class InitializationBean {

//	@EJB
//	private IPrescriptiveServiceCaller serviceCaller;
//	@EJB
//	private ICaseInstanceInformationLoader informationLoader;

	@PostConstruct
	private void initialize() {
//		 String refInstance = this.informationLoader.getFirstCaseInstanceId();
//		
//		 double kWeight = 100;
//		 double kzWeight = 1;
//		 double zaWeight = 1;
//		 double spWeight = 1;
//		 double igWeight = 1;
//		 double sum = kWeight + kzWeight + zaWeight + spWeight + igWeight;
//		 // Ziele definieren
//		 GoalRequest goalK = new GoalRequest();
//		 goalK.setGoalStartPeriod(0);
//		 goalK.setGoalEndPeriod(4);
//		 goalK.setGoalFigure("Kosten");
//		 goalK.setGoalWeight(kWeight / sum);
//		 goalK.setGoalValue(10000);
//		
//		 GoalRequest goalZA = new GoalRequest();
//		 goalZA.setGoalStartPeriod(0);
//		 goalZA.setGoalEndPeriod(4);
//		 goalZA.setGoalFigure("Zeitaufwand");
//		 goalZA.setGoalValue(270);
//		 goalZA.setGoalWeight(zaWeight / sum);
//		
//		 GoalRequest goalKz = new GoalRequest();
//		 goalKz.setGoalStartPeriod(0);
//		 goalKz.setGoalEndPeriod(4);
//		 goalKz.setGoalFigure("Kundenzufriedenheit");
//		 goalKz.setGoalValue(20);
//		 goalKz.setGoalWeight(kzWeight / sum);
//		
//		 GoalRequest goalSP = new GoalRequest();
//		 goalSP.setGoalStartPeriod(0);
//		 goalSP.setGoalEndPeriod(4);
//		 goalSP.setGoalFigure("Stakeholder-Power");
//		 goalSP.setGoalValue(-40);
//		 goalSP.setGoalWeight(spWeight / sum);
//		
//		 GoalRequest goalIG = new GoalRequest();
//		 goalIG.setGoalStartPeriod(0);
//		 goalIG.setGoalEndPeriod(4);
//		 goalIG.setGoalFigure("Informationsgewinn");
//		 goalIG.setGoalValue(1);
//		 goalIG.setGoalWeight(igWeight / sum);
//		
//		 List<GoalRequest> goals = new ArrayList<>();
//		 goals.add(goalK);
//		 goals.add(goalKz);
//		 goals.add(goalIG);
//		 goals.add(goalSP);
//		 goals.add(goalZA);
//		
//		 try {
//		 this.serviceCaller.recommendNextAction(refInstance, goals, true);
//		 this.serviceCaller.recommendSequence(refInstance,
//		 SequenceType.MAX_BENEFIT, 3, goals, false);
//		 this.serviceCaller.registerDecision(refInstance, "Uf");
//		 this.serviceCaller.registerEffect(refInstance, "Uf",
//		 "Informationsgewinn", ObservedEffect.POSITIVE);
//		
//		 } catch (TaskNotValidForInstanceException e) {
//		 // TODO Auto-generated catch block
//		 e.printStackTrace();
//		 } catch (CaseInstanceNotValidException e) {
//		 // TODO Auto-generated catch block
//		 e.printStackTrace();
//		 }
//		 System.out.println("hallo");

	}

}
