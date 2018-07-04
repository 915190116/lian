import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(name = "Http", urlPatterns = {"/Http"})

public class Http extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");

        //接收json的字符串
        BufferedReader br = request.getReader();
        String str, wholeStr = "";
        while((str = br.readLine()) != null){
            wholeStr += str;
        }
        //将json字符串转化为json格式
        JSONObject jsonObject1 = JSONObject.fromObject(wholeStr);


//        String name = request.getParameter("user");
//        String pass = request.getParameter("pass");

        //取出json值
        String name = jsonObject1.getString("user");
        String pass = jsonObject1.getString("pass");

        //传入数据库验证
        Sql sql = new Sql();
        boolean a=sql.xian(name,pass);

        //创建json对象,若为true则将跳转的URL返回
        JSONObject jsonObject = new JSONObject();
        if (a) {
            jsonObject.put("url", "./Html/aa.jsp");
//            response.getWriter().println("./Html/aa.jsp");
        }
//        传出
        response.getWriter().println(jsonObject.toString());
        //刷新缓存
        response.getWriter().flush();
        //关闭流
        response.getWriter().close();


//        //使用ajax后不允许重定向
//        if (a == true) {
//            //实现跳转,该方法只能用一次--直接转发
////            request.getRequestDispatcher("/Html/aa.jsp").forward(request,response);
//            // 实现跳转,可用多次--间接转发(重定向)
//            response.sendRedirect("/web/Html/aa.jsp");
//        } else {
//            JOptionPane.showMessageDialog(null,"登录失败");
//        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}
