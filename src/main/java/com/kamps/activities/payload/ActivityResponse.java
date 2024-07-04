package com.kamps.activities.payload;


import com.kamps.activities.models.Activity;

public class ActivityResponse {
    private String message;
    private Activity activity;

    public ActivityResponse(String message, Activity activity) {
        this.message = message;
        this.activity = activity;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}

