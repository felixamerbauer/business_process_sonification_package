# business_process_sonification_package
ProM (http://www.promtools.org/) package builder for business process sonification project (https://github.com/felixamerbauer/business_process_sonification). This allows to run the multimodal tool combining sonification and visualization as ProM plugin adding this capabilities to your local ProM installation.

For more details see also the **project homepage** (http://cs.univie.ac.at/wst/forschung/projekte/projekt/infproj/1063/)

## Authors
* Faculty of Computer Science University of Vienna, Austria
  * Felix Amerbauer
  * Tobias Hildebrandt
  * Stefanie Rinderle-Ma

## Standalone-App
* JRE 1.7+ is required
	* Download http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html
* download https://github.com/felixamerbauer/business_process_sonification/blob/master/sonification_1.0.3.jar?raw=true
* run on the command line `java -jar sonification_1.0.3.jar`

## ProM-Package
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

## (Optional) Soundbank for Standalone-App / ProM-Package
* the standalone-app / ProM-package support using soundbanks in the SF2 format
* example
	* go to http://www.schristiancollins.com/generaluser.php and download the latest version of the soundfont in the *Current* section of the page (https://dl.dropboxusercontent.com/u/8126161/GeneralUser_GS_1.47.zip)
	* extract zip and copy `GeneralUser GS v1.47.sf2` (only this file is required) to the folder containing the standalone JAR file or to the ProM installation folder (the one containing e.g. `ProM66.bat`/`ProM66.sh`)

## ProM Package Build
### Compile Classpath
* axis.jar
* bsh-2.0b4.jar
* business-process-sonification-core.jar
* collections-generic-4.01.jar
* colt.jar
* commons-compress-1.0.jar
* commons-math3-3.5.jar
* FilterableSortableTablePanel.jar
* flanagan.jar
* freehep-export-2.1.1.jar
* freehep-graphics2d-2.1.1.jar
* freehep-graphicsio-2.1.1.jar
* freehep-graphicsio-emf-2.1.1.jar
* freehep-graphicsio-java-2.1.1.jar
* freehep-graphicsio-pdf-2.1.1.jar
* freehep-graphicsio-ps-2.1.1.jar
* freehep-graphicsio-svg-2.1.1.jar
* freehep-graphicsio-swf-2.1.1.jar
* freehep-graphicsio-tests-2.1.1.jar
* freehep-io-2.0.2.jar
* freehep-swing-2.0.3.jar
* freehep-util-2.0.2.jar
* freehep-xml-2.1.1.jar
* guava-16.0.1.jar
* jargs.jar
* jas-plotter-2.2.jar
* jcommon-1.0.16.jar
* jdom-legacy-1.1.3.jar
* jfreechart-1.0.14.jar
* jfugue-5.0.7.jar
* jgraph.jar
* jlfgr-1_0.jar
* jung-algorithms-2.0.jar
* jung-api-2.0.jar
* jung-graph-impl-2.0.jar
* jung-io-2.0.jar
* jung-visualization-2.0.jar
* junit-4.8.1.jar
* openide-lookup-1.9-patched-1.0.jar
* OpenXES-20160212.jar
* ProM-Contexts.jar
* ProM-Framework.jar
* ProM-Models.jar
* ProM-Plugins.jar
* simmetrics.jar
* slickerbox1.0rc1.jar
* Spex.jar
* TableLayout-20050920.jar
* Uitopia.jar
* UITopiaResources.jar
* weka.jar
* Widgets.jar
* xpp3-1.1.4c.jar
* xstream-1.3.1.jar

### Run Classpath
* business-process-sonification-core.jar
* commons-io-2.4.jar
* jfugue-5.0.7.jar
* log4j-1.2.17.jar
* metrics-core-3.1.2.jar
* org.apache.commons.io-2.4.jar
* scala-compiler_2.11.8.jar
* scala-library_2.11.8.jar
* scala-logging_2.11-3.4.0.jar
* scala-reflect_2.11.8.jar
* scala-xml_2.11-1.0.5.jar
* slf4j-api-1.7.21.jar
* slf4j-log4j12-1.7.21.jar

### Build Instructions
**TODO**
