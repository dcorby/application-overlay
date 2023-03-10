package com.example.screenrecorder

import java.io.File

class Video(file: File) {
    val file = file
    val filename: String = file.name
    val label = file.name.replace(".mp4", "")

    var stateCurrent = false
    var stateEditing = false
    var stateRenaming = false
    var stateDeleting = false

    // Should probably use an adapter instance variable for this, with a reference to Activity ViewModel
    var renameTo = ""
    var isNew = false
}