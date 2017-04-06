package com.rravichandran
import grails.converters.*

class BookController {


static allowedMethods = [index:"GET", show:"GET", bdelete:"GET"]

    def scaffold= Book

    def bindex(Book book){

	render Book.list() as JSON
	if (Book == null){
		flash.message="There are currently no book details in the database"
	}
    }

    def bshow(Book book){
	if (params.id && Book.exists(params.id)){
		def sbook = Book.findById(params.id)
		if (sbook.overdue !=true){
		render "This book is not overdue"
		}
		else{
		render Book.findById(params.id) as JSON
		}
 	}	
	
    else{
	render Book.list() as JSON
    }

    }
	
    def bdelete(Book book){
	if(params.id && Book.exists(params.id)){
		render "This book is deleted"
	Book.findById(params.id).delete()
	}
	else{
	render "No book with this ID is available" 
	}	

    	
}
}
