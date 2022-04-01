import { Component, OnInit } from '@angular/core';
import { Appointment } from '../model/appointment';
import { AppointmentService } from '../services/appointment.service';

@Component({
  selector: 'app-appt-info',
  templateUrl: './appt-info.component.html',
  styleUrls: ['./appt-info.component.css']
})
export class ApptInfoComponent implements OnInit {

  appointments: Appointment[]=[];


  constructor(public appointmentService: AppointmentService) { }

  ngOnInit(): void {
    this.appointmentService.getAppointments().subscribe((data: any)=>{
      this.appointments= data;
    })
  }

}
