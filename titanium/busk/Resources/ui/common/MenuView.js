//FirstView Component Constructor
function MenuView() {
	//create object instance, a parasitic subclass of Observable
	this.cargarView=null;
	this.mostrarView=null;
	var self = Ti.UI.createView();
	
	
    var textField = Ti.UI.createTextField({
      borderStyle: Ti.UI.INPUT_BORDERSTYLE_ROUNDED,
      color: '#336699',
      top: 55, left: 10,
      width: 250, height: 60
    });
    self.add(textField);
    
    // Create a Button.
    var carga = Ti.UI.createButton({
        title : 'Carga Recorido',
        height : 45,
        width : 145,
         top: 120, left: 10,
    });
    
    // Listen for click events.
    carga.addEventListener('click', function() {
        this.cargarView.show();
        this.hide();
    });
    
    
    // Create a Button.
    var show = Ti.UI.createButton({
        title : 'Mostrar',
        height : 45,
        width : 145,
         top: 170, left: 10,
    });
    
    // Listen for click events.
    show.addEventListener('click', function() {
        this.mostrarView.show();
        this.hide();
    });
    
    // Add to the parent view.
    self.add(carga);
    
    // Add to the parent view.
    self.add(show);
	
	return self;
}

module.exports = MenuView;
