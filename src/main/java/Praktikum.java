import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Praktikum {
    static class OfficeToolData {
        String data;
        int count;

        public OfficeToolData(String data, int count) {
            this.data = data;
            this.count = count;
        }

        public String returnStringStuff() {
            return "stuff";
        }

        public String throwException() {
            throw new RuntimeException("exception description");
        }

        public String returnStringStuff(String stuff) {
            int i = Integer.parseInt(stuff);
            return stuff;
        }

        @Override
        public String toString() {
            return "MonthData{" +
                    "data='" + data + '\'' + ", count='" + count + '\'' +
                    '}';
        }
    }

    public static class Palindrome {

        public boolean isPalindromeLine(String str) {
            StringBuilder sb1 = new StringBuilder(str.toLowerCase());
            while (sb1.indexOf(" ") != -1) {
                sb1 = sb1.deleteCharAt(sb1.indexOf(" "));
            }
            StringBuilder sb2 = new StringBuilder(sb1.reverse());
            System.out.println(sb1.toString());
            System.out.println(sb2.toString());

            if(sb1.toString().equals(sb2.toString())) {
                return true;
            } else return false;
        }
    }


    public static class GradesReversed {

        private String gradeStringToInt(String grade) {
            switch (grade) {
                case "Безупречно": {
                    return "5";
                }
                case "Потрясающе": {
                    return "4";
                }
                case "Восхитительно": {
                    return "3";
                }
                case "Прекрасно": {
                    return "2";
                }
                default:
                    return "1";
            }
        }

        public String serializeGrades(String[] grades) {
            String join0 = String.join(" ", grades);
            String[] split0 = join0.split(" ");
            String list = String.join(",", split0[0].toLowerCase(), split0[1].toLowerCase(),
                    split0[2], gradeStringToInt(split0[4]));
            String list2 = String.join(";", list);
            return list2;
        }
    }

    public static class CheckPrinter {
        public void printCheck(String[] items) {
            for (String item: items) {
                String[] split = item.split(", ");
                System.out.printf("%-10s%-7s%-7s\n", split[0] + ",", split[1] + ",", split[2]);
            }
        }
    }

    public static String getRandomHexString(int numchars){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while(sb.length() < numchars){
            sb.append(Integer.toHexString(r.nextInt()));
        }

        return sb.toString().substring(0, numchars);
    }

    List<String> readFileContents(String path) {
        try {
            return Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно файл не находится в нужной директории.");
            return Collections.emptyList();
        }
    }

    public static void main(String[] args) {



        List<String> strings = new ArrayList<>();
        for (String s: strings) {
            // обработка каждой строки
        }

        String hex1 = getRandomHexString(32);
        System.out.println(hex1 + " of length " + hex1.length());

        CheckPrinter checkPrinter = new CheckPrinter();
        checkPrinter.printCheck(
                List.of("Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75").toArray(new String[0]));

        GradesReversed gradesReversed = new GradesReversed();
        String grades = gradesReversed.serializeGrades(List.of(
                "Вероника Чехова физика — Безупречно",
                "Анна Строкова математика — Потрясающе",
                "Иван Петров геометрия — Безупречно").toArray(new String[0]));

        String test = "Молебен о коне белом";
        Palindrome pp = new Palindrome();
        boolean isAPP = pp.isPalindromeLine(test);

        String a = "20:00 ";
        a = a.trim();

        HashMap<Integer, OfficeToolData> zoo = new HashMap<>();
        zoo.put(1, new OfficeToolData("Степлер",1));
        OfficeToolData officeTool1 = zoo.get(1);
        officeTool1.count=2;
        zoo.put(1, officeTool1);

        HashMap<String, OfficeToolData> officeTool = new HashMap<>();
        officeTool.put("S234", new OfficeToolData("Степлер",1));
        officeTool.put("P342", new OfficeToolData("Ножницы", 2));
        officeTool.put("N845", new OfficeToolData("Ручка", 3));

        // System.out.println(officeTool.get("P342").returnStringStuff(null));
        System.out.println(officeTool.get("P342").returnStringStuff());

        System.out.println(officeTool);
        System.out.println("---");
        System.out.println(officeTool.get("P342"));
        System.out.println("---");
        System.out.println(officeTool.get("P342").data);
        System.out.println("---");
        System.out.println(officeTool.get("P342").returnStringStuff());
        System.out.println("---");
        //System.out.println(officeTool.get("P342").returnStringStuff("a"));
    }
}