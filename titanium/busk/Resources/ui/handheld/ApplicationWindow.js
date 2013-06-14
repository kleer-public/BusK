//Application Window Component Constructor
function ApplicationWindow() {
	//load component dependencies
	var Menu = require('ui/common/MenuView');
	var CargaView = require('ui/common/CargaView');
	var menuView=new Menu();
	var cargaView=new CargaView();	
	//create component instance
	var self = Ti.UI.createWindow({
		backgroundColor:'#ffffff'
	});
		
	
	menuView.show();
	menuView.cargarView=cargaView;
	
    cargaView.hide();
    self.add(menuView);
	self.add(cargaView);
	
	return self;
}

//make constructor function the public component interface
module.exports = ApplicationWindow;
