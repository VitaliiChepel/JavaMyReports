package epam.patterns;

import java.util.Date;

// Stelting: book, page 45
public class Factory {

    public static void main(String[] args) {

        WatchMaker maker = getMakerByName("Digital");
        //WatchMaker maker = new RomeWatchMaker();

        Watch watch = maker.createWatch();
        watch.showTime();
    }


    public  static WatchMaker getMakerByName (String maker) {
        if (maker.equals("Digital"))
            return  new DigitalWatchMaker();
         else if (maker.equals("Rome"))
            return  new RomeWatchMaker();

        throw new RuntimeException("Неподдерживаемая производственная линия по производству часов " + maker);
    }
}

    interface Watch {
        void showTime();
    }

    class DigitalWatch implements Watch {
        public void showTime () {
            System.out.println(new Date());
        }
    }

    class RomeWatch implements Watch {
        public void showTime () {
            System.out.println("VII-XX");
        }
    }

    interface  WatchMaker {
        Watch createWatch ();
    }

    class DigitalWatchMaker implements  WatchMaker {
        public  Watch createWatch (){
            return  new DigitalWatch();
        }
    }

class RomeWatchMaker implements  WatchMaker {
    public Watch createWatch() {
        return new RomeWatch();
    }
}

