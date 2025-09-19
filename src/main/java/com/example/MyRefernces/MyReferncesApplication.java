package com.example.MyRefernces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.MyRefernces.Books.Book;
import com.example.MyRefernces.Books.BookRep;
import com.example.MyRefernces.CheckOut.Employee;
import com.example.MyRefernces.CheckOut.Rep;
import com.example.MyRefernces.CheckOut.User;
import com.example.MyRefernces.CheckOut.UserRep;

@SpringBootApplication
public class MyReferncesApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext c=	SpringApplication.run(MyReferncesApplication.class, args);
		
		Rep re=c.getBean(Rep.class);
		
	//	System.out.println(re.findAll());
//		List<Employee> l=re.findAll(Sort.by("dept").descending());
//		
//		l.forEach(a->System.out.println(a));
		
		//Sort s=Sort.by(Sort.Order.asc("dept"),Sort.Order.desc("name"));
//
//		List<Employee> li=re.findAll(s);
//		 
//		   li.forEach(b->System.out.println(b));

		
//		Integer pagno =0;
//		Integer pagsize =2;
		
//		PageRequest pr=	PageRequest.of(pagno, pagsize);
//		
//		Page<Employee> pagData=re.findAll(pr);
//		
//		pagData.forEach(a->System.out.println(a));
//		
//		System.out.println(pagData.getTotalPages());

		
//	     PageRequest req2=PageRequest.of(pagno, pagsize, s);
//	     Page<Employee> page=re.findAll(req2);
//	     page.forEach(d->System.out.println(d));

		
//	     Employee emp=new Employee();
//	     emp.setName("Sravana");
//	     emp.setDept("java");
//	 List<Employee> emp1=  re.findAll( Example.of(emp));
//	emp1.forEach(t->System.out.println(t));

		
//		User u=new User();
//		u.setId(10);
//		u.setName("user1");
//		u.setDept("javajava");
//		UserRep repo1=c.getBean(UserRep.class);
//		repo1.save(u);
//		 
//		repo1.update();
		
		ArrayList<Book> a=new ArrayList<>();
		a.add(new Book("Tamil","Saravana","language",100l));
		a.add(new Book("English", "Sanjai", "language", 120L));
		a.add(new Book("Maths", "tamil", "education", 150L));
		a.add(new Book("Science", "vasee", "education", 200L));
		a.add(new Book("History", "Santhosh", "arts", 180L));
		
		BookRep b=c.getBean(BookRep.class);
		//b.saveAll(a);
//		List<Book> l=b.findnameAndPrice();
//		System.out.println(l);
//		
//		List<Book> li=b.findBooksByAuthor("saravana");
//		System.out.println(li);
//		
//		List<Book> lis=b.filterByCategoryAndPrice("language", 99l);
//		System.out.println(lis);
		
		Integer pagno =0;
		Integer pagsize =1;
		
		PageRequest pr=	PageRequest.of(pagno, pagsize);
		
		Page<Book> pagData=b.findAll(pr);
		
	    pagData.forEach(z->System.out.println(z));
		
		System.out.println(pagData.getTotalPages());
		
		
	}

}
