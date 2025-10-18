import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
    selector: 'app-patient-create',
    templateUrl: './patientcreate.component.html',
    styleUrls: ['./patientcreate.component.scss']
})
export class PatientCreateComponent implements OnInit {
    patientForm!: FormGroup;
    submitted = false;
    successMessage = '';
    errorMessage = '';

    constructor(private formBuilder: FormBuilder) { }

    ngOnInit(): void {
        this.initializeForm();
    }

    initializeForm(): void {
        this.patientForm = this.formBuilder.group({
            patientId: [null, [Validators.required, Validators.min(1)]],
            fullName: ['', [Validators.required, Validators.minLength(2)]],
            dateOfBirth: ['', Validators.required],
            contactNumber: ['', [Validators.required, Validators.pattern(/^\d{10}$/)]],
            email: ['', [Validators.required, Validators.email]],
            address: ['', Validators.required]
        });
    }

    onSubmit(): void {
        this.submitted = true;
        if (this.patientForm.valid) {
            this.successMessage = 'Patient created successfully!';
            this.errorMessage = '';
            console.log('Patient Data:', this.patientForm.value);
            this.patientForm.reset();
            this.submitted = false;
        } else {
            this.errorMessage = 'Please correct the errors in the form.';
            this.successMessage = '';
        }
    }

    resetForm(): void {
        this.patientForm.reset({
            patientId: null,
            fullName: '',
            dateOfBirth: '',
            contactNumber: '',
            email: '',
            address: ''
        });
        this.submitted = false;
        this.successMessage = '';
        this.errorMessage = '';
    }

    // Getters for cleaner template access
    get patientId() {
        return this.patientForm.get('patientId');
    }

    get fullName() {
        return this.patientForm.get('fullName');
    }

    get dateOfBirth() {
        return this.patientForm.get('dateOfBirth');
    }

    get contactNumber() {
        return this.patientForm.get('contactNumber');
    }

    get email() {
        return this.patientForm.get('email');
    }

    get address() {
        return this.patientForm.get('address');
    }
}