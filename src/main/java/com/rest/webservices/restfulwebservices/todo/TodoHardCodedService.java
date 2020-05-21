package com.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {
	private static List<Todo> todos = new ArrayList();
	private static int idCounter = 0;
	static {
		todos.add(new Todo(++idCounter, "Prity", "Learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter, "Prity", "Learn SpringBoot", new Date(), false));
		todos.add(new Todo(++idCounter, "Prity", "Learn Angular", new Date(), false));
	}

	public List<Todo> findAll() {
		return todos;
	}

	public Todo Save(Todo todo ){
		if(todo.getId()==-1||todo.getId()==0){                   //In JPA for insert 
			todo.setId(++idCounter);
			todos.add(todo);
		}
		else {
			deleteById(todo.getId());               //for update first delete then add
			todos.add(todo);
		}
		return todo;
		
	}

	public Todo deleteById(long id) {
		// TODO Auto-generated method stub
		Todo todo = findById(id);
		if (todo == null)
			return null;
		if (todos.remove(todo)) {
			return todo;
		}
		return null;
	}

	public Todo findById(long id) {
		// TODO Auto-generated method stub
		for (Todo todo : todos) {
			if (todo.getId() == id)
				return todo;
		}
		return null;
	}
}
