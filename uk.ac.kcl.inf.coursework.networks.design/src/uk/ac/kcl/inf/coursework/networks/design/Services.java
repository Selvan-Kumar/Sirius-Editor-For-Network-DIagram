package uk.ac.kcl.inf.coursework.networks.design;

import org.eclipse.emf.ecore.EObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;


/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
     	
	public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
	  //check if name is not null and has no space in it
    public boolean validName(String name) {
    	boolean result = true;
    	
    	if (name == null || name.contains(" ")) {
			result = false;
		}  	
 
    	return result;
    }
    	
	//check if ip address is valid
    public boolean validIP(String address) {
    	boolean formatTest = false;
    	boolean netAddTest = true;
    	boolean result = false;
	    //check ip address is correct format
	    String modelIPAddress = 
	        "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	 
	     if (address == null || address.contains(" ")) {
	    	 result = false;
	     }else {
	    	 Pattern pattern = Pattern.compile(modelIPAddress);
	    	 Matcher matcher = pattern.matcher(address);
	    	 formatTest = matcher.matches();  
	     } 
	      
	     //check ip address is not a network address
	     String modelNetworkAddress = 
	    		        "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	    		        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	    		        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	    		        "0";
	 
	     if (address == null || address.contains(" ")) {
	    	 result = false;
	     }else {
	    	 Pattern pattern1 = Pattern.compile(modelNetworkAddress);
	    	 Matcher matcher1 = pattern1.matcher(address);
	    	 netAddTest = matcher1.matches();  
	     } 
	     
	     if (formatTest == true && netAddTest == false) {
	    	 result = true;
	     }
	     
	     return result;
    }
        
  //check if network address is valid
    public boolean validNetworkAddress(String address) {
    	Pattern pattern;
	    Matcher matcher;
	 
	    String modelNetworkAddress = 
	        "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	        "0";
	      
	    if (address == null || address.contains(" ")) {
	    	 return false;
	     }else {
	      pattern = Pattern.compile(modelNetworkAddress);
	      matcher = pattern.matcher(address);
	      return matcher.matches();  
	     }
    }
    
    public String getSegment(String address) {
    	String[] splitString = address.split("\\.");
    	String segment = splitString[0] + "." + splitString[1] + "." + splitString[2];
    	return segment;
    }
    
    public void genDescription(EObject self) {
    	
    	String[] str = self.toString().split(" ");
    	String name = str[1];
    	String address = str[2];
    	String show = "Name: " + name + "\n" + "Address: " + address;
    	JOptionPane.showMessageDialog(null,show);  
    }

}
