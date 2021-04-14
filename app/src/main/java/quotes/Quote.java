package quotes;

import java.net.MalformedURLException;
import java.net.URL;

public class Quote {
    private String quoteText;
    private String quoteAuthor;
    private String senderName;
    private String senderLink;
    URL quoteLink;

    public Quote(){}

    public Quote(String quoteText, String quoteAuthor, String senderName, String senderLink, URL quoteLink) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
        this.senderName = senderName;
        this.senderLink = senderLink;
        this.quoteLink = quoteLink;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public void setQuoteAuthor(String quoteAuthor) {
        this.quoteAuthor = quoteAuthor;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public URL getSenderLink() {
        return quoteLink;
    }

    public void setSenderLink(String senderLink) {
        this.senderLink = senderLink;
    }

    public URL getQuoteLink() {
        return quoteLink;
    }

    public void setQuoteLink(URL quoteLink) {
        this.quoteLink = quoteLink;
    }

    @Override
    public String toString() {
        return "{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                ", senderName='" + senderName + '\'' +
                ", senderLink='" + senderLink + '\'' +
                ", quoteLink=" + quoteLink +
                '}';
    }
}
