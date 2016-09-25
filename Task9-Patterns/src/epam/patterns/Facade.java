package epam.patterns;

/**
 * Created by Витал on 25.09.2016.
 */
public class Facade {

    public static void main(String[] args) {

//        Power power = new Power();
//        power.on();
//
//        DVDRom dvd = new DVDRom();
//        dvd.load();
//
//        HDD hdd = new HDD();
//        hdd.copyFromDVD0(dvd);
//    }
//}

        Computer computer = new Computer();
        computer.copy();
    }
}

        class Computer {
            Power power = new Power();
            DVDrom dvd = new DVDrom();
            HDD hdd = new HDD();

            void copy() {
                power.on();
                dvd.load();
                hdd.copyFromDVD(dvd);
            }
        }

        class Power {
            void on() {
                System.out.println("Включение питания");
            }

            void off() {
                System.out.println("Выключение питания");
            }
        }
        class DVDrom {
            private boolean data = false;

            public boolean hasData() {
                return data;
            }

            void load() {
                data = true;
            }

            void unload() {
                data = false;
            }
        }

        class HDD {
            void copyFromDVD(DVDrom dvd) {
                if (dvd.hasData()) {
                    System.out.println("Происходит копированние данных с диска");
                } else {
                    System.out.println("Вставьте диск с данными");
                }
            }
        }

