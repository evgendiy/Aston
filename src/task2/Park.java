package task2;

/**
 * 3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
 * времени их работы и стоимости.
 */
public class Park {

    public Attraction attractionCreation(String name, String startTime, String endTime, int ridingTime, int minAge, int maxAge, double price) {
        return new Attraction(name, startTime, endTime, ridingTime, minAge, maxAge, price);
    }


    public class Attraction {
        private String name;
        private String startTime;
        private String endTime;
        private int ridingTime;

        private int minAge;
        private int maxAge;
        private double price;

        public Attraction(String name, String startTime, String endTime, int ridingTime, int minAge, int maxAge, double price) {
            this.name = name;
            this.startTime = startTime;
            this.endTime = endTime;
            this.ridingTime = ridingTime;
            this.minAge = minAge;
            this.maxAge = maxAge;
            this.price = price;
        }

        public void showInfo() {
            System.out.println("Название атракциона: " + name + "\n" +
                    "Время работы: " + startTime + " - " + endTime + "\n" +
                    "Время катания: " + ridingTime + " мин." + "\n" +
                    "Возраст: от " + minAge + " до " + maxAge + " лет" + "\n" +
                    "Цена: " + price);
        }

    }
}