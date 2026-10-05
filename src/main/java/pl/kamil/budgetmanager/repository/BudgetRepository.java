package pl.kamil.budgetmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kamil.budgetmanager.model.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
