package sample;

import java.io.*;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
@WebServlet(urlPatterns = {"/Student"})

public class Student extends HttpServlet
{
    
    static ArrayList student=new ArrayList();
    static ArrayList room_details=new ArrayList();
    static String a="";
    String type,box,pwd,num;
    static int f;
    public void room_details(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html>\n" +
"    <head>\n" +
"        <title>Online Student Accomodation System</title>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"        <style>\n" +
"    table,th, td \n" +
"    {\n" +
"        border: 1px solid black;\n" +
"        border-collapse: collapse;\n" +
"        text-align: center;\n" +
"    }\n" +
"    th{\n" +
"        background-color:indianred;\n" +
"    }\n" +
"    ul \n" +
"    {\n" +
"        list-style-type: none;\n" +
"        margin: 0;\n" +
"        padding: 0;\n" +
"        overflow: hidden;\n" +
"        background-color: rgb(46, 44, 44);\n" +
"    }\n" +
"\n" +
"    li \n" +
"    {\n" +
"        float: left;\n" +
"    }\n" +
"\n" +
"    li a \n" +
"    {\n" +
"        display: block;\n" +
"        padding: 8px;\n" +
"        color: honeydew;\n" +
"    }\n" +
"    \n" +
"    </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <ul>\n" +
"            <li><a href=\"#home\">Home</a></li>\n" +
"            <li><a href=\"insert.html\">Insert</a></li>\n" +

"            <li><a href=\"update.html\">Update</a></li>\n" +
"            <li><a href=\"delete.html\">Delete</a></li>\n" +
"            <li><a href=\"index.html\">Logout</a></li>\n" +               
"            \n" +
"        </ul>\n" +
"        <div class=\"intro\">\n" +
"        <h2 style=\"position: center;\">Room Details</h2>\n" +
"        <table style=\"width:100%\">\n" +
"  <tr>\n" +
"    <th ><b>RoomNo</b></th>\n" +
"    <th ><b>Room_location</b></th> \n" +
"    <th ><b>Roomtype</b></th>\n" +
"    <th ><b>Charge</b></th>\n" +
"    <th ><b>Room_Status</b></th>\n" +
"    <th ><b>Payment_status</b></th>\n" +

"    \n" +
"  </tr>" );
        
 
for(int i=0;i<room_details.size();)  
{
    pw.println(" <tr>\n" +
"    <td>"+room_details.get(i)+" </td>\n" +
"    <td> "+room_details.get(i+1)+"</td>\n" +
"    <td> "+room_details.get(i+2)+"</td>\n" +
"    <td> "+room_details.get(i+3)+"</td>\n" +
"    <td> "+room_details.get(i+4)+"</td>\n" +
"    <td>Not paid</td>\n" +

"    \n" +
"  </tr>");
    i=i+5;
}
        
        
pw.println(
"</table>\n" +
"\n" +
"</body>\n" +
"</html>\n" +
"\n" +
"");

    }


