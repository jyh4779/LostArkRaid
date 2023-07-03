package com.android.lostarkraid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.lostarkraid.databinding.FragmentBiaKisNormal2Binding

class BiaKisNormal2Fragment : Fragment() {
    private lateinit var binding: FragmentBiaKisNormal2Binding
    private lateinit var mActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBiaKisNormal2Binding.inflate(inflater, container, false)
        mActivity = activity as MainActivity

        val oneTwoSideTextEffectArray = arrayOf(arrayOf(0,1,4), arrayOf(33,44,4), arrayOf(82,94,2), arrayOf(104,119,2), arrayOf(128,141,2))
        val oneTwoInTextEffectArray = arrayOf(arrayOf(0,1,3), arrayOf(72,79,2), arrayOf(94,97,4), arrayOf(104,107,1))
        val oneTwoAllTextEffectArray = arrayOf(arrayOf(0,1,5), arrayOf(0,4,2), arrayOf(14,17,4), arrayOf(23,33,4),
            arrayOf(38,41,1), arrayOf(47,57,1))
        val sixFiveTextEffectArray = arrayOf(arrayOf(0,1,8), arrayOf(30,41,4), arrayOf(54,57,1), arrayOf(61,64,4),
            arrayOf(102,107,4), arrayOf(112,115,0), arrayOf(152,158,4),arrayOf(160,162,1), arrayOf(182,192,4))

        mActivity.setTextEffect(oneTwoSideTextEffectArray, binding.oneTwoSideInfo)
        mActivity.setTextEffect(oneTwoInTextEffectArray, binding.oneTwoInInfo)
        mActivity.setTextEffect(oneTwoAllTextEffectArray, binding.oneTwoAllInfo)
        mActivity.setTextEffect(sixFiveTextEffectArray, binding.sixFiveInfo)

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

        binding.purpleRedBtn.setOnClickListener {
            if(binding.purpleRedText.getVisibility() == View.GONE) {
                binding.purpleRedText.setVisibility(View.VISIBLE)
                binding.purpleRedBtn.setImageResource(R.drawable.up)
            } else if(binding.purpleRedText.getVisibility() == View.VISIBLE) {
                binding.purpleRedText.setVisibility(View.GONE)
                binding.purpleRedBtn.setImageResource(R.drawable.down)
            }
        }

        binding.blackRedBtn.setOnClickListener {
            if(binding.blackRedText.getVisibility() == View.GONE) {
                binding.blackRedText.setVisibility(View.VISIBLE)
                binding.blackRedBtn.setImageResource(R.drawable.up)
            } else if(binding.blackRedText.getVisibility() == View.VISIBLE) {
                binding.blackRedText.setVisibility(View.GONE)
                binding.blackRedBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneTwoSideBtn.setOnClickListener {
            if(binding.oneTwoSideText.getVisibility() == View.GONE) {
                binding.oneTwoSideText.setVisibility(View.VISIBLE)
                binding.oneTwoSideBtn.setImageResource(R.drawable.up)
            } else if(binding.oneTwoSideText.getVisibility() == View.VISIBLE) {
                binding.oneTwoSideText.setVisibility(View.GONE)
                binding.oneTwoSideBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneTwoInBtn.setOnClickListener {
            if(binding.oneTwoInText.getVisibility() == View.GONE) {
                binding.oneTwoInText.setVisibility(View.VISIBLE)
                binding.oneTwoInBtn.setImageResource(R.drawable.up)
            } else if(binding.oneTwoInText.getVisibility() == View.VISIBLE) {
                binding.oneTwoInText.setVisibility(View.GONE)
                binding.oneTwoInBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneTwoAllBtn.setOnClickListener {
            if(binding.oneTwoAllText.getVisibility() == View.GONE) {
                binding.oneTwoAllText.setVisibility(View.VISIBLE)
                binding.oneTwoAllBtn.setImageResource(R.drawable.up)
            } else if(binding.oneTwoAllText.getVisibility() == View.VISIBLE) {
                binding.oneTwoAllText.setVisibility(View.GONE)
                binding.oneTwoAllBtn.setImageResource(R.drawable.down)
            }
        }

        binding.nintyBtn.setOnClickListener {
            if(binding.nintyText.getVisibility() == View.GONE) {
                binding.nintyText.setVisibility(View.VISIBLE)
                binding.nintyBtn.setImageResource(R.drawable.up)
            } else if(binding.nintyText.getVisibility() == View.VISIBLE) {
                binding.nintyText.setVisibility(View.GONE)
                binding.nintyBtn.setImageResource(R.drawable.down)
            }
        }

        binding.sixFiveBtn.setOnClickListener {
            if(binding.sixFiveText.getVisibility() == View.GONE) {
                binding.sixFiveText.setVisibility(View.VISIBLE)
                binding.sixFiveBtn.setImageResource(R.drawable.up)
            } else if(binding.sixFiveText.getVisibility() == View.VISIBLE) {
                binding.sixFiveText.setVisibility(View.GONE)
                binding.sixFiveBtn.setImageResource(R.drawable.down)
            }
        }

        binding.thrtyBtn.setOnClickListener {
            if(binding.thrtyText.getVisibility() == View.GONE) {
                binding.thrtyText.setVisibility(View.VISIBLE)
                binding.thrtyBtn.setImageResource(R.drawable.up)
            } else if(binding.thrtyText.getVisibility() == View.VISIBLE) {
                binding.thrtyText.setVisibility(View.GONE)
                binding.thrtyBtn.setImageResource(R.drawable.down)
            }
        }

        binding.stageOne.setOnClickListener {
            mActivity.changeFrament("BKNORMAL1")
        }
        binding.stageThree.setOnClickListener {
            mActivity.changeFrament("BKNORMAL3")
        }
    }
}