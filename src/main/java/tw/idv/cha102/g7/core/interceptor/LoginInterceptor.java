package tw.idv.cha102.g7.core.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        HttpSession session = request.getSession();
        //Members members = (Members) session.getAttribute("members");
//        if(null != members){
//            return true;
//        }
        System.out.println("執行LoginInterceptor的preHandle");
//        session.setAttribute("preUrl", request.getRequestURI()); //未登入時紀錄
//        response.sendRedirect(request.getContextPath() + "/login.html");
//        return false;
//
//        request.getRequestURL()完整路徑
//        request.getRequestURI()後綴路徑
//
//        tempContextUrl 域名
//        response.sendRedirect 重定向
//        response.sendRedirect(tempContextUrl + "login"); //重新導向到login頁面

//        return false;
        return true; //暫時放行 等待members實作
    }
}
