/* global Swal 
 
 
 Swal.fire(
 'Good job!',
 'You clicked the button!',
 'success'
 );
 */



$("#success-alert").fadeTo(2000, 500).slideUp(500, function(){
    $("#success-alert").slideUp(500);
});