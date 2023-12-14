import java.util.HashMap;

public class Praktikum {
    static class OfficeToolData {
        String data;
        int count;
//test

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

    public static void main(String[] args) {
        HashMap<String, OfficeToolData> officeTool = new HashMap<>();
        officeTool.put("S234", new OfficeToolData("Степлер",1));
        officeTool.put("P342", new OfficeToolData("Ножницы", 2));
        officeTool.put("N845", new OfficeToolData("Ручка", 3));

        // System.out.println(officeTool.get("P342").returnStringStuff(null));
        // System.out.println(officeTool.get("P342").throwException());

        System.out.println(officeTool);
        System.out.println("---");
        System.out.println(officeTool.get("P342"));
        System.out.println("---");
        System.out.println(officeTool.get("P342").data);
        System.out.println("---");
        System.out.println(officeTool.get("P342").returnStringStuff());
        System.out.println("---");
        System.out.println(officeTool.get("P342").returnStringStuff("a"));
    }
}