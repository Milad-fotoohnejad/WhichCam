//package itas.miladf.whichcamlogin.data.model;
//
///**
// * Data class that captures user information for logged in users retrieved from LoginRepository
// */
//public class LoggedInUser {
//
//    private String userId;
//    private String email;
//    private String displayName;
//
//    public LoggedInUser(String userId, String email) {
//        this.userId = userId;
//        this.email = email;
//
//        String[] separated = email.split("@");
//        this.displayName = separated[0];
//        ;
//    }
//
//    public String getUserId() {
//        return userId;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public String getDisplayName() {
//        return displayName;
//    }
//}