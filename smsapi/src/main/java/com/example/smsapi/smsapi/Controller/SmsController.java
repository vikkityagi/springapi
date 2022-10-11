package com.example.smsapi.smsapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.smsapi.smsapi.Model.Smsbean;
import com.example.smsapi.smsapi.Repository.SmsRepo;

import com.twilio.Twilio;
import com.twilio.exception.AuthenticationException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class SmsController {
	
	@Autowired
	SmsRepo smsrepo;
	
	@PostMapping(value="/add")
	public Smsbean adduser(@RequestBody Smsbean smsbean) {
		smsrepo.save(smsbean);
		return smsbean;
	}
	
	public List<Smsbean> showuser(){
		return smsrepo.findAll();
	}
	
	@GetMapping(value="/")
	public void userlist() {
		List list = showuser();
		for(int i = 0;i<list.size();i++) {
			System.out.println( list.get(i));
			System.out.println(((Smsbean) list.get(i)).getMobile_no());
			try {
				Twilio.init(System.getenv("AC96d044a10188121031f6be9e5dc492b5"), System.getenv("156008a07ceb0c499ef79335893b4319"));
				Message.creator(new PhoneNumber("((Smsbean) list.get(i)).getMobile_no()"),
                        new PhoneNumber("7017345391"), "((Smsbean) list.get(i)).getSms_content").create();
			}catch(AuthenticationException e) {
				e.printStackTrace();
			}
			
			System.out.println(((Object)new ResponseEntity<String>("Message sent successfully", HttpStatus.OK)).getClass().getSimpleName());
            System.out.println(new ResponseEntity<String>("Message sent successfully", HttpStatus.OK));
		}
		
	}

}
