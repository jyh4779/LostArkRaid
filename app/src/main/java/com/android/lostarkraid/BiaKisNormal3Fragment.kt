package com.android.lostarkraid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.lostarkraid.databinding.FragmentBiaKisNormal3Binding

class BiaKisNormal3Fragment : Fragment() {
    private lateinit var binding: FragmentBiaKisNormal3Binding
    private lateinit var mActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBiaKisNormal3Binding.inflate(inflater, container, false)
        mActivity = activity as MainActivity

        val yellowTextEffectArray = arrayOf(arrayOf(0,1,2), arrayOf(3,18,4), arrayOf(20,24,0))
        val oneSevenTextEffectArray = arrayOf(arrayOf(0,1,7), arrayOf(42,49,2), arrayOf(55,62,4), arrayOf(90,100,4),
            arrayOf(125,132,1), arrayOf(179,189,4), arrayOf(198,200,1), arrayOf(204,207,1))
        val oneFiveTwoTextEffectArray = arrayOf(arrayOf(0,1,10), arrayOf(13,14,1), arrayOf(18,20,2), arrayOf(42,44,1),
            arrayOf(52,53,1), arrayOf(66,68,2), arrayOf(76,78,2), arrayOf(103,104,1), arrayOf(109,110,4), arrayOf(164,166,2), arrayOf(172,177,4))
        val oneThreeFiveTextEffectArray = arrayOf(arrayOf(0,1,2), arrayOf(123,126,1), arrayOf(131,135,0))
        val oneTwoTextEffectArray = arrayOf(arrayOf(0,1,4), arrayOf(0,6,1), arrayOf(9,14,4), arrayOf(26,28,1), arrayOf(42,49,1))
        val oneZeroTwoTextEffectArray = arrayOf(arrayOf(0,1,5), arrayOf(38,40,4), arrayOf(45,49,0), arrayOf(57,62,4),
            arrayOf(73,76,4), arrayOf(110,116,2))
        val sevenFiveTextEffectArray = arrayOf(arrayOf(0,1,7), arrayOf(42,49,2), arrayOf(55,62,4), arrayOf(90,100,4),
            arrayOf(125,132,1), arrayOf(179,189,4), arrayOf(198,200,1), arrayOf(204,207,1))
        val fiveFiveTextEffectArray = arrayOf(arrayOf(0,1,5), arrayOf(71,74,2), arrayOf(76,79,2), arrayOf(81,84,1),
            arrayOf(86,88,1), arrayOf(107,113,4))
        val twoTextEffectArray = arrayOf(arrayOf(0,1,9), arrayOf(40,43,4), arrayOf(91,106,4), arrayOf(120,123,1),
            arrayOf(145,146,1), arrayOf(179,184,4), arrayOf(203,208,4), arrayOf(239,241,4), arrayOf(251,258,4), arrayOf(284,288,4))

        mActivity.setTextEffect(yellowTextEffectArray, binding.yellowInfo)
        mActivity.setTextEffect(oneSevenTextEffectArray, binding.oneSevenInfo)
        mActivity.setTextEffect(oneFiveTwoTextEffectArray, binding.oneFiveTwoInfo)
        mActivity.setTextEffect(oneThreeFiveTextEffectArray, binding.oneThreeFiveInfo)
        mActivity.setTextEffect(oneTwoTextEffectArray, binding.oneTwoInfo)
        mActivity.setTextEffect(oneZeroTwoTextEffectArray, binding.oneZeroTwoInfo)
        mActivity.setTextEffect(sevenFiveTextEffectArray, binding.sevenFiveInfo)
        mActivity.setTextEffect(fiveFiveTextEffectArray, binding.fiveFiveInfo)
        mActivity.setTextEffect(twoTextEffectArray, binding.twoInfo)

