package in.bushansirgur.expenseyoutube.service;

import java.util.List;

import in.bushansirgur.expenseyoutube.models.Expense;

public interface ExpenseService {
	
	List<Expense>findAll();
	
	//create a service method to save the form
	
	void save(Expense expense);
	
	//to edit
	Expense findById(Long id);
	
	// to delete
	
	void delete(Long id);
	

}
