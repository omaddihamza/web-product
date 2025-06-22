import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class Product {
  URL = "http://localhost:8080/";
  constructor(private http:HttpClient) { }

  getProduct():Observable<any>{
    return this.http.get(this.URL+"products")
  }

  deleteProduct(id: any): Observable<any> {
    return this.http.delete(this.URL + "product/" + id);
  }

}
