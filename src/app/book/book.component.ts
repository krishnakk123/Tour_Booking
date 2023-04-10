import { Component , OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service'

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {
  constructor(private s1 : BookserviceService) { }

  ngOnInit(): void {
  }
  insertdata(insertform: { value: any; })
  {
    return  this.s1.insertform1(insertform.value).subscribe();
  }
}


