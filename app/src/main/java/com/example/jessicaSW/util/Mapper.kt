package com.example.jessicaSW.util

interface Mapper<Input, Output> {
    fun map(input: Input): Output
}