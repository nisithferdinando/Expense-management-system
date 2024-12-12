package com.expense.Expense.controller;


import com.expense.Expense.dto.IncomeDTO;
import com.expense.Expense.entity.Income;
import com.expense.Expense.services.income.IncomeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/income")
@RequiredArgsConstructor
@CrossOrigin
public class IncomeController {


    private final IncomeService incomeService;

@PostMapping
    public ResponseEntity <?> postIncome( @RequestBody IncomeDTO incomeDTO) {
        Income createdIncome = incomeService.postIncome(incomeDTO);
        if(createdIncome !=null){
            return ResponseEntity.status(HttpStatus.CREATED).body(createdIncome);
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
@GetMapping("/all")
    public ResponseEntity<?> getAllIncomes(){
    return ResponseEntity.ok(incomeService.getAllIncomes());
    }
@PutMapping("/{id}")
    public ResponseEntity<?> updateIncome(@PathVariable Long id, @RequestBody IncomeDTO incomeDTO) {
    try{
        return ResponseEntity.ok(incomeService.updateIncome(id, incomeDTO));
    }
    catch (EntityNotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found "+id);
    }
    catch (Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
    }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getIncomeById(@PathVariable Long id){
    try{
        return ResponseEntity.ok(incomeService.getIncomeById(id));
    }
    catch (EntityNotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
    catch (Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
    }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteIncome(@PathVariable Long id){
        try{incomeService.deleteIncome(id);
        return ResponseEntity.ok().body(null);
        }
        catch (EntityNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }
}