package Services;

public class Visitor {
    private String visName;
    private String visContact;
    private String visHouse;

    //constructor
    Visitor(String visName,String visContact,String visHouse){
        this.visName=visName;
        this.visContact=visContact;
        this.visHouse=visHouse;
    }

    //setter
    void setVisName(String name){
        this.visName=name;
    }
    void setVisContact(String contact){
        this.visContact=contact;
    }
    void setVisHouse(String house){
        this.visHouse=house;
    }

    //getter
    String getVisName(){
        return this.visName;
    }
    String getVisContact(){
        return this.visContact;
    }
    String getVisHouse(){
        return this.visHouse;
    }
}
