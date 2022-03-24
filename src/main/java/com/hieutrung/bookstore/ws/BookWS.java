/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hieutrung.bookstore.ws;

import com.hieutrung.bookstore.dao.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author PC
 */

//đây chính là 1 Servlet, trả về data thô JSON qua các hàm của class
//vấn đề làm sao để gọi được class này từ nơi khác, ngoài server
//Gọi qua URL => cơ chế mapping
//map UURRL vào 1 method của 1 class nào đó
//Tuy nhiên , Tomcat chỉ quan tâm tới request nói chung 
//Nhưng trong code này của chúng ta có tới 2 thành phần khác biệt
//-Servlet/JSP/HTML dùng cho web truyền thống
//-API trả vè JSON data tho
// Làm sao để Tomcat phân biệt
// => Ta phải cấu hình riêng cái URL giành cho API
// URL truyền thống sẽ giành cho web App
// App chúng ta đang 2 trong 1: 1 cho end-user, 1 cho API

//localhost:6969/tên app => truyền thống web app
//

//localhost:6969/tên app/ API => gọi API
//api/ hay đặt tên gì cũng được



//https://bookstore.com/ => end-user
//https://bookstore.com/api/books => den duoc class nay

@Path("books")

public class BookWS {
    
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String sayHelloFromAPI(){
//	return "This a message";
//    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getABook(){
	return new Book("123123", "Tôi thấy hoa nhài cắm bãi", "Gì Gì Đó", 2, 2022);
    }

}
