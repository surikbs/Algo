import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String machines  = "db-100,64,10000,8|db-101,64,10000,8|db-102,64,10000,8|db-201,32,8000,6|db-202,32,8000,6|db-203,32,8000,6|db-204,32,8000,6|db-205,32,8000,6|app-301,16,2000,20|app-302,16,2000,20|app-303,16,2000,20|app-304,16,2000,20|app-305,16,2000,20|app-401,24,2400,20|app-402,24,2400,20|app-403,24,2400,20|app-404,24,2400,20|app-405,24,2400,20|app-411,16,2400,24|app-412,16,2400,24|app-413,24,2400,24|app-414,24,2400,24|app-415,32,2400,24|ifr-501,48,200,48|ifr-502,48,200,48|ifr-503,48,200,48|ifr-504,48,200,48|ifr-505,48,200,48|qa-101,28,4000,6|qa-102,28,4000,6|qa-103,28,4000,6|qa-104,28,4000,6|qa-105,28,4000,6";
        String[] delimited = machines.split("\\|");

        List<String> al = new ArrayList<>();
        al = Arrays.asList(delimited);
        for(String s: al){
            String[] test = s.split(",");
        }
//        for( int i = 0; i < delimited.length; i ++) {
//            System.out.println(delimited[i]);
//        }
    }
}


//{appname: test[0] { cpu: test[1], ram: 10000, process: 8 }}