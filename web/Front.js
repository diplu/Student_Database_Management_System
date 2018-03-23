/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        function validateform() {
            var name = document.myform.name.value;
            var id = document.myform.id.value;
            var email = document.myform.email.value;
            var mno = document.myform.mno.value;
            var address = document.myform.address.value;
            var stream = document.myform.stream.value;
            
             if(isNaN(id) || id == "") {
                alert("Id value should be numeric or not  blank");
                
                return false;
                
            }
          //  var illegalChars = /\W/;\
            var letters = /^[a-zA-Z-,]+(\s{0,1}[a-zA-Z-, ])*$/;
            
            if(name == null || name == "") {
                alert("Name can't be blank");  
                return false;
            }
            
           if(letters.test(name) == false) {
             alert("The name contains illegal characters.");
		return false;
            }
      var letter = /^[A-Za-z]+$/;
     
      if(stream.length < 3) {
        alert("Check your stream length");
        return false;
    }
    
    if(letter.test(stream) == false ) {
        alert("Give your stream name properly ");
        return false;
    }
   
    if(stream == null || stream == "") {
        alert("Stream can't be blank");
        
        return false;
    }
            
           var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
            
            if (reg.test(email) == false ||email == "" ) 
            {
                alert('Invalid Email Address ');
                
                return (false);
            }
            var re = /^\d{10}$/;
            if(re.test(mno) == false || mno == "") {
                alert("Invalid mobile no ");
             
                return false;
            }
            if(address == null || address == "") {
                alert("Address cannot be blank");
               
                return false;
            }
            
            
            
        }
        
    
  


