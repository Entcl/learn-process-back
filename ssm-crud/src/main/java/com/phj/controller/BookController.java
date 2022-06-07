package com.phj.controller;

import com.phj.pojo.Books;
import com.phj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //RequestMapping和方法名可以不一致
    @RequestMapping("/allBook")
    public String test1(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addPaper(Books books) {
        System.out.println(books);
        bookService.addBook(books);
//      重定向的是RequestMapping
        return "redirect:/book/allBook";
    }

//    @RequestMapping("/allBooka")
//    public String test(Books books) {
//        System.out.println("wuqingtieshou");
//        return "jjjjjjj";
//    }
//    @GetMapping(value = "bbb")
//    @ResponseBody
//    public String test2() {
//        String ss = "sadsadsasa";
//        return ss;
//    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {
        Books books = bookService.queryBookById(id);
        System.out.println(books);
        model.addAttribute("book", books);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model, Books book) {
        System.out.println(book);
        bookService.updateBook(book);
        Books books = bookService.queryBookById(book.getBookID());
        model.addAttribute("books", books);
        return "redirect:/book/allBook";
    }


    //    Spring REST 风格可以简单理解为：使用 URL 表示资源时，每个资源都用一个独一无二的 URL 来表示，并使用 HTTP 方法表示操作，即准确描述服务器对资源的处理动作（GET、POST、PUT、DELETE），实现资源的增删改查。
//    GET：表示获取资源
//    POST：表示新建资源
//    PUT：表示更新资源
//    DELETE：表示删除资源
    @RequestMapping("/del/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
//      System.out.println(id);
        bookService.deleteBookById(id);
//      bookService.deleteBookById(id-1);
        return "redirect:/book/allBook";
    }

    @RequestMapping("queryBookByName")
    public String queryBookByName(String bookName, Model model) {
        Books books = (Books) bookService.queryBookByName(bookName);
        System.out.println(bookName);
        System.out.println("query=>"+books);

        List<Books> list = new ArrayList<>();
        list.add(books);

        if (books == null){
            list = bookService.queryAllBook();
            model.addAttribute("err","未查到");
        }

        model.addAttribute("list", list);
        return "allBook";
    }
}
