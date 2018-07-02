package at.triply.wcapi

import java.time.LocalDateTime

fun LocalDateTime.toStringDate(): String {
    return Constants.dateTimeFormatter.format(this)
}