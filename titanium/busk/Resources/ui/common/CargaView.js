//FirstView Component Constructor
function CargaView() {
	//create object instance, a parasitic subclass of Observable
	var self = Ti.UI.createView();
	
	//label using localization-ready strings from <app dir>/i18n/en/strings.xml
	//construct UI
    
    
    // Create a Label.
    var aLabel = Ti.UI.createLabel({
        text : 'Grupo-Linea',
        color : '#textColor',
        font : 16,
        height : 45,
        width : 45,
        top : 0
    });
    
    // Add to the parent view.
    self.add(aLabel);
    
    var textField = Ti.UI.createTextField({
      borderStyle: Ti.UI.INPUT_BORDERSTYLE_ROUNDED,
      color: '#336699',
      top: 55, left: 10,
      width: 250, height: 60
    });
    self.add(textField);
    
    
    // Create a Button.
    var start = Ti.UI.createButton({
        title : 'start',
        height : 45,
        width : 45,
         top: 120, left: 10,
    });
    
    // Listen for click events.
    start.addEventListener('click', function() {
        alert('\'start\' was clicked!');
    });
    
    
    // Create a Button.
    var end = Ti.UI.createButton({
        title : 'end',
        height : 45,
        width : 45,
         top: 170, left: 10,
    });
    
    // Listen for click events.
    end.addEventListener('click', function() {
        alert('\'end\' was clicked!');
    });
    
    // Add to the parent view.
    self.add(end);
    
    // Add to the parent view.
    self.add(start);
	
	return self;
}

module.exports = CargaView;
