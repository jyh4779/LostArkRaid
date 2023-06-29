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