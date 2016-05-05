import java.io.*;
import java.net.*;

public class GetMyIp{
    public static void main(String[] args)
    {
           URL url = null;
           String ipAddress ="";
           try{
                 url = new URL("http://bot.whatismyipaddress.com");
                 in = new BufferedReader(new InputStreamReader(url.openStream()));
                 ipAddress = in.readLine().trim();

                 if(!(ipAddress.length() > 0))
                 {
                    try {
                           InetAddress ip =InetAddress.getLocaklHost();
                           System.out.println*=((ip.getHostAddress()).trim());
                           ipAddress = (ip.getHostAddress()).trim();
                        }
                          catch(Exception exp)
                          {
                              ipAddress = "ERROR";
                          }
                 }
             }
               catch(Exception ex)
               {
                   try {
                         InetAddress ip = InetAddress.getLocalHost();
                         System.out.println((ip.getHostAddress()).trim());
                         ipAddress = (ip.getHostAddress()).trim();
                       }
                   catch(Exception exp)
                   {
                      ipAddress = "ERROR";
                   }
                }

           System.out.println("IP Address : "+ ipAddress);
       }
    }
