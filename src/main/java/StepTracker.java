import java.util.Arrays;
import java.util.HashMap;

public class StepTracker {
    HashMap<Integer, MonthData> monthToData = new HashMap<Integer, MonthData>();

    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }

    class MonthData {
        int MonthDays[];

        MonthData() {
            MonthDays = new int[30];

        }

        void addSteps(int day, int steps) {
            MonthDays[day] = steps;
        }

        @Override
        public String toString() {
            return "MonthData{" +
                    "monthDays='[" + Arrays.toString(this.MonthDays) + '\'' +
                    "]}";
        }
    }

    public static void main(String[] args) {
        StepTracker stepTracker = new StepTracker();

        // записать 1000 шагов за 4 февраля

        stepTracker.monthToData.get(1).addSteps(3, 1000);
        System.out.println(stepTracker.monthToData);
    }
}