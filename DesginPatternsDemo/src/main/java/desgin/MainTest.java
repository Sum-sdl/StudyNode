package desgin;

import desgin.create.AbstractFactory;

/**
 * Created by sdl on 2017/6/12.
 */

public class MainTest {

    public void design_factory() {

        //简单工厂模式
//        BaseTest test = new SampleFactory();
        //抽象工厂模式
        BaseTest test = new AbstractFactory();
        test.startTest();
    }

}
