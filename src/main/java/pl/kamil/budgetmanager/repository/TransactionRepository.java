package pl.kamil.budgetmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kamil.budgetmanager.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
