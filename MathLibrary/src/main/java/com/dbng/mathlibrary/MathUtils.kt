package com.dbng.mathlibrary

import kotlin.math.pow
import kotlin.math.sqrt


// Created by Nagaraju on 09/12/24.

data class Point(val x:Double, val y:Double)

fun Point.calculateDistanceTo(point: Point):Double{
    return sqrt((x-point.x).pow(2) + (y-point.y).pow(2));
}