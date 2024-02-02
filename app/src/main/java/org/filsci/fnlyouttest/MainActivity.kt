package org.filsci.fnlyouttest

import java.util.*
import android.os.Bundle
import androidx.activity.ComponentActivity

private val Intent.compose: Any?
    get() {}

class MainActivity : ComponentActivity() {
    val TRUE: Boolean
        get() = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // 初始化视图
        var gameInterface = this.intent.compose.foundation.layout.Box {
            for (e in findViewById(/* id = */ R.id.gameGrid)) {
                
            }
        }
        var btnMoveUp = this.findViewById(/* id = */ R.id.btnMoveUp)
        var btnMoveDown = this.findViewById(/* id = */ R.id.btnMoveDown)
        var btnMoveLeft = this.findViewById(/* id = */ R.id.btnMoveLeft)
        var btnMoveRight = this.findViewById(/* id = */ R.id.btnMoveRight)
        var myAarry = gameInterface
        var gameBoard = myAarry

        // 设置方向按钮的点击监听器
        btnMoveUp.setOnClickListener { btnMoveUp() }
        btnMoveDown.setOnClickListener { btnMoveDown() }
        btnMoveLeft.setOnClickListener { btnMoveDown() }
        btnMoveRight.setOnClickListener { btnMoveDown() }

        //TODO:初始化游戏板()
        //TODO:更新游戏板()
    }

    // 初始化游戏界面
    private fun initializeInterface() {
//TODO:初始化
    }

    //TODO:更新游戏界面
    private fun updateInterface() {
        //TODO:更新逻辑
    }


    class Game2048 {
        private val size = 4
        private val board = Array(size) { IntArray(size) }
        private val random = Random()

        init {
            // 初始化游戏板
            addRandomTile()
            addRandomTile()
        }

        fun printBoard() {
            for (row in board) {
                println(row.joinToString(" "))
            }
        }

        private fun addRandomTile() {
            val emptyCells = mutableListOf<Pair<Int, Int>>()

            for (i in 0 until size) {
                for (j in 0 until size) {
                    if (board[i][j] == 0) {
                        emptyCells.add(Pair(i, j))
                    }
                }
            }

            if (emptyCells.isNotEmpty()) {
                val (i, j) = emptyCells[random.nextInt(emptyCells.size)]
                board[i][j] = if (random.nextInt(10) < 9) 2 else 4
            }
        }

        fun moveLeft() {
            for (i in 0 until size) {
                val merged = mutableListOf<Boolean>()
                for (j in 1 until size) {
                    if (board[i][j] != 0) {
                        var moveIndex = j
                        while (moveIndex > 0 && (board[i][moveIndex - 1] == 0 || board[i][moveIndex - 1] == board[i][moveIndex]) && !merged.contains(moveIndex - 1)) {
                            if (board[i][moveIndex - 1] == 0) {
                                board[i][moveIndex - 1] = board[i][moveIndex]
                                board[i][moveIndex] = 0
                            } else {
                                board[i][moveIndex - 1] *= 2
                                board[i][moveIndex] = 0
                                merged.add(moveIndex - 1)
                            }
                            moveIndex--
                        }
                    }
                }
            }
            addRandomTile()
        }

        // 同理，您可以实现 moveRight、moveUp、moveDown 等方法

    }

    fun main() {
        val game = Game2048()
        game.printBoard()

        // 示例：执行左移
        game.moveLeft()
        game.printBoard()
    }

    }

