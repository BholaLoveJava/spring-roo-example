package com.javatechie.web;
import com.javatechie.domain.Employee;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = EmployeesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Employee.class, type = ControllerType.ITEM)
@RooThymeleaf
public class EmployeesItemThymeleafController implements ConcurrencyManager<Employee> {
}
