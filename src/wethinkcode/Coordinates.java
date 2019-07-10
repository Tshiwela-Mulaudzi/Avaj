package wethinkcode;

class Coordinates {
    
    private int _longitude;
    private int _latitude;
    private int _height;

    Coordinates(int longitude, int latitude, int height) {
        this._latitude = latitude;
        this._longitude = longitude;
        this._height = height < 0 ? 0 : height > 100 ? 100 : height;;
    }
    
    public int getLongitude () {
        return (this._longitude);
    }

    public int getLatitude() {
        return (this._latitude);
    }
    
    public int getHeight() {
        return (this._height);
    }

    public void setHeight(int _height) {
        this._height = _height;
    }

    public void set_latitude(int _latitude) {
        this._latitude = _latitude;
    }

    public void set_longitude(int _longitude) {
        this._longitude = _longitude;
    }
}