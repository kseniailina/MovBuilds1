package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2018_2.buildFeatures.freeDiskSpace
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.schedule
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a buildType with absolute id = 'TestProjectForMove_BuildMove'
in the project with id = 'DSLMoveBuildsSub2', and delete the patch script.
*/
create(RelativeId("DSLMoveBuildsSub2"), BuildType({
    id = AbsoluteId("TestProjectForMove_BuildMove")
    name = "BuildMove"

    params {
        param("test", "1")
        param("blabla", "%env.BUILD_VCS_NUMBER_TEstVCS%")
    }

    steps {
        maven {
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
    }

    triggers {
        schedule {
            schedulingPolicy = daily {
                timezone = "US/Arizona"
            }
            branchFilter = ""
            triggerBuild = always()
        }
    }

    features {
        freeDiskSpace {
            requiredSpace = "4gb"
            failBuild = true
        }
    }
}))

