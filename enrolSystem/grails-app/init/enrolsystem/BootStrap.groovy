package com.enrol

class BootStrap {

    def init = { servletContext ->

	
	
	def tom=new Leader (fullName: 'Dr Tom Thomson',
				department: 'Computing',
				subject: 'System Architectures',
				leaderEmail: 't.thomson@email.com',
				office: 'B-9432',
				username:'tdonald',
				password: 'secret',
				bio: '''Lorem Ipsum this is a bio'''
				).save()

	def sam=new Leader (fullName: 'Dr Sam Samson',
				department: 'Computing',
				subject: 'Web Design',
				leaderEmail: 's.samson@email.com',
				office: 'C-7432',
				username:'ssamson',
				password: 'secret',
				bio: '''Lorem Ipsum this is a bio'''
				).save()

	def david=new Leader (fullName: 'Dr David Davidson',
				department: 'Computing',
				subject: 'Web Application Design',
				leaderEmail: 'd.davidson@email.com',
				office: 'C-7732',
				username:'ddavids',
				password: 'secret',
				bio: '''Lorem Ipsum this is a bio'''
				).save()


	def course1=new Course (title: 'BSc Hons Computing',
				department: 'Computing',
				leader: david,
				code: 'IMA101',
				startDate: new Date('19/09/2017'),
				endDate: new Date('19/09/2020'),
				numberOfStudents:55,
				studyMode:'FullTime',
				tuitionFees:9000,
				description: '''Lorem Ipsum this is a description'''
				).save()

	def course2=new Course (title: 'BSc Hons Web Design',
				department: 'Computing',
				leader: sam,
				code: 'IMA102',
				startDate: new Date('22/09/2017'),
				endDate: new Date('22/09/2020'),
				numberOfStudents:35,
				studyMode:'FullTime',
				tuitionFees:9000,
				description: '''Lorem Ipsum this is a description'''
				).save()

	def course3=new Course (title: 'BSc Hons Information Systems',
				department: 'Computing',
				leader: tom,
				code: 'IMA103',
				startDate: new Date('23/09/2017'),
				endDate: new Date('24/09/2020'),
				numberOfStudents:21,
				studyMode:'FullTime',
				tuitionFees:9000,
				description: '''Lorem Ipsum this is a description'''
				).save()

	def student1=new Student (name: 'Jane Armando',
				studentID: 'b38845',
				dob: new Date('10/11/1996'),
				email: 'kst@email.com',
				isFundingAvailable: true,
				username:'rvg96',
				password:'secret',
				course:course1
				).save()

	def student2=new Student (name: 'John Johnson',
				studentID: 'b37753',
				dob: new Date('05/12/1997'),
				email: 'jjs@email.com',
				isFundingAvailable: true,
				username:'jjs97',
				password:'secret2',
				course:course2
				).save()

	def student3=new Student (name: 'Sam Samson',
				studentID: 'b46534',
				dob: new Date('06/06/1990'),
				email: 'sson@email.com',
				isFundingAvailable: true,
				username:'ssn90',
				password:'secret',
				course:course3
				).save()


	def lect1=new Lecturer (fullName: 'Dr Steve Crossbar',
				post: 'Lecturer',
				lecturerEmail: 's.h.crossbar@theUni.ac.uk',
				subject: 'Web Design',
				office: 'Office-2211',
				bio: '''Lorem Ipsum this is a bio'''
				).save()

	def lect2=new Lecturer (fullName: 'Dr Sally Peters',
				post: 'Lecturer',
				lecturerEmail: 's.h.peters@theUni.ac.uk',
				subject: 'System Architectures',
				office: 'Office-2213',
				bio: '''Lorem Ipsum this is a bio'''
				).save()

	def lect3=new Lecturer (fullName: 'Dr Moose Goose',
				post: 'Lecturer',
				lecturerEmail: 'm.m.goose@theUni.ac.uk',
				subject: 'Web Application Design',
				office: 'Office-2234',
				bio: '''Lorem Ipsum this is a bio'''
				).save()

	def module1=new Module (title: 'System Architectures',
				code: 'SYS234',
				credits: 20,
				lecturer: lect2,
				course: 'BSc Hons Computing',
				description: '''Lorem Ipsum this is a description'''
				).save()

	def module2=new Module (title: 'Web Design',
				code: 'WAD123',
				credits: 20,
				lecturer: lect1,
				course: 'BSc Hons Computing',
				description: '''Lorem Ipsum this is a description'''
				).save()

	def module3=new Module (title: 'Web Application Design',
				code: 'WAD653',
				credits: 20,
				lecturer: lect3,
				course: 'BSc Hons Computing',
				description: '''Lorem Ipsum this is a description'''
				).save()



	

    }

    def destroy = {
    }
}
