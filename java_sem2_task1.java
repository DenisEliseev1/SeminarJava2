import java.io.PrintStream;

/**
 * Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
 * используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */



public class java_sem2_task1 {

    /**
     */
    public static void main(String[] args) {
        String str = "select * from students where";
        String str1 = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        //System.out.println(sqlString(str1));
        //System.out.println(sqlNull (sqlString(str1)));
        str = str + sqlNull (sqlString(str1));
        System.out.println(str);       
              
    }

    public static String sqlNull (String s) {
        String [] strarr = s.split(" ");
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < (strarr.length-3); i+=4) {
           if ((strarr [i+3].contains("null"))==false) {
                s1.append(strarr[i]).append(strarr[i+1]).append(strarr[i+2]).append(strarr[i+3]);
                //System.out.println(s1);
            }            
        }
        s1.append(";");
        s = s1.toString();
        return s;        
    }

    public static String sqlString (String s) {
       s = s.replace("," , " and").replace(":" , " = ").replace("{" , " ").replace("}" , " ");
       return s;
    }


} 
