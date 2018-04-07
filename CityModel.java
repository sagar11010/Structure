



public class CityModel {

    String id,name,StateID;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStateID() {
        return StateID;
    }

    public void setStateID(String stateID) {
        StateID = stateID;
    }

    @Override
    public String toString() {
        return "CityModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", StateID='" + StateID + '\'' +
                '}';
    }
}
