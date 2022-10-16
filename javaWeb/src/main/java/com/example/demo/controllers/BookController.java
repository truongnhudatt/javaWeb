package com.example.demo.controllers;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.models.Book;
import com.example.demo.models.ResponseObject;
import com.example.demo.repository.BookRepository;

@Controller
//@RequestMapping("/homebook")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/homebook")
	public String getAllBooks(Model model) {
		Iterable<Book> books = bookRepository.findAll();
//		for(Book b: books) {
//			System.out.println(b);
//		}
		model.addAttribute("books", books);
		return "index";
	}
	
	@GetMapping("/homebook/{bookID}")
	public String getBook(Model model, @PathVariable String bookID) {
		Optional<Book> book = bookRepository.findById(bookID);
		System.out.println(book);
		if(book.isPresent()) {
			model.addAttribute("book",book);
			return "shop-details";
		}
		else
		{	
			ResponseEntity<ResponseObject> resp = ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseObject("FAILED","Cannot find book with id = "+bookID,""));
					
			model.addAttribute("error",resp);
			return "error";
		}
//		return "shop-details";
	}
}
