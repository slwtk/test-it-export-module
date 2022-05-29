package ru.kpfu.dsl
inline fun precondition(name: String, action: () -> Unit = {}) { action() }
inline fun step(name: String, action: () -> Unit = {}) { action() }
inline fun Unit.expected(name: String, action: () -> Unit) { action() }
inline fun postcondition(name: String, action: () -> Unit = {}) { action() }