public void student_room(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html>\n" +
"    <head>\n" +
"        <title>Online Student Accomodation System</title>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"        <style>\n" +
"    table,th, td \n" +
"    {\n" +
"        border: 1px solid black;\n" +
"        border-collapse: collapse;\n" +
"        text-align: center;\n" +
"    }\n" +
"    th{\n" +
"        background-color:indianred;\n" +
"    }\n" +
"    ul \n" +
"    {\n" +
"        list-style-type: none;\n" +
"        margin: 0;\n" +
"        padding: 0;\n" +
"        overflow: hidden;\n" +
"        background-color: rgb(46, 44, 44);\n" +
"    }\n" +
"\n" +
"    li \n" +
"    {\n" +
"        float: left;\n" +
"    }\n" +
"\n" +
"    li a \n" +
"    {\n" +
"        display: block;\n" +
"        padding: 8px;\n" +
"        color: honeydew;\n" +
"    }\n" +
"    \n" +
"    </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <ul>\n" +
"            <li><a href=\"index.html\"><button type=\"submit\" name=\"submit\" value=\"Home\" >Home</button></a></li>\n" +
"          <li><a href=\"#\"> <form action=\"Student\" method=\"POST\"><button type=\"submit\" name=\"submit\" value=\"Checkin\" >Checkin</button></form></a></li>\n" +
"            <li><a href=\"index.html\"><button type=\"submit\" name=\"submit\" value=\"Logout\" >Logout</button></a></li>\n" +
         
"            \n" +
"        </ul>\n" +
"        <div class=\"intro\">\n" +
"        <h2 style=\"position: center;\">Accomodation Details </h2>\n" +
"        <table style=\"width:100%\">\n" +
"  <tr>\n" +
"    <th ><b>RoomNo</b></th>\n" +
"    <th ><b>Room_location</b></th> \n" +
"    <th ><b>Roomtype</b></th>\n" +
"    <th ><b>Charge</b></th>\n" +
"<th >CheckIn</th>\n"+
    
"    \n" +
"  </tr>" );
        
 
for(int i=0;i<room_details.size();)  
{
    if(a.equals(room_details.get(i+4))){
          pw.println(" <tr>\n" +
"    <td>"+room_details.get(i)+" </td>\n" +
"    <td> "+room_details.get(i+1)+"</td>\n" +
"    <td> "+room_details.get(i+2)+"</td>\n" +
"    <td> "+room_details.get(i+3)+"</td>\n" +
"<td><a href=\"#\"><form action=\"Student\" method=\"POST\"><button type=\"submit\" name=\"submit\" value=\"checkout"+room_details.get(i)+"\" >Checkout</button></form></a></td>\n" +

"    \n" +
"  </tr>");
   
    }
     i=i+5;
  
}
        
        
pw.println(
"</table>\n" +
"\n" +
"</body>\n" +
"</html>\n" +
"\n" +
"");
    }

public void accomodation_details(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html>\n" +
"    <head>\n" +
"        <title>Online Student Accomodation System</title>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"        <style>\n" +
"    table,th, td \n" +
"    {\n" +
"        border: 1px solid black;\n" +
"        border-collapse: collapse;\n" +
"        text-align: center;\n" +
"    }\n" +
"    th{\n" +
"        background-color:indianred;\n" +
"    }\n" +
"    ul \n" +
"    {\n" +
"        list-style-type: none;\n" +
"        margin: 0;\n" +
"        padding: 0;\n" +
"        overflow: hidden;\n" +
"        background-color: rgb(46, 44, 44);\n" +
"    }\n" +
"\n" +
"    li \n" +
"    {\n" +
"        float: left;\n" +
"    }\n" +
"\n" +
"    li a \n" +
"    {\n" +
"        display: block;\n" +
"        padding: 8px;\n" +
"        color: honeydew;\n" +
"    }\n" +
"    \n" +
"    </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <ul>\n" +
"            <li><a href=\"index.html\"><button type=\"submit\" name=\"submit\" value=\"Home\" >Home</button></a></li>\n" +
"         <li><a href=\"#\">  <form action=\"Student\" method=\"POST\"><button type=\"submit\" name=\"submit\" value=\"Checkin\" >Checkin</button></form></a></li>\n" +
"            <li><a href=\"index.html\"><button type=\"submit\" name=\"submit\" value=\"Logout\" >Logout</button></a></li>\n" +
         
"            \n" +
"        </ul>\n" +
"        <div class=\"intro\">\n" +
"        <h2 style=\"position: center;\">Accomodation Details</h2>\n" +
"        <table style=\"width:100%\">\n" +
"  <tr>\n" +
"    <th ><b>RoomNo</b></th>\n" +
"    <th ><b>Room_location</b></th> \n" +
"    <th ><b>Roomtype</b></th>\n" +
"    <th ><b>Charge</b></th>\n" +
"<th ><a href=\"#\">Checkout</a></th>\n"+
    
"    \n" +
"  </tr>" );
        
