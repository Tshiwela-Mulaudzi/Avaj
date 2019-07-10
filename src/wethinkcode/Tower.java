package wethinkcode;


import java.util.*;

public class Tower {
    private List<Flyable> observers = new ArrayList<Flyable>();

    public void register(Flyable flyable){
        observers.add(flyable);

    }
    public void unregister(Flyable flyable){
        observers.remove(flyable);
    }
    protected void conditionsChanged(){
        System.out.println("Got to the conditionsChangedPart()? ");
        for (Flyable flyable : observers) {
//            System.out.println("Inside the for ConditionChangedloop yes ");
            flyable.updateConditions();
        }
    }
}