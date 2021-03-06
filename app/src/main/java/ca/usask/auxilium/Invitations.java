package ca.usask.auxilium;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * Created by rpiper on 3/3/18.
 */

public class Invitations {

    private String circleId;
    private String email;
    private String senderEmail;
    private boolean sentDynamicLink;
    private Long expirationDate;

    public Invitations() {}

    public Invitations(String circleId,String email, String currentUserEmail) {
        this.circleId = circleId;
        this.email = email;
        this.sentDynamicLink = false;
        this.senderEmail = currentUserEmail;
        // get expiration date as unix timestamp
        this.expirationDate = DateTime.now()
                                      .toDateTime(DateTimeZone.UTC)
                                      .plusMonths(1).getMillis() / 1000L;
    }

    public String getCircleId() {
        return this.circleId;
    }

    public String getEmail() {
        return  this.email;
    }

    public boolean getSentDynamicLink() {
        return this.sentDynamicLink;
    }

    public Long getExpirationDate() {
        return  this.expirationDate;
    }

    public void setCircleId(String newCircleId) {
        this.circleId = newCircleId;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void setSentDynamicLink(boolean newSentDynamicLink) {
        this.sentDynamicLink = newSentDynamicLink;
    }

    public void setExpirationDate(Long newExpirationDate) {
        this.expirationDate = newExpirationDate;
    }

    public String getSenderEmail() {
      return this.senderEmail;
    }

    public void setSenderEmail(String newEmail) {
        this.senderEmail = newEmail;
    }

}
