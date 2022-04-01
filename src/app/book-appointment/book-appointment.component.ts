import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AppointmentService } from '../services/appointment.service';

@Component({
  selector: 'app-book-appointment',
  templateUrl: './book-appointment.component.html',
  styleUrls: ['./book-appointment.component.css']
})

export class BookAppointmentComponent implements OnInit {

  book: FormGroup;
  successMessage !: string;
 

  constructor(public formBuilder:FormBuilder, public appointmentService: AppointmentService, public router:Router) {     
    this.book = this.formBuilder.group({
      doctorName: new FormControl('',Validators.required),
      patientName: new FormControl('',Validators.required),
      insurance: new FormControl('',Validators.required),
      time: new FormControl('',Validators.required),
});
    
    }
  
    ngOnInit(): void {

    }
  
    bookAppointment(){
      console.log(this.book.value)
      this.appointmentService.bookAppointment(this.book.value).subscribe((data: any) =>{
      this.successMessage = 'Appointment booked successfully';
      //this.router.navigate(['appointme']);
     })
    }
  }