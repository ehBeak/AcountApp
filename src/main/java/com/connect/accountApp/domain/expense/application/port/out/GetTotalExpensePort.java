package com.connect.accountApp.domain.expense.application.port.out;

import com.connect.accountApp.domain.expense.application.port.out.command.TotalExpenseCommand;
import java.time.LocalDateTime;
import java.util.List;

public interface GetTotalExpensePort {

  List<TotalExpenseCommand> getTotalExpense(Long householdId, LocalDateTime startTime,
      LocalDateTime endTime);

}
