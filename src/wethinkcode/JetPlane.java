package wethinkcode;

public class JetPlane extends Aircraft implements Flyable {

    private WeatherTower weatherTower = new WeatherTower();

    JetPlane(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }
    public void updateConditions() {
        System.out.println("And Update Conditions?? ");
         String weather = weatherTower.getWeather(coordinates);
        System.out.println("not get the weather part maybe? " + weather);
        System.out.println("jetpl 1 " );
        switch (weather) {
            case "Sun":{
//                coordinates = new Coordinates(coordinates.getLongitude() + 2, coordinates.getLatitude() + 10, coordinates.getHeight() + 2);s
                coordinates.set_longitude(coordinates.getLongitude() + 1);
                coordinates.set_latitude(coordinates.getLatitude() + 10);
                coordinates.setHeight(coordinates.getHeight() + 2);
                Main.writer.println("JetPlane#" + name + "(" + id + "): " + "This is hot.");
                System.out.println("sun 1 " );
                break;  }
            case "Rain": {
//                coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 2, coordinates.getHeight());
                Main.writer.println("JetPlane#" + name + "(" + id + "): " + "It's raining. Better watch out for lightnings");
                System.out.println("rain 1 " );
                break;  }
            case "Fog": {
//                coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 1, coordinates.getHeight());
                Main.writer.println("JetPlane#" + name + "(" + id + "): " + "The fog is killing me. Request permission to land.");
                System.out.println("fog 1 " );
                break; }
            case "Snow":  {
//                coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 7);
                Main.writer.println("JetPlane#" + name + "(" + id + "): " + "OMG! Winter is coming!");
                System.out.println("Snow 1 " );
                break; }

         
        }
        
    }

    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        System.out.println("Tower says: " + this.getClass().getSimpleName() + "#" + "(" + this.id + ") registered to weather tower.");
    }
}