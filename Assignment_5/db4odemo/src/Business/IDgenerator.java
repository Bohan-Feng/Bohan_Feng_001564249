package Business;

import java.util.UUID;

public class IDgenerator {
    public static int generateUniqueId() {      
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;        
        int uid=str.hashCode();
        return uid > 0 ? uid : uid * -1;
    }
}
