/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmv.validator;

//import com.tmv.pojos.User;
//import java.util.Set;
//import javax.validation.ConstraintViolation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
///**
// *
// * @author PC
// */
//@Component
//public class WebAppValidator implements Validator{
////    @Autowired
////    private javax.validation.Validator beanValidator;
//    
//    private Set<Validator> springValidator;
//    
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return User.class.isAssignableFrom(clazz);
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
////        Set<ConstraintViolation<Object>> beans = this.beanValidator.validate(target);
////        
////        for(ConstraintViolation<Object>  obj : beans){
////            errors.rejectValue(obj.getPropertyPath().toString(), obj.getMessageTemplate(), obj.getMessage());
////        }
//        
//        
//        for(Validator v: this.springValidator)
//            v.validate(target, errors);
//    }
//
//    /**
//     * @param springValidator the springValidator to set
//     */
//    public void setSpringValidator(Set<Validator> springValidator) {
//        this.springValidator = springValidator;
//    }
//    
//}
