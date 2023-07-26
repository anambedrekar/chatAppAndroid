package com.sveri.chatapp;

public class Modal {


    public int getMessage() {
        return 0;
    }

    public Object getFrom() {
        return 0;
    }

    public class ModelClass {

        String message;
        String from;

        public ModelClass() {
        }

        public ModelClass(String message, String from) {
            this.message = message;
            this.from = from;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }
    }
}
