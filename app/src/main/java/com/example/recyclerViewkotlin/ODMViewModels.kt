package com.nielsen.nextmeter

class ODMViewModels{

     private  var titleName:String
     private  var counts:String

//    constructor(titleName: String, counts: String) {
//        this.titleName = titleName
//        this.counts = counts
//    }

    constructor(titleName : String , counts : String){
        this.titleName = titleName;
        this.counts = counts;
    }


    fun getTitleName(): String {
        return titleName
    }
    fun getCounts () : String{
        return counts
    }
}
