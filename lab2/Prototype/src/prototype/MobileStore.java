/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author IT069 arjun
 */
public class MobileStore {

    private static Map<String,Mobile> mobileMap = new HashMap<>();
    
    static{
        mobileMap.put("samsung", new Samsung());
        mobileMap.put("Nokia", new Nokia());
    }
    
    public static Mobile getMobile(String mobile_name) throws CloneNotSupportedException {
        return (Mobile) mobileMap.get(mobile_name).clone();
    }
}
