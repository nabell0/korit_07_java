package ch14_abstraction.interfaces;

public class ModeChangeButton extends Button{
    private boolean status1;
    @Override
    public void onPressed() {
        if (status1){
            status1=false;
            System.out.println("냉방으로 바뀝니다.");
        }else{
            status1 = true;
            System.out.println("난방으로 바뀝니다.");
        }
    }
 }

