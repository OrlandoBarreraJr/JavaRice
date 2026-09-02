import java.util.ArrayList;

public class SearchDevice {
    //linking the Main.java arrayList
    private ArrayList<inputDevice> deviceList;

    public SearchDevice(ArrayList<inputDevice> deviceList){
        this.deviceList = deviceList;
    }

    public void searchDevice(String deviceName){

        for (int i = 0; i < deviceList.size(); i++){
            //Remember that arrayList list object along its attributes in one index
            //if deviceName == deviceName of an index
            if (deviceName.equals(deviceList.get(i).getName())){
            //deviceList.get(i).getName()
                //Hey deviceList, give me the object at index i → then, hey that object, give me your name.
                System.out.println(deviceList.get(i).getName() + " " + deviceList.get(i).getIp() + " " + deviceList.get(i).getType()); 
            }
            else{
                System.out.println("Device name not found.");
            }
        }   
    }

}

