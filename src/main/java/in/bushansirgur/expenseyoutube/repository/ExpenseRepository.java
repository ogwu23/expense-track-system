package in.bushansirgur.expenseyoutube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.bushansirgur.expenseyoutube.models.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
