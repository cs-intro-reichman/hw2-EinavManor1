public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int  addMinutes= Integer.parseInt(args[1]);
        int futureTime = (minutes + addMinutes);
        int calHour = (futureTime/60);
        int calMin = (futureTime%60);
        int finalHour = (calHour+hours);
        if (finalHour < 10){
                String hoursOrg = "0"+String.valueOf(finalHour);
                if (calMin<10){
                    String minOrg = "0"+String.valueOf(calMin);
                    System.out.println(hoursOrg+":"+minOrg);
                }else{System.out.println(hoursOrg+":"+calMin);
            }
        }else {
                if( (10 < finalHour) && (finalHour < 24)){
                    if (calMin<10){
                        String minOrg = "0"+String.valueOf(calMin);
                        System.out.println(finalHour+":"+minOrg);
                    }else{System.out.println(finalHour+":"+calMin);
                }
                }else{
                    while (finalHour >= 24){  
                        finalHour = finalHour-24; 
                    }
                        if (finalHour < 10) {
                        String hoursOrg = "0"+String.valueOf(finalHour);
                        if (calMin<10){
                            String minOrg = "0"+String.valueOf(calMin);
                            System.out.println(hoursOrg+":"+minOrg);
                        }else{System.out.println(hoursOrg+":"+calMin);
                    }
                    }else{
                        if (calMin<10){
                        String minOrg = "0"+String.valueOf(calMin);
                        System.out.println(finalHour+":"+minOrg);
                        }else{System.out.println(finalHour+":"+calMin);
                }
            }
        }
    }
    }
}
//done