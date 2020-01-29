package com.example.myapplication.cleancode

import java.util.*

/**
 * Created by Namget on 2020.01.14.
 */
class Chapter2 {


    fun main() {
        val d = 0; // 경과시간
        val elapsedTimeInDays: Int = 0
        val daysSinceCreation: Int = 0
        val daysSinceModeification: Int = 0
        val fileAgeInDays: Int = 0



        val theList = arrayListOf<IntArray>()
        val list = arrayListOf<IntArray>()
        for (x in theList) {
            if (x[0] == 4) {
                list.add(x)
            }
        }

    }

    val gameBoard = arrayListOf<Cell>()
    val STATUS_VALUE = 0
    val FLAGGED = 0

    fun getFlaggedCells(): List<Cell> {
        val flaggedCells = arrayListOf<Cell>()
        for (cell in gameBoard) {
            if (cell.isFlagged) {
                flaggedCells.add(cell)
            }
        }
        return flaggedCells
    }

    class Cell(val isFlagged: Boolean = false) {
    }

    fun copyChar(a1 : CharArray , a2 : CharArray){
        for(i in 0 until a1.size){
            a2[i] = a1[i]
        }
    }

    class DtaRcrd102{
        private val genymdhms = Date()
        private val modymdhms = Date()
    }
    class Customer{
        private val generationTimestamp = Date()
        private val modificationTimeStamp = Date()
    }

//    fun test(){
//        var s = 0
//        var t = arrayOf(0)
//        for(j in 0..34){
//            s += (t[j] * 4) /5
//        }
//
//        val realDaysPerIdealDay = 4
//        val WORK_DAYS_PER_WEEKS = 5
//        val NUMBER_OF_TASKS = 34
//        for(j in 0..NUMBER_OF_TASKS){
//            val realTaskDays = taskEstimate[j] * realDaysPerIdealDay
//            val realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEKS)
//            sum += realTaskWeeks
//        }
//    }

    



}