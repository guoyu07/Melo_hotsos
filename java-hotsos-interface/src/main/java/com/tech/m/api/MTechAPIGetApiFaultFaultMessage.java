
package com.tech.m.api;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-02-21T09:17:10.057+08:00
 * Generated source version: 3.1.10
 */

@WebFault(name = "apiFault", targetNamespace = "urn:api.m-tech.com")
public class MTechAPIGetApiFaultFaultMessage extends Exception {
    
    private com.tech.m.api.fault.ApiFault apiFault;

    public MTechAPIGetApiFaultFaultMessage() {
        super();
    }
    
    public MTechAPIGetApiFaultFaultMessage(String message) {
        super(message);
    }
    
    public MTechAPIGetApiFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public MTechAPIGetApiFaultFaultMessage(String message, com.tech.m.api.fault.ApiFault apiFault) {
        super(message);
        this.apiFault = apiFault;
    }

    public MTechAPIGetApiFaultFaultMessage(String message, com.tech.m.api.fault.ApiFault apiFault, Throwable cause) {
        super(message, cause);
        this.apiFault = apiFault;
    }

    public com.tech.m.api.fault.ApiFault getFaultInfo() {
        return this.apiFault;
    }
}