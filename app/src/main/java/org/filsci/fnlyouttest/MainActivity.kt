package org.filsci.fnlyouttest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.filsci.fnlyouttest.ui.theme.FnLyoutTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // 初始化视图
        var gameInterface = this.findViewById(R.id.gameGrid)
        var btnMoveUp = this.findViewById(R.id.btnMoveUp)
        var btnMoveDown = this.findViewById(R.id.btnMoveDown)
        var btnMoveLeft = this.findViewById(R.id.btnMoveLeft)
        var btnMoveRight = this.findViewById(R.id.btnMoveRight)

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
    private fun btnMoveUp() {

        updateInterface()
    }

    }
}

