package Services;

import com.sun.org.apache.xpath.internal.objects.XString;

public class House {
    private String houseNo;
    private String contactName;
    private String conatactNumber;

    //constructor
    House(String houseNo,String conatactName,String contactNumber){
        this.houseNo=houseNo;
        this.contactName=contactName;
        this.conatactNumber=contactNumber;
    }

    //setter
    void setHouseNo(String houseNo){
        this.houseNo=houseNo;
    }
    void setContactName(String contactName){
        this.contactName=contactName;
    }
    void setConatactNumber(String conatactNumber){
        this.conatactNumber=conatactNumber;
    }

    //getter
    String getHouseNo(){
        return this.houseNo;
    }
    String getContactName(){
        return this.contactName;
    }
    String getConatactNumber(){
        return this.conatactNumber;
    }

}