int j=0; 
for(int i=0;i<room_details.size();)  
{
  
    if(room_details.get(i+4).equals("Available")){
          pw.println(" <tr>\n" +
"    <td>"+room_details.get(i)+" </td>\n" +
"    <td> "+room_details.get(i+1)+"</td>\n" +
"    <td> "+room_details.get(i+2)+"</td>\n" +
"    <td> "+room_details.get(i+3)+"</td>\n" +
"<td><a href=\"#\"><form action=\"Student\" method=\"POST\"><button type=\"submit\" name=\"submit\" value=\"check-in"+j+"\" >Checkin</button></form></a></td>\n" +

"    \n" +
"  </tr>");
    
    }
    i=i+5;
    j++;
  
}
    
        
pw.println(
"</table>\n" +
"\n" +
"</body>\n" +
"</html>\n" +
"\n" +
"");
    }


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        ArrayList student1 = new ArrayList();
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        String sub = req.getParameter("submit");
        if (sub.equals("register"))
        {
            f = 1;
            num = req.getParameter("e-mail");
            pwd = req.getParameter("pw");
            type = req.getParameter("f_name");
            box = req.getParameter("l_name");
           res.sendRedirect("index.html");
        } else if (sub.equals("login"))
        {

            num = req.getParameter("e-mail");
            pwd = req.getParameter("pw");
            if(num.equalsIgnoreCase("admin@gmail.com") && pwd.equals("12345"))
            {    
               
               room_details(req,res);
            }
            
//        Stud_Marks = req.getParameter("smarks");
            for (int i = 0; i < student.size(); i = i + 2) 
            {
                if (num.equals(student.get(i)) && pwd.equals(student.get(i+1))) 
                {
                  a="Room occupied by ";
                  a=a+num;
                  
                  student_room(req,res);
                  
                }
            }
        }
        else if (sub.equals("cr"))
        {
            f = 1;
            num = req.getParameter("rn");
            pwd = req.getParameter("rl");
             type = req.getParameter("rt");
            box = req.getParameter("ch");
            room_details.add(num);
            room_details.add(pwd);
            room_details.add( type);
            room_details.add(box);
            room_details.add("Available");
           room_details(req,res);
        }
        else if (sub.equals("cr1"))
        { 
            int c=0;
            
            num = req.getParameter("rn1");
            pwd = req.getParameter("rl1");
             type = req.getParameter("rt1");
            box = req.getParameter("ch1");
            for(int i=0;i<room_details.size();i=i+5)
            {
                if(num.equals(room_details.get(i)))
                {
                    c=1;
                    room_details.set(i,num);
                room_details.set(i+1,pwd);
                room_details.set(i+2, type);
                room_details.set(i+3,box);
                room_details.set(i+4,"Available");
                room_details(req,res);
                }
            }
            if(c==0)
            {
                pw.println("<html>\n" +
"    \n" +
"    <body>\n" +
"        <script>\n" +
"            alert(\"Room id does not exist\");\n" +
                        "location.replace(\"update.html\")\n"+
"            </script>\n" +
"    </body>\n" +
"    \n" +
"</html>");
                
            }
            
        }  
        else if(sub.equals("Checkin"))
        {
           accomodation_details(req,res); 
        }
        
         else if(sub.startsWith("check-in"))
        {
           String c=sub.substring(8);
           
           
           int n=Integer.parseInt(c);
           room_details.set((n*5)+4,a);
           student_room(req,res);
        }   
        else if(sub.equals("del"))
        {
           num = req.getParameter("rn2");
           int c=0;
           for(int i=0;i<room_details.size();i=i+5)
           {
               if(num.equals(room_details.get(i)))
               {
                   c=1;
                   room_details.remove(i);
                   room_details.remove(i);
                   room_details.remove(i);
                   room_details.remove(i);
                   room_details.remove(i);
                   break;
               }
           }
           if(c==1)
           {
               room_details(req,res);
           }
           else
           {
              pw.println("<html>\n" +
"    \n" +
"    <body>\n" +
"        <script>\n" +
"            alert(\"Room id does not exist\");\n" +
                        "location.replace(\"delete.html\")\n"+
"            </script>\n" +
"    </body>\n" +
"    \n" +
"</html>"); 
           }
        } 
        
        else if(sub.startsWith("checkout"))
        {
           
           String s=sub.substring(8);
           for(int i=0;i<room_details.size();i=i+5)
           {
               if(s.equals(room_details.get(i)))
               {
                   room_details.set(i+4,"Available");
                   break;
               }
           }
           student_room(req,res);
        }   
        
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        PrintWriter pw = res.getWriter();
        Student ob = new Student();
        ob.doGet(req, res);
        if (f == 1) {
            f = 0;
            student.add(ob.num);
            student.add(ob.pwd);
        }
        pw.close();
    }

}