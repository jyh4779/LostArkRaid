package com.android.lostarkraid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.lostarkraid.databinding.FragmentKouku2Binding

class Kouku2Fragment : Fragment() {
    private lateinit var binding: FragmentKouku2Binding
    private lateinit var mActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKouku2Binding.inflate(inflater, container, false)
        mActivity = activity as MainActivity

        val chooseWhereTextEffectArray = arrayOf(arrayOf(0,1,4), arrayOf(54,58,4), arrayOf(60,62,1), arrayOf(68,72,4), arrayOf(74,77,1))
        val randomTextEffectArray = arrayOf(arrayOf(0,1,3), arrayOf(29,34,1), arrayOf(61,66,2), arrayOf(75,80,4))
        val oneTwoFiveTextEffectArray = arrayOf(arrayOf(0,1,1), arrayOf(68,70,1))
        val oneOneOneTextEffectArray = arrayOf(arrayOf(0,1,7), arrayOf(34,36,4), arrayOf(78,81,1), arrayOf(86,90,4), arrayOf(97,101,1)
            , arrayOf(105,109,1), arrayOf(113,117,4), arrayOf(118,122,2))
        val nineSixTextEffectArray = arrayOf(arrayOf(0,1,1), arrayOf(68,78,4))
        val sevenSevneTextEffectArray = arrayOf(arrayOf(0,1,4), arrayOf(139,142,4), arrayOf(173,176,1), arrayOf(228,231,1), arrayOf(302,309,1))
        val fiveFiveTextEffectArray = arrayOf(arrayOf(0,1,3), arrayOf(28,30,4), arrayOf(51,55,4), arrayOf(122,125,4))
        val twoSixTextEffectArray = arrayOf(arrayOf(0,1,1), arrayOf(68,78,4))

        mActivity.setTextEffect(chooseWhereTextEffectArray, binding.chooseWhereInfo)
        mActivity.setTextEffect(randomTextEffectArray, binding.randomInfo)
        mActivity.setTextEffect(oneTwoFiveTextEffectArray, binding.oneTwoFiveInfo)
        mActivity.setTextEffect(oneOneOneTextEffectArray, binding.oneOneOneInfo)
        mActivity.setTextEffect(nineSixTextEffectArray, binding.nineSixInfo)
        mActivity.setTextEffect(sevenSevneTextEffectArray, binding.sevenSevenInfo)
        mActivity.setTextEffect(fiveFiveTextEffectArray, binding.fiveFiveInfo)
        mActivity.setTextEffect(twoSixTextEffectArray, binding.twoSixInfo)

        setBtnEventListener()

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_baltan_hard, container, false)
        return binding.root
    }
    fun setBtnEventListener(){
        binding.chooseWhereBtn.setOnClickListener {
            if(binding.chooseWhereText.getVisibility() == View.GONE) {
                binding.chooseWhereText.setVisibility(View.VISIBLE)
                binding.chooseWhereBtn.setImageResource(R.drawable.up)
            } else if(binding.chooseWhereText.getVisibility() == View.VISIBLE) {
                binding.chooseWhereText.setVisibility(View.GONE)
                binding.chooseWhereBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneTwoFiveBtn.setOnClickListener {
            if(binding.oneTwoFiveText.getVisibility() == View.GONE) {
                binding.oneTwoFiveText.setVisibility(View.VISIBLE)
                binding.oneTwoFiveBtn.setImageResource(R.drawable.up)
            } else if(binding.oneTwoFiveText.getVisibility() == View.VISIBLE) {
                binding.oneTwoFiveText.setVisibility(View.GONE)
                binding.oneTwoFiveBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneOneOneBtn.setOnClickListener {
            if(binding.oneOneOneText.getVisibility() == View.GONE) {
                binding.oneOneOneText.setVisibility(View.VISIBLE)
                binding.oneOneOneBtn.setImageResource(R.drawable.up)
            } else if(binding.oneOneOneText.getVisibility() == View.VISIBLE) {
                binding.oneOneOneText.setVisibility(View.GONE)
                binding.oneOneOneBtn.setImageResource(R.drawable.down)
            }
        }

        binding.nineSixBtn.setOnClickListener {
            if(binding.nineSixText.getVisibility() == View.GONE) {
                binding.nineSixText.setVisibility(View.VISIBLE)
                binding.nineSixBtn.setImageResource(R.drawable.up)
            } else if(binding.nineSixText.getVisibility() == View.VISIBLE) {
                binding.nineSixText.setVisibility(View.GONE)
                binding.nineSixBtn.setImageResource(R.drawable.down)
            }
        }

        binding.sevenSevenBtn.setOnClickListener {
            if(binding.sevenSevenText.getVisibility() == View.GONE) {
                binding.sevenSevenText.setVisibility(View.VISIBLE)
                binding.sevenSevenBtn.setImageResource(R.drawable.up)
            } else if(binding.sevenSevenText.getVisibility() == View.VISIBLE) {
                binding.sevenSevenText.setVisibility(View.GONE)
                binding.sevenSevenBtn.setImageResource(R.drawable.down)
            }
        }

        binding.fiveFiveBtn.setOnClickListener {
            if(binding.fiveFiveText.getVisibility() == View.GONE) {
                binding.fiveFiveText.setVisibility(View.VISIBLE)
                binding.fiveFiveBtn.setImageResource(R.drawable.up)
            } else if(binding.fiveFiveText.getVisibility() == View.VISIBLE) {
                binding.fiveFiveText.setVisibility(View.GONE)
                binding.fiveFiveBtn.setImageResource(R.drawable.down)
            }
        }

        binding.twoSixBtn.setOnClickListener {
            if(binding.twoSixText.getVisibility() == View.GONE) {
                binding.twoSixText.setVisibility(View.VISIBLE)
                binding.twoSixBtn.setImageResource(R.drawable.up)
            } else if(binding.twoSixText.getVisibility() == View.VISIBLE) {
                binding.twoSixText.setVisibility(View.GONE)
                binding.twoSixBtn.setImageResource(R.drawable.down)
            }
        }

        binding.randomBtn.setOnClickListener {
            if(binding.randomText.getVisibility() == View.GONE) {
                binding.randomText.setVisibility(View.VISIBLE)
                binding.randomBtn.setImageResource(R.drawable.up)
            } else if(binding.randomText.getVisibility() == View.VISIBLE) {
                binding.randomText.setVisibility(View.GONE)
                binding.randomBtn.setImageResource(R.drawable.down)
            }
        }

        binding.kkStageOne.setOnClickListener {
            mActivity.changeFrament("KK1")
        }
        binding.kkStageThree.setOnClickListener {
            mActivity.changeFrament("KK3")
        }
    }
}