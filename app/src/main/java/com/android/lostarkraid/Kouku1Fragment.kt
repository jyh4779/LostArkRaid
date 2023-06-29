package com.android.lostarkraid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.lostarkraid.databinding.FragmentBaltanHardBinding
import com.android.lostarkraid.databinding.FragmentKouku1Binding

class Kouku1Fragment : Fragment() {
    private lateinit var binding: FragmentKouku1Binding
    private lateinit var mActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKouku1Binding.inflate(inflater, container, false)
        mActivity = activity as MainActivity

        val oneTwoEightTextEffectArray = arrayOf(arrayOf(0,1,2), arrayOf(17,20,4), arrayOf(32,35,4))
        val oneOneTwoTextEffectArray = arrayOf(arrayOf(0,1,5), arrayOf(48,53,4), arrayOf(59,62,1), arrayOf(103,105,1), arrayOf(111,112,4), arrayOf(157,173,4))
        val eightEightTextEffectArray = arrayOf(arrayOf(0,1,1), arrayOf(179,191,4))
        val sixtyTextEffectArray = arrayOf(arrayOf(0,1,2), arrayOf(17,20,4), arrayOf(32,35,4))
        val fourEightTextEffectArray = arrayOf(arrayOf(0,1,2), arrayOf(127,130,4), arrayOf(140,142,4))
        val twoTwoTextEffectArray = arrayOf(arrayOf(0,1,5), arrayOf(48,53,4), arrayOf(59,62,1), arrayOf(103,105,1), arrayOf(111,112,4), arrayOf(157,173,4))
        val cardTextEffectArray = arrayOf(arrayOf(0,1,10), arrayOf(87,99,4), arrayOf(116,125,4), arrayOf(188,202,4), arrayOf(223,243,4),
            arrayOf(284,287,4), arrayOf(325,328,4), arrayOf(349,351,4), arrayOf(351,353,1), arrayOf(358,360,1), arrayOf(360,362,4))

        mActivity.setTextEffect(oneTwoEightTextEffectArray,binding.oneTwoEightInfo)
        mActivity.setTextEffect(oneOneTwoTextEffectArray, binding.oneOneTwoInfo)
        mActivity.setTextEffect(eightEightTextEffectArray, binding.eightEightInfo)
        mActivity.setTextEffect(sixtyTextEffectArray, binding.sixtyInfo)
        mActivity.setTextEffect(fourEightTextEffectArray, binding.fourEightInfo)
        mActivity.setTextEffect(twoTwoTextEffectArray, binding.twoTwoInfo)
        mActivity.setTextEffect(cardTextEffectArray, binding.cardInfo)

        setBtnEventListener()

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_baltan_hard, container, false)
        return binding.root
    }
    fun setBtnEventListener(){
        binding.defaultBtn.setOnClickListener {
            if(binding.defaultText.getVisibility() == View.GONE) {
                binding.defaultText.setVisibility(View.VISIBLE)
                binding.defaultBtn.setImageResource(R.drawable.up)
            } else if(binding.defaultText.getVisibility() == View.VISIBLE) {
                binding.defaultText.setVisibility(View.GONE)
                binding.defaultBtn.setImageResource(R.drawable.down)
            }
        }

        binding.chooseWhereBtn.setOnClickListener {
            if(binding.chooseWhereText.getVisibility() == View.GONE) {
                binding.chooseWhereText.setVisibility(View.VISIBLE)
                binding.chooseWhereBtn.setImageResource(R.drawable.up)
            } else if(binding.chooseWhereText.getVisibility() == View.VISIBLE) {
                binding.chooseWhereText.setVisibility(View.GONE)
                binding.chooseWhereBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneTwoEightBtn.setOnClickListener {
            if(binding.oneTwoEightText.getVisibility() == View.GONE) {
                binding.oneTwoEightText.setVisibility(View.VISIBLE)
                binding.oneTwoEightBtn.setImageResource(R.drawable.up)
            } else if(binding.oneTwoEightText.getVisibility() == View.VISIBLE) {
                binding.oneTwoEightText.setVisibility(View.GONE)
                binding.oneTwoEightBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneOneTwoBtn.setOnClickListener {
            if(binding.oneOneTwoText.getVisibility() == View.GONE) {
                binding.oneOneTwoText.setVisibility(View.VISIBLE)
                binding.oneOneTwoBtn.setImageResource(R.drawable.up)
            } else if(binding.oneOneTwoText.getVisibility() == View.VISIBLE) {
                binding.oneOneTwoText.setVisibility(View.GONE)
                binding.oneOneTwoBtn.setImageResource(R.drawable.down)
            }
        }

        binding.eightEightBtn.setOnClickListener {
            if(binding.eightEightText.getVisibility() == View.GONE) {
                binding.eightEightText.setVisibility(View.VISIBLE)
                binding.eightEightBtn.setImageResource(R.drawable.up)
            } else if(binding.eightEightText.getVisibility() == View.VISIBLE) {
                binding.eightEightText.setVisibility(View.GONE)
                binding.eightEightBtn.setImageResource(R.drawable.down)
            }
        }

        binding.sixtyBtn.setOnClickListener {
            if(binding.sixtyText.getVisibility() == View.GONE) {
                binding.sixtyText.setVisibility(View.VISIBLE)
                binding.sixtyBtn.setImageResource(R.drawable.up)
            } else if(binding.sixtyText.getVisibility() == View.VISIBLE) {
                binding.sixtyText.setVisibility(View.GONE)
                binding.sixtyBtn.setImageResource(R.drawable.down)
            }
        }

        binding.fourEightBtn.setOnClickListener {
            if(binding.fourEightText.getVisibility() == View.GONE) {
                binding.fourEightText.setVisibility(View.VISIBLE)
                binding.fourEightBtn.setImageResource(R.drawable.up)
            } else if(binding.fourEightText.getVisibility() == View.VISIBLE) {
                binding.fourEightText.setVisibility(View.GONE)
                binding.fourEightBtn.setImageResource(R.drawable.down)
            }
        }

        binding.twoTwoBtn.setOnClickListener {
            if(binding.twoTwoText.getVisibility() == View.GONE) {
                binding.twoTwoText.setVisibility(View.VISIBLE)
                binding.twoTwoBtn.setImageResource(R.drawable.up)
            } else if(binding.twoTwoText.getVisibility() == View.VISIBLE) {
                binding.twoTwoText.setVisibility(View.GONE)
                binding.twoTwoBtn.setImageResource(R.drawable.down)
            }
        }

        binding.cardBtn.setOnClickListener {
            if(binding.cardText.getVisibility() == View.GONE) {
                binding.cardText.setVisibility(View.VISIBLE)
                binding.cardBtn.setImageResource(R.drawable.up)
            } else if(binding.cardText.getVisibility() == View.VISIBLE) {
                binding.cardText.setVisibility(View.GONE)
                binding.cardBtn.setImageResource(R.drawable.down)
            }
        }

        binding.kkStageTwo.setOnClickListener {
            mActivity.changeFrament("KK2")
        }
    }
}