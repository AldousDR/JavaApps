package Places;

public class Theater extends Building {

    @Override
    public void showArea(){
        System.out.println("Theater area : " + (getCapacity()*12));
    }

    @Override
    public void showEvents(){
        System.out.println("Events ready to be hosted !!");
    }
}
