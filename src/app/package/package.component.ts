import { Component , OnInit} from '@angular/core';
import { faLocation } from '@fortawesome/free-solid-svg-icons'
import { faStar } from '@fortawesome/free-solid-svg-icons'
import { faStarHalfStroke } from '@fortawesome/free-solid-svg-icons'
import { BookserviceService } from '../bookservice.service'



@Component({
  selector: 'app-package',
  templateUrl: './package.component.html',
  styleUrls: ['./package.component.css']
})
export class PackageComponent {
  Star = faStar;
  location = faLocation;
  hstar =   faStarHalfStroke;

  constructor(private s4:BookserviceService) {this.viewstudent(); }
  stud!:any;
  
  ngOnInit(): void {
  }
   viewstudent()
   {
    this.s4.viewstudent1().subscribe(
      (resp) => { this.stud=resp; }
      );
   }
  
 deletedata(deleteform: any)
 {
   this.s4.deletestudent(deleteform.value).subscribe();
 }
}
