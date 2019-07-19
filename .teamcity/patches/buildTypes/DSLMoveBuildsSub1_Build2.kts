package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a buildType with id = 'DSLMoveBuildsSub1_Build2'
in the project with id = 'DSLMoveBuildsSub2', and delete the patch script.
*/
create(RelativeId("DSLMoveBuildsSub2"), BuildType({
    id("DSLMoveBuildsSub1_Build2")
    name = "Build2"

    vcs {
        root(DslContext.settingsRoot)
    }
}))

