package br.com.eberc.todolist.services;

public class BadRequestException extends RuntimeException{
        public BadRequestException(String message) {
          super(message);
        }   
}
