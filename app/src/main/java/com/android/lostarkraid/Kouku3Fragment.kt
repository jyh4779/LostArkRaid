package com.android.lostarkraid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.lostarkraid.databinding.FragmentKouku3Binding

class Kouku3Fragment : Fragment() {
    private lateinit var binding: FragmentKouku3Binding
    private lateinit var mActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKouku3Binding.inflate(inflater, container, false)
        mActivity = activity as MainActivity

        val defaultTextEffectArray = arrayOf(arrayOf(0,1,3), arrayOf(21,23,4), arrayOf(59,70,1), arrayOf(146,156,4))
        val randomTextEffectArray = arrayOf(arrayOf(0,1,1), arrayOf(8,12,1))
        val oneOtherTextEffectArray = arrayOf(arrayOf(0,1,2), arrayOf(87,91,2), arrayOf(110,113,4))
        val twoOtherTextEffectArray = arrayOf(arrayOf(0,1,2), arrayOf(87,90,2), arrayOf(109,112,4))
        val nintyTextEffectArray = arrayOf(arrayOf(0,1,6), arrayOf(46,48,4), arrayOf(102,109,4),
            arrayOf(182,184,1), arrayOf(316,320,1),arrayOf(335,344,2), arrayOf(385,390,4))
        val threeOtherTextEffectArray = arrayOf(arrayOf(0,1,2), arrayOf(87,94,2), arrayOf(113,116,4))
        val fourOtherTextEffectArray = arrayOf(arrayOf(0,1,5), arrayOf(87,94,2), arrayOf(126,132,1),
            arrayOf(135,138,4), arrayOf(160,164,4), arrayOf(190,198,1))

        mActivity.setTextEffect(defaultTextEffectArray,binding.defaultInfo)
        mActivity.setTextEffect(randomTextEffectArray,binding.randomInfo)
        mActivity.setTextEffect(oneOtherTextEffectArray,binding.oneOtherInfo)
        mActivity.setTextEffect(twoOtherTextEffectArray,binding.twoOtherInfo)
        mActivity.setTextEffect(nintyTextEffectArray,binding.nintyInfo)
        mActivity.setTextEffect(threeOtherTextEffectArray,binding.threeOtherInfo)
        mActivity.setTextEffect(fourOtherTextEffectArray,binding.fourOtherInfo)


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

        binding.chooseMarioBtn.setOnClickListener {
            if(binding.chooseMarioText.getVisibility() == View.GONE) {
                binding.chooseMarioText.setVisibility(View.VISIBLE)
                binding.chooseMarioBtn.setImageResource(R.drawable.up)
            } else if(binding.chooseMarioText.getVisibility() == View.VISIBLE) {
                binding.chooseMarioText.setVisibility(View.GONE)
                binding.chooseMarioBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneMarioBtn.setOnClickListener {
            if(binding.oneMarioText.getVisibility() == View.GONE) {
                binding.oneMarioText.setVisibility(View.VISIBLE)
                binding.oneMarioBtn.setImageResource(R.drawable.up)
            } else if(binding.oneMarioText.getVisibility() == View.VISIBLE) {
                binding.oneMarioText.setVisibility(View.GONE)
                binding.oneMarioBtn.setImageResource(R.drawable.down)
            }
        }

        binding.oneOtherBtn.setOnClickListener {
            if(binding.oneOtherText.getVisibility() == View.GONE) {
                binding.oneOtherText.setVisibility(View.VISIBLE)
                binding.oneOtherBtn.setImageResource(R.drawable.up)
            } else if(binding.oneOtherText.getVisibility() == View.VISIBLE) {
                binding.oneOtherText.setVisibility(View.GONE)
                binding.oneOtherBtn.setImageResource(R.drawable.down)
            }
        }

        binding.twoMarioBtn.setOnClickListener {
            if(binding.twoOtherText.getVisibility() == View.GONE) {
                binding.twoOtherText.setVisibility(View.VISIBLE)
                binding.twoMarioBtn.setImageResource(R.drawable.up)
            } else if(binding.twoOtherText.getVisibility() == View.VISIBLE) {
                binding.twoOtherText.setVisibility(View.GONE)
                binding.twoMarioBtn.setImageResource(R.drawable.down)
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

        binding.threeMarioBtn.setOnClickListener {
            if(binding.threeMarioText.getVisibility() == View.GONE) {
                binding.threeMarioText.setVisibility(View.VISIBLE)
                binding.threeMarioBtn.setImageResource(R.drawable.up)
            } else if(binding.threeMarioText.getVisibility() == View.VISIBLE) {
                binding.threeMarioText.setVisibility(View.GONE)
                binding.threeMarioBtn.setImageResource(R.drawable.down)
            }
        }

        binding.threeOtherBtn.setOnClickListener {
            if(binding.threeOtherText.getVisibility() == View.GONE) {
                binding.threeOtherText.setVisibility(View.VISIBLE)
                binding.threeOtherBtn.setImageResource(R.drawable.up)
            } else if(binding.threeMarioText.getVisibility() == View.VISIBLE) {
                binding.threeOtherText.setVisibility(View.GONE)
                binding.threeOtherBtn.setImageResource(R.drawable.down)
            }
        }

        binding.fourMarioBtn.setOnClickListener {
            if(binding.fourMarioText.getVisibility() == View.GONE) {
                binding.fourMarioText.setVisibility(View.VISIBLE)
                binding.fourMarioBtn.setImageResource(R.drawable.up)
            } else if(binding.fourMarioText.getVisibility() == View.VISIBLE) {
                binding.fourMarioText.setVisibility(View.GONE)
                binding.fourMarioBtn.setImageResource(R.drawable.down)
            }
        }

        binding.fourOtherBtn.setOnClickListener {
            if(binding.fourOtherText.getVisibility() == View.GONE) {
                binding.fourOtherText.setVisibility(View.VISIBLE)
                binding.fourOtherBtn.setImageResource(R.drawable.up)
            } else if(binding.fourOtherText.getVisibility() == View.VISIBLE) {
                binding.fourOtherText.setVisibility(View.GONE)
                binding.fourOtherBtn.setImageResource(R.drawable.down)
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

        binding.kkStageTwo.setOnClickListener {
            mActivity.changeFrament("KK2")
        }
        binding.kkStageBingo.setOnClickListener {
            mActivity.changeFrament("BINGORESET")
        }
    }
}