        setBtnEventListener()

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_baltan_hard, container, false)
        return binding.root
    }
    fun setBtnEventListener(){
        binding.gaugeBtn.setOnClickListener {
            if(binding.gaugeText.getVisibility() == View.GONE) {
                binding.gaugeText.setVisibility(View.VISIBLE)
                binding.gaugeBtn.setImageResource(R.drawable.up)
            } else if(binding.gaugeText.getVisibility() == View.VISIBLE) {
                binding.gaugeText.setVisibility(View.GONE)
                binding.gaugeBtn.setImageResource(R.drawable.down)
            }
        }

        binding.jangpanBtn.setOnClickListener {
            if(binding.jangpanText.getVisibility() == View.GONE) {
                binding.jangpanText.setVisibility(View.VISIBLE)
                binding.jangpanBtn.setImageResource(R.drawable.up)
            } else if(binding.jangpanText.getVisibility() == View.VISIBLE) {
                binding.jangpanText.setVisibility(View.GONE)
                binding.jangpanBtn.setImageResource(R.drawable.down)
            }
        }

        binding.yellowBtn.setOnClickListener {
            if(binding.yellowText.getVisibility() == View.GONE) {
                binding.yellowText.setVisibility(View.VISIBLE)
                binding.yellowBtn.setImageResource(R.drawable.up)
            } else if(binding.yellowText.getVisibility() == View.VISIBLE) {
                binding.yellowText.setVisibility(View.GONE)
                binding.yellowBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneSevenBtn.setOnClickListener {
            if(binding.oneSevenText.getVisibility() == View.GONE) {
                binding.oneSevenText.setVisibility(View.VISIBLE)
                binding.oneSevenBtn.setImageResource(R.drawable.up)
            } else if(binding.oneSevenText.getVisibility() == View.VISIBLE) {
                binding.oneSevenText.setVisibility(View.GONE)
                binding.oneSevenBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneFiveTwoBtn.setOnClickListener {
            if(binding.oneFiveTwoText.getVisibility() == View.GONE) {
                binding.oneFiveTwoText.setVisibility(View.VISIBLE)
                binding.oneFiveTwoBtn.setImageResource(R.drawable.up)
            } else if(binding.oneFiveTwoText.getVisibility() == View.VISIBLE) {
                binding.oneFiveTwoText.setVisibility(View.GONE)
                binding.oneFiveTwoBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneThreeFiveBtn.setOnClickListener {
            if(binding.oneThreeFiveText.getVisibility() == View.GONE) {
                binding.oneThreeFiveText.setVisibility(View.VISIBLE)
                binding.oneThreeFiveBtn.setImageResource(R.drawable.up)
            } else if(binding.oneThreeFiveText.getVisibility() == View.VISIBLE) {
                binding.oneThreeFiveText.setVisibility(View.GONE)
                binding.oneThreeFiveBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneTwoBtn.setOnClickListener {
            if(binding.oneTwoText.getVisibility() == View.GONE) {
                binding.oneTwoText.setVisibility(View.VISIBLE)
                binding.oneTwoBtn.setImageResource(R.drawable.up)
            } else if(binding.oneTwoText.getVisibility() == View.VISIBLE) {
                binding.oneTwoText.setVisibility(View.GONE)
                binding.oneTwoBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneZeroTwoBtn.setOnClickListener {
            if(binding.oneZeroTwoText.getVisibility() == View.GONE) {
                binding.oneZeroTwoText.setVisibility(View.VISIBLE)
                binding.oneZeroTwoBtn.setImageResource(R.drawable.up)
            } else if(binding.oneZeroTwoText.getVisibility() == View.VISIBLE) {
                binding.oneZeroTwoText.setVisibility(View.GONE)
                binding.oneZeroTwoBtn.setImageResource(R.drawable.down)
            }
        }

        binding.sevenFiveBtn.setOnClickListener {
            if(binding.sevenFiveText.getVisibility() == View.GONE) {
                binding.sevenFiveText.setVisibility(View.VISIBLE)
                binding.sevenFiveBtn.setImageResource(R.drawable.up)
            } else if(binding.sevenFiveText.getVisibility() == View.VISIBLE) {
                binding.sevenFiveText.setVisibility(View.GONE)
                binding.sevenFiveBtn.setImageResource(R.drawable.down)
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
        binding.twoBtn.setOnClickListener {
            if(binding.twoText.getVisibility() == View.GONE) {
                binding.twoText.setVisibility(View.VISIBLE)
                binding.twoBtn.setImageResource(R.drawable.up)
            } else if(binding.twoText.getVisibility() == View.VISIBLE) {
                binding.twoText.setVisibility(View.GONE)
                binding.twoBtn.setImageResource(R.drawable.down)
            }
        }

        binding.stageTwo.setOnClickListener {
            mActivity.changeFrament("BKNORMAL2")
        }
    }
}