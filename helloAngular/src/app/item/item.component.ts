import { Component, OnInit } from '@angular/core';
import {ItemService} from '../services/item.service';


@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {

  hello = 'world';
  items: Array<any>;
  constructor(private service: ItemService) { }
  ngOnInit(): void {
    this.service.getItems().subscribe((data) => {
      this.items = data;
    });
  }
}
