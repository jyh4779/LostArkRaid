package com.android.lostarkraid

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.lostarkraid.databinding.FragmentBaltanHard2Binding
import com.android.lostarkraid.databinding.FragmentBaltanHardBinding
import com.android.lostarkraid.databinding.FragmentHomeBinding

class BaltanHard2Fragment : Fragment() {
    private lateinit var binding: FragmentBaltanHard2Binding
    private lateinit var mActivity: MainActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBaltanHard2Binding.inflate(inflater, container, false)
        mActivity = activity as MainActivity

        val oneTextEffectArray = arrayOf(arrayOf(0,1,3), arrayOf(53,57,4), arrayOf(74,78,4), arrayOf(96,100,4))
        val sevenTextEffectArray = arrayOf(arrayOf(1,1,2), arrayOf(59,62,4), arrayOf(88,91,4))
        val tenTextEffectArray = arrayOf(arrayOf(2,1,1), arrayOf(69,72,4))

        mActivity.setTextEffect(oneTextEffectArray,binding.baltanTwoOneInfo)
        mActivity.setTextEffect(sevenTextEffectArray,binding.baltanTwoSevenInfo)
        mActivity.setTextEffect(tenTextEffectArray,binding.baltanTwoTenInfo)

        setBtnEventListener()

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_baltan_hard, container, false)
        return binding.root
    }
    fun setBtnEventListener(){
        binding.baltanTwoOneBtn.setOnClickListener {
            //Log.d("onCreateView","Click 45 Line Btn")
            if(binding.baltanTwoOneText.getVisibility() == View.GONE) {
                binding.baltanTwoOneText.setVisibility(View.VISIBLE)
                binding.baltanTwoOneBtn.setImageResource(R.drawable.up)
            } else if(binding.baltanTwoOneText.getVisibility() == View.VISIBLE) {
                binding.baltanTwoOneText.setVisibility(View.GONE)
                binding.baltanTwoOneBtn.setImageResource(R.drawable.down)
            }
        }
        binding.baltanTwoTwoBtn.setOnClickListener {
            //Log.d("onCreateView","Click 45 Line Btn")
            if(binding.baltanTwoTwoText.getVisibility() == View.GONE) {
                binding.baltanTwoTwoText.setVisibility(View.VISIBLE)
                binding.baltanTwoTwoBtn.setImageResource(R.drawable.up)
            } else if(binding.baltanTwoTwoText.getVisibility() == View.VISIBLE) {
                binding.baltanTwoTwoText.setVisibility(View.GONE)
                binding.baltanTwoTwoBtn.setImageResource(R.drawable.down)
            }
        }
        binding.baltanTwoThreeBtn.setOnClickListener {
            //Log.d("onCreateView","Click 45 Line Btn")
            if(binding.baltanTwoThreeText.getVisibility() == View.GONE) {
                binding.baltanTwoThreeText.setVisibility(View.VISIBLE)
                binding.baltanTwoThreeBtn.setImageResource(R.drawable.up)
            } else if(binding.baltanTwoThreeText.getVisibility() == View.VISIBLE) {
                binding.baltanTwoThreeText.setVisibility(View.GONE)
                binding.baltanTwoThreeBtn.setImageResource(R.drawable.down)
            }
        }
        binding.baltanTwoFourBtn.setOnClickListener {
            //Log.d("onCreateView","Click 45 Line Btn")
            if(binding.baltanTwoFourText.getVisibility() == View.GONE) {
                binding.baltanTwoFourText.setVisibility(View.VISIBLE)
                binding.baltanTwoFourBtn.setImageResource(R.drawable.up)
            } else if(binding.baltanTwoFourText.getVisibility() == View.VISIBLE) {
                binding.baltanTwoFourText.setVisibility(View.GONE)
                binding.baltanTwoFourBtn.setImageResource(R.drawable.down)
            }
        }
        binding.baltanTwoFiveBtn.setOnClickListener {
            //Log.d("onCreateView","Click 45 Line Btn")
            if(binding.baltanTwoFiveText.getVisibility() == View.GONE) {
                binding.baltanTwoFiveText.setVisibility(View.VISIBLE)
                binding.baltanTwoFiveBtn.setImageResource(R.drawable.up)
            } else if(binding.baltanTwoFiveText.getVisibility() == View.VISIBLE) {
                binding.baltanTwoFiveText.setVisibility(View.GONE)
                binding.baltanTwoFiveBtn.setImageResource(R.drawable.down)
            }
        }
        binding.baltanTwoSixBtn.setOnClickListener {
            //Log.d("onCreateView","Click 45 Line Btn")
            if(binding.baltanTwoSixText.getVisibility() == View.GONE) {
                binding.baltanTwoSixText.setVisibility(View.VISIBLE)
                binding.baltanTwoSixBtn.setImageResource(R.drawable.up)
            } else if(binding.baltanTwoSixText.getVisibility() == View.VISIBLE) {
                binding.baltanTwoSixText.setVisibility(View.GONE)
                binding.baltanTwoSixBtn.setImageResource(R.drawable.down)
            }
        }
        binding.baltanTwoSevenBtn.setOnClickListener {
            //Log.d("onCreateView","Click 45 Line Btn")
            if(binding.baltanTwoSevenText.getVisibility() == View.GONE) {
                binding.baltanTwoSevenText.setVisibility(View.VISIBLE)
                binding.baltanTwoSevenBtn.setImageResource(R.drawable.up)
            } else if(binding.baltanTwoSevenText.getVisibility() == View.VISIBLE) {
                binding.baltanTwoSevenText.setVisibility(View.GONE)
                binding.baltanTwoSevenBtn.setImageResource(R.drawable.down)
            }
        }
        binding.baltanTwoEightBtn.setOnClickListener {
            //Log.d("onCreateView","Click 45 Line Btn")
            if(binding.baltanTwoEightText.getVisibility() == View.GONE) {
                binding.baltanTwoEightText.setVisibility(View.VISIBLE)
                binding.baltanTwoEightBtn.setImageResource(R.drawable.up)
            } else if(binding.baltanTwoEightText.getVisibility() == View.VISIBLE) {
                binding.baltanTwoEightText.setVisibility(View.GONE)
                binding.baltanTwoEightBtn.setImageResource(R.drawable.down)
            }
        }
        binding.baltanTwoNineBtn.setOnClickListener {
            //Log.d("onCreateView","Click 45 Line Btn")
            if(binding.baltanTwoNineText.getVisibility() == View.GONE) {
                binding.baltanTwoNineText.setVisibility(View.VISIBLE)
                binding.baltanTwoNineBtn.setImageResource(R.drawable.up)
            } else if(binding.baltanTwoNineText.getVisibility() == View.VISIBLE) {
                binding.baltanTwoNineText.setVisibility(View.GONE)
                binding.baltanTwoNineBtn.setImageResource(R.drawable.down)
            }
        }
        binding.baltanTwoTenBtn.setOnClickListener {
            //Log.d("onCreateView","Click 45 Line Btn")
            if(binding.baltanTwoTenText.getVisibility() == View.GONE) {
                binding.baltanTwoTenText.setVisibility(View.VISIBLE)
                binding.baltanTwoTenBtn.setImageResource(R.drawable.up)
            } else if(binding.baltanTwoTenText.getVisibility() == View.VISIBLE) {
                binding.baltanTwoTenText.setVisibility(View.GONE)
                binding.baltanTwoTenBtn.setImageResource(R.drawable.down)
            }
        }
        binding.stageOne.setOnClickListener{
            mActivity.changeFrament("BTHARD1")
        }
    }
}