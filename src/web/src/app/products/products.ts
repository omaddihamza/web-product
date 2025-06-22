import { Component, OnInit } from '@angular/core';
import { DecimalPipe, NgClass, CommonModule, NgFor } from '@angular/common';
import { Product } from '../services/product';

@Component({
  selector: 'app-products',
  standalone: true,
  imports: [CommonModule, DecimalPipe, NgClass, NgFor],
  templateUrl: './products.html',
  styleUrls: ['./products.css']
})
export class Products implements OnInit {
  products: any[] = [];

  constructor(private productService: Product) {}

  ngOnInit(): void {
    this.getAllProduct();
  }

  getAllProduct(){
    this.productService.getProduct().subscribe(data => {
      this.products = data;
    });
  }

  handleDelete(id: number): void {
    this.productService.deleteProduct(id).subscribe({
      next: () => {
        this.getAllProduct();
        console.log(`Produit ${id} supprimé.`);
      },
      error: err => {
        console.error('Erreur lors de la suppression :', err);
      }
    });
  }
}
