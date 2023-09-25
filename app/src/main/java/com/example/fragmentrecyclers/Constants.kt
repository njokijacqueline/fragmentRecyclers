package com.example.fragmentrecyclers

object Constants {
    //Arraylist and return the Arraylist
    fun getEmployeeData():ArrayList<Employee>{
        //create an arraylist of type employee class
        val employeeList=ArrayList<Employee>()
        val emp1=Employee("Hassan Hassan","chinmaya@gmail.com")
        employeeList.add(emp1)
        val emp2=Employee("Ram Juma","ramp@gmail.com")
        employeeList.add(emp2)
        val emp3=Employee("OMM Mane","mehetaom@gmail.com")
        employeeList.add(emp3)
        val emp4=Employee("Hari Potter","harim@gmail.com")
        employeeList.add(emp4)
        val emp5=Employee("Abhisek Mishra","mishraabhi@gmail.com")
        employeeList.add(emp5)
        val emp6=Employee("Sindhu Malhotra","sindhu@gmail.com")
        employeeList.add(emp6)
        val emp7=Employee("Ann anny","sidhuanil@gmail.com")
        employeeList.add(emp7)
        val emp8=Employee("Sachy James","sinhas@gmail.com")
        employeeList.add(emp8)
        val emp9=Employee("Amir sahoo","sahooamit@gmail.com")
        employeeList.add(emp9)
        val emp10=Employee("Rajab kkk","kumarraj@gmail.com")
        employeeList.add(emp10)

        return  employeeList
    }

}
