import java.util.ArrayList;

public class inputDevice {
    private String deviceName;
    private int ipAddress;
    private String deviceType;

    public inputDevice (String deviceName, int ipAddress, String deviceType){
        this.deviceName = deviceName;
        this.ipAddress = ipAddress;
        this.deviceType = deviceType;
    }

    @Override
    public String toString(){
        return this.deviceName + this.ipAddress + this.deviceType;
    }

    public String getName(){
        return this.deviceName;
    }

    public int getIp(){
        return this.ipAddress;
    }

    public String getType(){
        return this.deviceType;
    }

    
    public void searchDevice(String deviceName, ArrayList<inputDevice> deviceList){

        for (int i = 0; i < deviceList.size(); i++){

            //if deviceName == deviceName of an index
            if (deviceName.equals(deviceList.get(i).getName())){
            //deviceList.get(i).getName()
                //Hey deviceList, give me the object at index i → then, hey that object, give me your name.
                System.out.println(deviceList.get(i).getName() + " " + deviceList.get(i).getIp() + " " + deviceList.get(i).getType()); 
            }
        }   
    }


}





//create class with arraylist that allows user to input these
//network_device name, ip_address, device_type
//create constructor for each

//methods
//searchDevice() that requires input of network_device name and output the rest