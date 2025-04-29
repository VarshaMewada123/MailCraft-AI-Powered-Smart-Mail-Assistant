package com.email.writer.app;

public class EmailRequest {
    private String tone;
    private String emailContent;

    // Manually add the getter for 'tone'
    public String getTone() {
        return tone;
    }

    // Manually add the getter for 'emailContent'
    public String getEmailContent() {
        return emailContent;
    }

    // You can also add setters if needed
    public void setTone(String tone) {
        this.tone = tone;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }
}
