name := "business_process_sonification_package"

version := "1.0.3"

scalaVersion := "2.11.8"

javacOptions ++= Seq(
	"-source", "1.7",
	"-target", "1.7")

// Do not append Scala versions to the generated artifacts
crossPaths := false

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false

	
// SBT-Eclipse settings
// In order to avoid Eclipse and sbt working on the same files: At least in theory there could be race conditions and such
EclipseKeys.eclipseOutput := Some(".target")
EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE17)
EclipseKeys.withSource := true
EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource
EclipseKeys.projectFlavor := EclipseProjectFlavor.Java

// dependencies
libraryDependencies ++= Seq(
	"com.typesafe.scala-logging" %% "scala-logging" % "3.4.0",
	"org.slf4j" % "slf4j-log4j12" % "1.7.13",
 	"org.apache.directory.studio" % "org.apache.commons.io" % "2.4",
	"io.dropwizard.metrics" % "metrics-core" % "3.1.2",
	"org.scala-lang" % "scala-library" % scalaVersion.value,
	"org.scala-lang" % "scala-reflect" % scalaVersion.value,
	"org.scala-lang.modules" %% "scala-xml" % "1.0.5")

// custom tasks
lazy val deploy = taskKey[Unit]("Copies the packaged JAR to the ProM")

deploy := {
    val bin: File = (packageBin in Compile).value
    val packageFolder = new File(s"./prom_package/BusinessProcessSonification-${version.value}-all")
    val targets = Seq(new File(packageFolder, "BusinessProcessSonification.jar"))
   	// new File("../../prom-6.6-portable/userfolder/packages/businessprocesssonification-1.0.0/BusinessProcessSonification.jar"))
    println(s"Copying $bin to ${target.value}")
    targets.foreach { target =>
    	IO.copyFile(bin, target)
    }
}