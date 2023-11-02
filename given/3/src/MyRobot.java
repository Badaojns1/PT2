
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thang
 */
public class MyRobot implements IRobot{

    @Override
    public int f1(List<Robot> t) {
        int s=0;
        for (Robot robot : t) {
            if(!robot.getLabel().contains("A")&&!robot.getLabel().contains("B"))
                s+=robot.getStep();
        }
        return s;
    }

    @Override
    public void f2(List<Robot> t) {
        int max=Integer.MIN_VALUE;
        int index_max=-1;
        for(int i=0;i<t.size();i++){
            if(t.get(i).getStep()>max){
                index_max=i;
                max=t.get(i).getStep();
            }
        }
        t.remove(index_max);
    }

    @Override
    public void f3(List<Robot> t) {
        int n = t.size();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(t.get(i).getStep()==t.get(j).getStep()){
                    int start=i;
                    int end=j;
                    for(int x=start;x<end;x++){
                        for(int y=x+1;y<=end;y++){
                            if(t.get(x).getStep()>t.get(y).getStep()){
                                Robot tmp = t.get(x);
                                t.set(x, t.get(y));
                                t.set(y,tmp);
                            }
                        }
                    }
                    break;
                }
            }
        } 
    }
}
