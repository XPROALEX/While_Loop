public class Main {
    public static void main (String[] args){
        int startBotPounds=10000;
        int totalDayToSellAll=0;
        while(startBotPounds>0){
            double exchangeRate=  (1 + (Math.random() * 0.2));
            if (exchangeRate>=1.15){
                startBotPounds-=1000;
                totalDayToSellAll++;}
            else if (exchangeRate<1.15) {
                totalDayToSellAll++;
            }
        }
        System.out.println("Days to sell all pounds: "+totalDayToSellAll);
    }
}
