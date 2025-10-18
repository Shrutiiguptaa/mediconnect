// import { Component } from '@angular/core';
// import { CommonModule } from '@angular/common';
// import { Patient } from '../../models/Patient';

// @Component({
//   selector: 'app-patientsample',
//   standalone: true,
//   imports: [CommonModule],
//   templateUrl: './patientsample.component.html',
//   styleUrls: ['./patientsample.component.scss'],
// })
// export class PatientSampleComponent {
//   patient: Patient;

//   constructor() {
//     this.patient = new Patient(
//       1, 
//       'John Doe',
//       new Date('1990-01-01'), 
//       '1234567890', 
//       'john@example.com',
//       '123 Main Street, Cityville' 
//     );
//   }

//   logPatientAttributes(): void {
//     this.patient.logAttributes();
//   }
// }

import { Patient } from "../../models/Patient";
import { Component } from "@angular/core";

@Component({
    selector: "",
    templateUrl: "./patientsample.component.html",
    styleUrls: ["./patientsample.component.css"]
})

export class PatientSampleComponent {
    patient: Patient;

    logPatientAttributes() {
        console.log('patientId:', this.patient.patientId);
        console.log('fullName:', this.patient.fullName);
        console.log('dateOfBirth:', this.patient.dateOfBirth);
        console.log('contactNumber:', this.patient.contactNumber);
        console.log('email:', this.patient.email);
        console.log('address:', this.patient.address);
    }
}