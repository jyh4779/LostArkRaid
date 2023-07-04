package com.android.lostarkraid

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.Window
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import com.android.lostarkraid.databinding.ActivityMainBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds

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

        //admob ads
        MobileAds.initialize(this)
        val adRequst = AdRequest.Builder().build()
        binding.adBannerView.loadAd(adRequst)

        setMenuClickListener()

    }
    fun setMenuClickListener(){
        binding.homeBtn.setOnClickListener{
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout,HomeFragment())
            .commit()
        binding.drawerLayout.closeDrawer(Gravity.RIGHT)
        }

        binding.home2Btn.setOnClickListener{
            changeFrament("HOME")
        }

        binding.menuBtn.setOnClickListener {
            if (!binding.drawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                binding.drawerLayout.openDrawer(Gravity.RIGHT)
            } else {
                binding.drawerLayout.closeDrawer(Gravity.RIGHT)
            }
        }
        binding.menuBaltanBtn.setOnClickListener{
            if(binding.menuBaltanLayout.getVisibility() == View.GONE) {
                binding.menuBaltanLayout.setVisibility(View.VISIBLE)
            } else if(binding.menuBaltanLayout.getVisibility() == View.VISIBLE) {
                binding.menuBaltanLayout.setVisibility(View.GONE)
            }
        }
        binding.menuBiakisBtn.setOnClickListener{
            if(binding.menuBiaKisLayout.getVisibility() == View.GONE) {
                binding.menuBiaKisLayout.setVisibility(View.VISIBLE)
            } else if(binding.menuBiaKisLayout.getVisibility() == View.VISIBLE) {
                binding.menuBiaKisLayout.setVisibility(View.GONE)
            }
        }
        binding.menuKoukuBtn.setOnClickListener{
            if(binding.menuKoukuLayout.getVisibility() == View.GONE) {
                binding.menuKoukuLayout.setVisibility(View.VISIBLE)
            } else if(binding.menuKoukuLayout.getVisibility() == View.VISIBLE) {
                binding.menuKoukuLayout.setVisibility(View.GONE)
            }
        }
        binding.menuBaltan1Btn.setOnClickListener {
            binding.drawerLayout.closeDrawer(Gravity.RIGHT)
            changeFrament("BTHARD1")
        }
        binding.menuBaltan2Btn.setOnClickListener {
            binding.drawerLayout.closeDrawer(Gravity.RIGHT)
            changeFrament("BTHARD2")
        }
        binding.menuBiakis1Btn.setOnClickListener {
            binding.drawerLayout.closeDrawer(Gravity.RIGHT)
            changeFrament("BKNORMAL1")
        }
        binding.menuBiakis2Btn.setOnClickListener {
            binding.drawerLayout.closeDrawer(Gravity.RIGHT)
            changeFrament("BKNORMAL2")
        }
        binding.menuBiakis3Btn.setOnClickListener {
            binding.drawerLayout.closeDrawer(Gravity.RIGHT)
            changeFrament("BKNORMAL3")
        }
        binding.menuKouku1Btn.setOnClickListener {
            binding.drawerLayout.closeDrawer(Gravity.RIGHT)
            changeFrament("KK1")
        }
        binding.menuKouku2Btn.setOnClickListener {
            binding.drawerLayout.closeDrawer(Gravity.RIGHT)
            changeFrament("KK2")
        }
        binding.menuKouku3Btn.setOnClickListener {
            binding.drawerLayout.closeDrawer(Gravity.RIGHT)
            changeFrament("KK3")
        }
        binding.menuBingoBtn.setOnClickListener {
            binding.drawerLayout.closeDrawer(Gravity.RIGHT)
            changeFrament("BINGORESET")
        }
    }

    fun changeFrament (raid: String){
        when(raid){
            "HOME" -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout,HomeFragment())
                    .commit()
            }
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
            "BKNORMAL1" -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout,BiaKisNormal1Fragment())
                    .commit()
            }
            "BKNORMAL2" -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout,BiaKisNormal2Fragment())
                    .commit()
            }
            "BKNORMAL3" -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout,BiaKisNormal3Fragment())
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
            Log.d("setTextEffect","i = ["+i+"]")
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

