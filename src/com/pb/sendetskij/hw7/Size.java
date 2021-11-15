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
    private String answerEuroS;

    Size(String description,String euroSize){
        this.description = description;
        this.euroSize = euroSize;
    };

    public Object getDescription() {
        switch (description) {
            case ("XXS"):
                answerDescript = "Малыш";
            case ("XS"):
                answerDescript = "Подросток";
            case ("S"):
                answerDescript = "Среднячек";
            case ("M"):
                answerDescript = "Полубог";
            case ("L"):
                answerDescript = "Бог";
            return answerDescript;
        }
        return null;
    };
    public Object getEuroSize() {
        switch (euroSize) {
            case ("XXS"):
                answerEuroS = "32";
            case ("XS"):
                answerEuroS = "34";
            case ("S"):
                answerEuroS = "36";
            case ("M"):
                answerEuroS = "38";
            case ("L"):
                answerEuroS = "40";
                return answerEuroS;
        }
        return null;
    };
}
