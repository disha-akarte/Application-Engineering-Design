/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SMS;

import java.util.*;
import com.twilio.sdk.*;
import com.twilio.sdk.resource.factory.*;
import com.twilio.sdk.resource.instance.*;
import com.twilio.sdk.resource.list.*;
//import com.

/**
 *
 * @author SONY
 */
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class SMS {

    public static final String ACCOUNT_SID = "ACdef9f113c5a2b6cbbe55fbf1b0c8cf25";
    public static final String AUTH_TOKEN = "7ef41f97971a7891a90885c085661b1b";
    TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

    public void sendSms() throws TwilioRestException {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("To", "8572689331"));
        params.add(new BasicNameValuePair("From", "+19402282931"));
        params.add(new BasicNameValuePair("Body", "There is an emergency "));

        MessageFactory messageFactory = client.getAccount().getMessageFactory();
        Message message = messageFactory.create(params);
        System.out.println(message.getSid());
    }
}
