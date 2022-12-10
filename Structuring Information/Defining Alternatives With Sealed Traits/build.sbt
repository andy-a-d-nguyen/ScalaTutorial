
lazy val `Defining-Alternatives-With-Sealed-Traits` = (project in file("."))
    .settings(
        scalaSource in Compile := baseDirectory.value / "src",
        scalaSource in Test := baseDirectory.value / "test",
        libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
    )