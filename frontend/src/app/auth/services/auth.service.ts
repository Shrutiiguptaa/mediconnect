import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { map, Observable } from "rxjs";
import { User } from "../../mediconnect/models/User";
import { environment } from "src/environments/environment";
import { UserRegistrationDTO } from "src/app/mediconnect/models/UserRegistrationDTO";
export class AuthService {

  private loginUrl = `${environment.apiUrl}`;
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  };

  constructor(private httpClient: HttpClient) { }

  login(user: Partial<User>): Observable<{ [key: string]: string }> {
    return this.httpClient.post<{ token: string }>(
      `${this.loginUrl}/user/login`,
      user,
      this.httpOptions
    );
  }
  // login(user: Partial<User>): Observable<User> {
  //   return this.httpClient.post<User>(
  //     `${this.loginUrl}/user/login`,
  //     user,
  //     this.httpOptions
  //   );
  // }

  getToken(): string | null {
    return localStorage.getItem('token');
  }

  getRole(): string | null {
    return localStorage.getItem('role');
  }

  logout() {
    localStorage.removeItem('token');
    localStorage.removeItem('role');
    localStorage.removeItem('user_id');
    localStorage.removeItem('patient_id');
    localStorage.removeItem('doctor_id');
  }

  getUsers(): Observable<User[]> {
    return this.httpClient.get<User[]>(`${this.loginUrl}/users`);
  }

  createUser(user: UserRegistrationDTO): Observable<User> {
    return this.httpClient.post<User>(`${this.loginUrl}/user/register`, user);
  }
  
}



// import { Injectable } from "@angular/core";
// import { HttpClient, HttpHeaders } from "@angular/common/http";
// import { environment } from "../../../environments/environment";
// import { Observable } from "rxjs";
// import { Supplier } from "../../supplylink/types/Supplier";

// @Injectable({
//   providedIn: "root",
// })
// export class AuthService {
//   private loginUrl = `${environment.apiUrl}`;


//   httpOptions = {
//     headers: new HttpHeaders({
//       'Content-Type': 'application/json',
//       'Access-Control-Allow-Origin': '*'
//     })
//   };

//   constructor(private http: HttpClient) { }

//   login(user: Partial<Supplier>): Observable<{ [key: string]: string }> {
//     return this.http.post<{ token: string }>(
//       `${this.loginUrl}/user/login`,
//       user,
//       this.httpOptions
//     );
//   }

//   getToken() {
//     return localStorage.getItem("token");
//   }
//   getRole() {
//     return localStorage.getItem("role");
//   }


//   createUser(user: Supplier): Observable<Supplier> {
//     return this.http.post<Supplier>(`${this.loginUrl}/user/register`, user);
//   }
// }