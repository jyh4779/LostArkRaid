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
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.android.lostarkraid.databinding.ActivityMainBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds

private const val TAG_HOME_FRAGMENT="home_fragment"
private const val TAG_BALTAN_FRAGMENT="baltan_hard_fragment"
private const val TAG_BALTAN2_FRAGMENT="baltan_hard2_fragment"
private const val TAG_BIAKIS_NORMAL1_FRAGMENT="biakis_normal1_fragment"
private const val TAG_BIAKIS_NORMAL2_FRAGMENT="biakis_normal2_fragment"
private const val TAG_BIAKIS_NORMAL3_FRAGMENT="biakis_normal3_fragment"
private const val TAG_KOUKU1_FRAGMENT="kouku1_fragment"
private const val TAG_KOUKU2_FRAGMENT="kouku2_fragment"
private const val TAG_KOUKU3_FRAGMENT="kouku3_fragment"
private const val TAG_BINGO_FRAGMENT="bingo_fragment"
class MainActivity : FragmentActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setFragment(TAG_HOME_FRAGMENT,HomeFragment())

        /*val transaction = supportFragmentManager
            .beginTransaction()
            .add(R.id.frameLayout,HomeFragment())
        transaction.commit()*/

        //admob ads
        MobileAds.initialize(this)
        val adRequst = AdRequest.Builder().build()
        binding.adBannerView.loadAd(adRequst)

        setMenuClickListener()

    }
    private fun setFragment(tag: String, fragment: Fragment) {
        val manager: FragmentManager = supportFragmentManager
        val ft: FragmentTransaction = manager.beginTransaction()

        if (manager.findFragmentByTag(tag) == null) {
            ft.add(R.id.frameLayout, fragment, tag)
        }

        val home = manager.findFragmentByTag(TAG_HOME_FRAGMENT)
        val baltan = manager.findFragmentByTag(TAG_BALTAN_FRAGMENT)
        val baltan2 = manager.findFragmentByTag(TAG_BALTAN2_FRAGMENT)
        val biakisnormal1 = manager.findFragmentByTag(TAG_BIAKIS_NORMAL1_FRAGMENT)
        val biakisnormal2 = manager.findFragmentByTag(TAG_BIAKIS_NORMAL2_FRAGMENT)
        val biakisnormal3 = manager.findFragmentByTag(TAG_BIAKIS_NORMAL3_FRAGMENT)
        val kouku1 = manager.findFragmentByTag(TAG_KOUKU1_FRAGMENT)
        val kouku2 = manager.findFragmentByTag(TAG_KOUKU2_FRAGMENT)
        val kouku3 = manager.findFragmentByTag(TAG_KOUKU3_FRAGMENT)
        val bingo = manager.findFragmentByTag(TAG_BINGO_FRAGMENT)

        // Hide all Fragment
        if (home != null) {ft.hide(home)}
        if (baltan != null) {ft.hide(baltan)}
        if (baltan2 != null) {ft.hide(baltan2)}
        if (biakisnormal1 != null) {ft.hide(biakisnormal1)}
        if (biakisnormal2 != null) {ft.hide(biakisnormal2)}
        if (biakisnormal3 != null) {ft.hide(biakisnormal3)}
        if (kouku1 != null) {ft.hide(kouku1)}
        if (kouku2 != null) {ft.hide(kouku2)}
        if (kouku3 != null) {ft.hide(kouku3)}
        if (bingo != null) {ft.hide(bingo)}

        // Show  current Fragment
        when (tag) {
            TAG_HOME_FRAGMENT -> {if (home != null) {ft.show(home)}}
            TAG_BALTAN_FRAGMENT -> {if (baltan != null) {ft.show(baltan)}}
            TAG_BALTAN2_FRAGMENT -> {if (baltan2 != null) {ft.show(baltan2)}}
            TAG_BIAKIS_NORMAL1_FRAGMENT -> {if (biakisnormal1 != null) {ft.show(biakisnormal1)}}
            TAG_BIAKIS_NORMAL2_FRAGMENT -> {if (biakisnormal2 != null) {ft.show(biakisnormal2)}}
            TAG_BIAKIS_NORMAL3_FRAGMENT -> {if (biakisnormal3 != null) {ft.show(biakisnormal3)}}
            TAG_KOUKU1_FRAGMENT -> {if (kouku1 != null) {ft.show(kouku1)}}
            TAG_KOUKU2_FRAGMENT -> {if (kouku2 != null) {ft.show(kouku2)}}
            TAG_KOUKU3_FRAGMENT -> {if (kouku3 != null) {ft.show(kouku3)}}
            TAG_BINGO_FRAGMENT -> {if (bingo != null) {ft.show(bingo)}}
        }
        /*if (tag == TAG_HOME_FRAGMENT) {if (home != null) {ft.show(home)}}
        if (tag == TAG_BALTAN_FRAGMENT) {if (baltan != null) {ft.show(baltan)}}*/

        ft.commitAllowingStateLoss()
    }
    fun setMenuClickListener(){
        binding.homeBtn.setOnClickListener{
        changeFrament("HOME")
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
            "HOME" -> {setFragment(TAG_HOME_FRAGMENT,HomeFragment())}
            "BTHARD1" -> {setFragment(TAG_BALTAN_FRAGMENT,BaltanHardFragment())}
            "BTHARD2" -> {setFragment(TAG_BALTAN2_FRAGMENT,BaltanHard2Fragment())}
            "BKNORMAL1" -> {setFragment(TAG_BIAKIS_NORMAL1_FRAGMENT,BiaKisNormal1Fragment())}
            "BKNORMAL2" -> {setFragment(TAG_BIAKIS_NORMAL2_FRAGMENT,BiaKisNormal2Fragment())}
            "BKNORMAL3" -> {setFragment(TAG_BIAKIS_NORMAL3_FRAGMENT,BiaKisNormal3Fragment())}
            "KK1" -> {setFragment(TAG_KOUKU1_FRAGMENT,Kouku1Fragment())}
            "KK2" -> {setFragment(TAG_KOUKU2_FRAGMENT,Kouku2Fragment())}
            "KK3" -> {setFragment(TAG_KOUKU3_FRAGMENT,Kouku3Fragment())}
            "BINGORESET" -> {setFragment(TAG_BINGO_FRAGMENT,BingoFragment())}
            /*"BT1TEST" -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout,BaltanHardFragment())
                    .commit()
            }*/
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

