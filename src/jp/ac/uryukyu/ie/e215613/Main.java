package jp.ac.uryukyu.ie.e215613;

public class Main {
    public static void main(String args[]){
        int num1 = 0;
        int num2 = 0;
        String operation;
        int result;
        
        if (args.length != 3){
            errDisp("引数は3つ入力してください");
        }
        
        try{
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e){
            errDisp("数値を入力してください");
        }
        operation = args[1];

        String opeStr[] ={"tasu", "hiku", "kake", "waru"};
        boolean errFlag = true;

        for (int i = 0; i < 4; i++){
            if(operation.equals(opeStr[i])){
                errFlag = false;
            }
        }

        if (errFlag == true){
            errDisp("演算子は tasu hiku kake waru の4つです");
        }

        if(operation.equals("tasu")){
            result = num1 + num2;
        }else if (operation.equals("hiku")){
            result = num1 - num2;
        }else if (operation.equals("kake")){
            result = num1 * num2;
        }else {
            if (num2 == 0){
                errDisp("0では割れません");
            }
            result = num1/num2;
        }
        System.out.println("入力された式は " + num1 + " " + operation + " " + num2 + " です");
        System.out.println("計算結果は " + result + " です");
        }

        private static void errDisp(String errStr){
            System.out.println("入力内容 : java Main.java 数値 演算子 数値");
            System.out.println(errStr);
            System.exit(0);  /* プログラムを終了する */

        
    
    }
}
