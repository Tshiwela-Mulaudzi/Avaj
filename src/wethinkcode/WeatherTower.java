package wethinkcode;

public class WeatherTower extends Tower{
    public String getWeather(Coordinates coordinates ){
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }
    public void changeWeather(){
        System.out.println("Got to the changeWeather() part ");
        this.conditionsChanged();
    }
}
