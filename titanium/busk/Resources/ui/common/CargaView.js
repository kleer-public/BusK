//FirstView Component Constructor
function CargaView() {
    
    Ti.Geolocation.purpose = 'gpsPurpose';
    Titanium.Geolocation.preferredProvider = Titanium.Geolocation.PROVIDER_NETWORK;
    Titanium.Geolocation.accuracy = Titanium.Geolocation.ACCURACY_BEST;
    Titanium.Geolocation.distanceFilter = 10;

	//create object instance, a parasitic subclass of Observable
	var self = Ti.UI.createView({
	    backgroundColor:'#ffffff'
	});
	
	this.latitude = Ti.UI.createTextField({
      borderStyle: Ti.UI.INPUT_BORDERSTYLE_ROUNDED,
      color: '#336699',
      top: 55, left: 10,
      width: 250, height: 60
    });
    self.add(this.latitude);
    
    this.longitude = Ti.UI.createTextField({
      borderStyle: Ti.UI.INPUT_BORDERSTYLE_ROUNDED,
      color: '#336699',
      top: 155, left: 10,
      width: 250, height: 60
    });
    self.add(this.longitude);
	
	var that = this;
	this.push = true;
	
	setInterval(function(){
	    Ti.API.log("lalala");
    if (Titanium.Platform.model != 'google_sdk' && Titanium.Platform.model != 'Simulator') {
            if(that.push){
                Titanium.Geolocation.getCurrentPosition(function(e) {
                    Ti.API.log(e);
                    if (e.error) {
                        that.longitude.value="error";
                        that.latitude.value ="error";
                        Ti.API.log("error");
                    }
                    else
                    {
                        that.longitude.value = e.coords.longitude;
                        that.latitude.value = e.coords.latitude;
                        Ti.API.log(e.coords);
                    }
                   });
            }

        }
        else{
            Ti.API.log("Simulador");
        }
        },
        3000);

    var stop = Ti.UI.createButton({
        title : 'Stop',
        height : 45,
        width : 145,
         top: 190, left: 10,
    });
    
    stop.addEventListener('click', function() {
       menu.show();
       cargar.hide();
       that.push = false;
    });
	
	self.add(stop);
	
	
	
	return self;
}

module.exports = CargaView;
