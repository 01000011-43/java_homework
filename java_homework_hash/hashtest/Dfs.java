package hashtest;
import java.io.*;
import java.security.MessageDigest; //提供信息摘要算法功能：SHA1
import java.util.*;


public class Dfs{
     /**计算一个具体文件的hash值，返回的是一个字节数组 */
    public static byte[] SHA1Checksum(InputStream is) throws Exception{
        //采用一个字节数组做缓冲器
        byte[] buffer = new byte[1024];
        //使用sha1哈希算法，getInstance进行实例化和初始化
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        int numRead = 0;
        do{
            numRead = is.read(buffer);
            //从输入流中读取buffer.length个字节给字节数组buffer，并且返回实际读取的字节数给numRead
            if (numRead > 0){
                complete.update(buffer,0,numRead);
                //使用update方法处理数据
                //把buffer数组中的数据从开始处理到末尾
            }
            //流的末尾返回-1，文件已经读完，退出循环
        }while(numRead != -1);
        //关闭输入流并释放相关资源
        is.close();
        //digest完成hash计算并返回sha1哈希值
        return complete.digest();
        }

        /** 将SHA1Checksum方法返回的字节数组转化为16进制的字符串 */
        public static String convertToHexString(byte data[]){
            //方便后续添加新的内容
            StringBuffer strBuffer = new StringBuffer();
            for(int i = 0;i < data.length;i++){ //遍历字节数组
                //追加16进制表达的字符串到字符串构建器中
                strBuffer.append(Integer.toHexString(0xff & data[i]));
            }//从字符串构建器返回一个字符串对象
            return strBuffer.toString();
        }

        /**传入路径，路径为目录或文件 */
        public static String dfs(String path){
            File dir = new File(path); //File对象
            File[] fs = dir.listFiles(); //返回一个目录下File对象构成的数组
            try{
                MessageDigest m = MessageDigest.getInstance("SHA1");
                for(int i = 0; i < fs.length; i++){
                    if(fs[i].isFile()){
                        FileInputStream isfl = new FileInputStream(fs[i]);
                        byte [] flsha = SHA1Checksum(isfl);
                        String result = convertToHexString(flsha);
                        m.update(result.getBytes());
                        m.update(fs[i].getName().getBytes());
                    }
                    if(fs[i].isDirectory()){
                        m.update(fs[i].getName().getBytes());
                        String dir1 = dfs(path + File.separator + fs[i].getName());
                        m.update(dir1.getBytes());
                    }
                }
                return convertToHexString(m.digest());
            }
            catch(Exception e){
                try{
                    FileInputStream isfl = new FileInputStream(dir);
                    byte[] flsha = SHA1Checksum(isfl);
                    String result = convertToHexString(flsha);
                    return result;
                }
                catch(Exception c){
                    return "路径不存在";
                }
            }
        }

        public static void main(String[] args){
            System.out.println("请输入文件或文件夹的路径：");
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            System.out.println("您要访问的文件或文件夹的hash值为："+dfs(str));
            input.close();
            }
}