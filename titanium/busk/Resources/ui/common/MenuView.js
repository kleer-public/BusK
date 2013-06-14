//FirstView Component Constructor

function MenuView(cargar) {
	this.cargar = cargar;
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
    var that=this;
    carga.addEventListener('click', function() {
        that.cargar.show();
        self.hide();
        that.cargar.push = true;
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
        
    });
    
    // Add to the parent view.
    self.add(carga);
    
    // Add to the parent view.
    self.add(show);
	
	return self;
}

module.exports = MenuView;
