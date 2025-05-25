import java.util.Scanner;

public class WebSiteCheck {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("請輸入網址：");
        String url = sr.nextLine();

        boolean b = url.startsWith("http://") || url.startsWith("https://");
        if(!b){
            url = "https://" + url;
        }

        int lastSlashIndex = url.lastIndexOf("/");
        String fileName = url.substring(lastSlashIndex + 1);

        //方法三，自己想的
        if(url.endsWith("/")){
            url += "index.html";
        }

//        //方法二
//        if(fileName.equals("")){
//            url += "index.html";
//        }

//        //方法一
//        if(lastSlashIndex == url.length() - 1){
//            url += "index.html";
//        }
        int dotIndex = fileName.lastIndexOf(".");
        if(dotIndex == -1){
            url += "/index.html";
        }else{
            String lastFileName = fileName.substring(dotIndex + 1);
//            if(!lastFileName.equals("html") && !lastFileName.equals("htm")){
//                url += "index.html";
//            }
            switch (lastFileName){
                case "html":
                case "htm":
                case "pdf":
                    break;
                default:
                    url += "/index.html";
            }
        }

        System.out.println(url);
    }
}
