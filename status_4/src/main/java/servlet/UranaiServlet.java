package servlet;

import java.io.IOException;

import java.io.PrintWriter;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

import main.Status;

@WebServlet("/sts")

public class UranaiServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response)

            throws ServletException, IOException {

        // Statusクラスで運勢を取得

        Status status = new Status();

        String luck = status.getResult();

        // 実行日を取得

        LocalDate date = LocalDate.now();

        DateTimeFormatter formatter =

                DateTimeFormatter.ofPattern("MM月dd日");

        String today = date.format(formatter);

        // HTMLを出力

        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");

        out.println("<html>");

        out.println("<head>");

        out.println("<meta charset=\"UTF-8\">");

        out.println("<title>占い</title>");

        out.println("</head>");

        out.println("<body>");

        out.println("<p>" + today + "の運勢は「" + luck + "」です</p>");

        out.println("</body>");

        out.println("</html>");

    }

}
 