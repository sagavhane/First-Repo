//package day14;
//import java.io.FileReader;
//import java.lang.reflect.Type;
//import java.util.List;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//
//public class ReadJson {
//
//    public static void main(String[] args) throws Exception {
//
//        Gson gson = new Gson();
//
//        FileReader reader = new FileReader("employees.json");
//
//        Type type = new TypeToken<List<Employee>>() {}.getType();
//
//        List<Employee> employeesList = gson.fromJson(reader, type);
//
//        employeesList.forEach(System.out::println);
//
//        reader.close();
//    }
//}