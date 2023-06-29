package com.android.lostarkraid

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.view.Gravity
import android.view.Window
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.lostarkraid.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val transaction = supportFragmentManager
            .beginTransaction()
            .add(R.id.frameLayout,HomeFragment())
        transaction.commit()

        binding.homeBtn.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout,HomeFragment())
                .commit()
            binding.drawerLayout.closeDrawer(Gravity.LEFT)
        }

        binding.menuBtn.setOnClickListener {
            if (!binding.drawerLayout.isDrawerOpen(Gravity.LEFT)) {
                binding.drawerLayout.openDrawer(Gravity.LEFT)
            } else {
                binding.drawerLayout.closeDrawer(Gravity.LEFT)
            }
        }
        binding.dolBtn.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout,BingoFragment())
                .commit()
            binding.drawerLayout.closeDrawer(Gravity.LEFT)
        }
    }
    fun changeFrament (raid: String){
        when(raid){
            "BTHARD1" -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout,BaltanHardFragment())
                    .commit()
            }
            "BTHARD2" -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout,BaltanHard2Fragment())
                    .commit()
            }
            "KK1" -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout,Kouku1Fragment())
                    .commit()
            }
            "KK2" -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout,Kouku2Fragment())
                    .commit()
            }
            "KK3" -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout,Kouku3Fragment())
                    .commit()
            }
            "BINGORESET" -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout,BingoFragment())
                    .commit()
            }
        }
    }

    //effectNo = 0 -> YELLOW / 1 -> RED / 2 -> BLUE / 3 -> GREEN / 4 -> MAGENTA
    fun setTextEffect(textArray:Array<Array<Int>>,v: TextView){
        val textData:String = v.text.toString()
        val builder  = SpannableStringBuilder(textData)

        for(i in textArray[0][1]..textArray[0][2]){
            val boldSpan = StyleSpan(Typeface.BOLD)
            builder.setSpan(boldSpan, textArray[i][0], textArray[i][1], Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

            when(textArray[i][2]){
                0 -> {
                    val colorSpan = ForegroundColorSpan(Color.YELLOW)
                    builder.setSpan(colorSpan, textArray[i][0], textArray[i][1], Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                }
                1 -> {
                    val colorSpan = ForegroundColorSpan(Color.RED)
                    builder.setSpan(colorSpan, textArray[i][0], textArray[i][1], Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                }
                2 -> {
                    val colorSpan = ForegroundColorSpan(Color.BLUE)
                    builder.setSpan(colorSpan, textArray[i][0], textArray[i][1], Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                }
                3 -> {
                    val colorSpan = ForegroundColorSpan(Color.GREEN)
                    builder.setSpan(colorSpan, textArray[i][0], textArray[i][1], Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                }
                4 -> {
                    val colorSpan = ForegroundColorSpan(Color.MAGENTA)
                    builder.setSpan(colorSpan, textArray[i][0], textArray[i][1], Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                }
            }
        }
        v.text = builder
    }
}

