//Application Window Component Constructor

function ApplicationWindow() {
	//load component dependencies
	var Menu = require('ui/common/MenuView');
	var CargaView = require('ui/common/CargaView');
	
	cargar=new CargaView();
	menu = new Menu(cargar);
	cargar.hide();
	menu.show();
	
	//create component instance
	var self = Ti.UI.createWindow({
		backgroundColor:'#ffffff'
	});
	
    self.add(menu);
    self.add(cargar);

	return self;
}

//make constructor function the public component interface
module.exports = ApplicationWindow;
