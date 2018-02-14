package com.enrol

class Leader {

	String fullName

	String department

	String subject
	
	String leaderEmail

	String username

	String password

	String office

	String bio

	
String toString(){

	return fullName

	}		


    static constraints = {
	
		fullName nullable: false, blank: false
		department nullable: false, blank: false
		subject nullable: false, blank: false
		leaderEmail nullable: false, blank: false, unique: true, email:true
		username nullable: false, blank: false, unique: true
		password nullable: false, blank: false
		office nullable: false, blank: false
		bio nullable: false, blank: false, maxSize: 5000, widget: 'textarea'
    }
}
