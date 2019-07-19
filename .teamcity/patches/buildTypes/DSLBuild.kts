package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a buildType with id = 'DSLBuild'
in the project with id = 'DSLMoveBuildsSub2', and delete the patch script.
*/
create(RelativeId("DSLMoveBuildsSub2"), BuildType({
    id("DSLBuild")
    name = "DSLBuild"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        script {
            scriptContent = "echo hello;"
        }
    }

    triggers {
        vcs {
        }
    }
}))

