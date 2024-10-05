package com.javatpoint.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
return "Hello javaTpointsssss";
}
@RequestMapping("/hello")
public String hello1() 
{
return "Hello 2nd Method";
}
}
