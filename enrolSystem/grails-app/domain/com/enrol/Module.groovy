package com.enrol

class Module {

	String title

	String code

	int credits

	Lecturer lecturer

	String course

	String description



    static constraints = {
		title nullable: false, blank: false
		code nullable: false, blank: false
		credits nullable: false, blank: false, min: 20, max: 120
		lecturer nullable: false, blank: false
		course nullable: false, blank: false, unique: true
		description nullable: false, blank: false, maxSize: 5000, widget: 'textarea'
		    }

}
