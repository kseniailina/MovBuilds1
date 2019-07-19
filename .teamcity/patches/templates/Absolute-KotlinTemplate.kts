package patches.templates

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Template
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a template with absolute id = 'KotlinTemplate'
in the root project, and delete the patch script.
*/
create(DslContext.projectId, Template({
    id = AbsoluteId("KotlinTemplate")
    name = "KotlinTemplate"
}))

