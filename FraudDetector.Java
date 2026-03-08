public class FraudDetector {

    public static boolean checkFraud(String message){

        String[] fraudWords = {
                "lottery",
                "win money",
                "free gift",
                "click link",
                "urgent"
        };

        for(String word : fraudWords){
            if(message.toLowerCase().contains(word)){
                return true;
            }
        }

        return false;
    }

}

