## Business Procss Sonification
### Standalone-App
* JRE 1.7+ is required
	* Download http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html
* download https://raw.githubusercontent.com/felixamerbauer/business_process_sonification/sonification_1.0.3.jar
* run on the command line `java -jar sonification_1.0.3.jar`

### ProM-Package
* JRE 1.7+ is required otherwise download PromM with bundled JRE
	* download http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html
* download and extract http://www.promtools.org/prom6/downloads/prom-6.6-all-platforms.tar.gz
* edit `ProM.ini`
	* replace `PACKAGE_URL = http://www.promtools.org/prom6/packages66/packages.xml` with `PACKAGE_URL = https://raw.githubusercontent.com/felixamerbauer/business_process_sonification_package/master/packages.xm`
	* replace `PROM_USER_FOLDER =`with `PROM_USER_FOLDER = prom_bps` so that the new ProM installation doesn't interfere with other ProM 6.6 installations on the same machine
* run ProM package manager (`ProMPM66.bat`/`ProMPM66.sh`) and install package *BusinessProcessSonification*
* run `ProM66.bat`/`ProM66.sh`
* to use the package functionality in ProM
	* make a XES log file available by clicking the *import...* button on the main screen and select a XES file
	* start the package specific view by clicking the eye symbol button below the description of the imported log file

### (Optional) Soundbank for Standalone-App / ProM-Package
* the standalone-app / ProM-package support using soundbanks in the SF2 format
* example
	* go to http://www.schristiancollins.com/generaluser.php and download the latest version of the soundfont in the *Current* section of the page (https://dl.dropboxusercontent.com/u/8126161/GeneralUser_GS_1.47.zip)
	* extract zip and copy `GeneralUser GS v1.47.sf2` (only this file is required) to the folder containing the standalone JAR file or to the ProM installation folder (the one containing e.g. `ProM66.bat`/`ProM66.sh`)