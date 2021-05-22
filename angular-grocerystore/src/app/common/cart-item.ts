import { Grocery } from "./grocery";

export class CartItem {
    id?: string;
    name?: string;
    imageurl?:string;
    unitprice: any;
    quantity:number;
    
    constructor(grocery:Grocery){
        this.id=grocery.id;
        this.name=grocery.name;
        this.imageurl=grocery.imgeurl;
        this.unitprice=grocery.unitprice;
        this.quantity=1
    }

}
