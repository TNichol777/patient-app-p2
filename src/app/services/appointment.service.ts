import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Doctor } from '../model/doctor';
import { catchError,Observable, retry,throwError  } from 'rxjs';
import { Appointment } from '../model/appointment';

const appointmentURL = "http://localhost:5050/appointment"

@Injectable({
  providedIn: 'root'
})
export class AppointmentService {

  httpOptions = {
    headers : new HttpHeaders({
      'Content-Type':'application/json'
    })
  }

  constructor(public httpClient: HttpClient) { }


  bookAppointment(appointment:Appointment): Observable<Appointment> {
    return this.httpClient.post<Appointment>(appointmentURL,appointment,this.httpOptions)
    .pipe(
      retry(0),
      catchError(this.errorHandler)
    );
  }

  getAppointments(): Observable<Appointment[]> {
    return this.httpClient.get<Appointment[]>(appointmentURL)
    .pipe(
      retry(0),
      catchError(this.errorHandler)
    );
  }
 

  errorHandler(error: { error: { message: string; }; status: any; message: any; }) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      // Get client-side error
      errorMessage = error.error.message;
    } else {
      // Get server-side error
      errorMessage = `REVError Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(errorMessage);
  }
}