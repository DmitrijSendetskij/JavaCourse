package com.pb.sendetskij.hw7;

public enum Size {


    XXS("XXS","40"),
    XS("XS","38"),
    S("S","36"),
    M("M","34"),
    L("L","32");

    private String description;
    private String euroSize;
    private String answerDescript;

    Size(String description,String euroSize){
        this.description = description;
        this.euroSize = euroSize;
    };

    public Object getDescription() {
        switch (description) {
            case ("XXS"):
                answerDescript = "Бог";
                return answerDescript;
            case ("XS"):
                answerDescript = "Полубог";
                return answerDescript;
            case ("S"):
                answerDescript = "Виріс";
                return answerDescript;
            case ("M"):
                answerDescript = "Підліток";
                return answerDescript;
            case ("L"):
                answerDescript = "Малюк";
                return answerDescript;
        }
        return null;
    };
    public String getEuroSize() {
        return euroSize;
    }
    /*
    public Object getEuroSize() {
        switch (description) {
            case ("XXS"):
                answerEuroS = "32";
                return answerEuroS;
            case ("XS"):
                answerEuroS = "34";
                return answerEuroS;
            case ("S"):
                answerEuroS = "36";
                return answerEuroS;
            case ("M"):
                answerEuroS = "38";
                return answerEuroS;
            case ("L"):
                answerEuroS = "40";
                return answerEuroS;
        }
        return null;
    };
    */
}
