package com.android.lostarkraid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.lostarkraid.databinding.FragmentBiaKisNormal1Binding

class BiaKisNormal1Fragment : Fragment() {
    private lateinit var binding: FragmentBiaKisNormal1Binding
    private lateinit var mActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBiaKisNormal1Binding.inflate(inflater, container, false)
        mActivity = activity as MainActivity

        val oneTwoEightTextEffectArray = arrayOf(arrayOf(0,1,2), arrayOf(17,20,4), arrayOf(32,35,4))

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

        binding.devidePartyBtn.setOnClickListener {
            if(binding.devidePartyText.getVisibility() == View.GONE) {
                binding.devidePartyText.setVisibility(View.VISIBLE)
                binding.devidePartyBtn.setImageResource(R.drawable.up)
            } else if(binding.devidePartyText.getVisibility() == View.VISIBLE) {
                binding.devidePartyText.setVisibility(View.GONE)
                binding.devidePartyBtn.setImageResource(R.drawable.down)
            }
        }

        binding.pleasurePartyBtn.setOnClickListener {
            if(binding.pleasurePartyText.getVisibility() == View.GONE) {
                binding.pleasurePartyText.setVisibility(View.VISIBLE)
                binding.pleasurePartyBtn.setImageResource(R.drawable.up)
            } else if(binding.pleasurePartyText.getVisibility() == View.VISIBLE) {
                binding.pleasurePartyText.setVisibility(View.GONE)
                binding.pleasurePartyBtn.setImageResource(R.drawable.down)
            }
        }

        binding.cravingPartyBtn.setOnClickListener {
            if(binding.cravingPartyText.getVisibility() == View.GONE) {
                binding.cravingPartyText.setVisibility(View.VISIBLE)
                binding.cravingPartyBtn.setImageResource(R.drawable.up)
            } else if(binding.cravingPartyText.getVisibility() == View.VISIBLE) {
                binding.cravingPartyText.setVisibility(View.GONE)
                binding.cravingPartyBtn.setImageResource(R.drawable.down)
            }
        }

        binding.fourNineBtn.setOnClickListener {
            if(binding.fourNineText.getVisibility() == View.GONE) {
                binding.fourNineText.setVisibility(View.VISIBLE)
                binding.fourNineBtn.setImageResource(R.drawable.up)
            } else if(binding.fourNineText.getVisibility() == View.VISIBLE) {
                binding.fourNineText.setVisibility(View.GONE)
                binding.fourNineBtn.setImageResource(R.drawable.down)
            }
        }

        binding.threeSixBtn.setOnClickListener {
            if(binding.threeSixText.getVisibility() == View.GONE) {
                binding.threeSixText.setVisibility(View.VISIBLE)
                binding.threeSixBtn.setImageResource(R.drawable.up)
            } else if(binding.threeSixText.getVisibility() == View.VISIBLE) {
                binding.threeSixText.setVisibility(View.GONE)
                binding.threeSixBtn.setImageResource(R.drawable.down)
            }
        }

        binding.inOutPleasureBtn.setOnClickListener {
            if(binding.inOutPleasureText.getVisibility() == View.GONE) {
                binding.inOutPleasureText.setVisibility(View.VISIBLE)
                binding.inOutPleasureBtn.setImageResource(R.drawable.up)
            } else if(binding.inOutPleasureText.getVisibility() == View.VISIBLE) {
                binding.inOutPleasureText.setVisibility(View.GONE)
                binding.inOutPleasureBtn.setImageResource(R.drawable.down)
            }
        }

        binding.inOutCravingBtn.setOnClickListener {
            if(binding.inOutCravingText.getVisibility() == View.GONE) {
                binding.inOutCravingText.setVisibility(View.VISIBLE)
                binding.inOutCravingBtn.setImageResource(R.drawable.up)
            } else if(binding.inOutCravingText.getVisibility() == View.VISIBLE) {
                binding.inOutCravingText.setVisibility(View.GONE)
                binding.inOutCravingBtn.setImageResource(R.drawable.down)
            }
        }

        binding.changePartyBtn.setOnClickListener {
            if(binding.changePartyText.getVisibility() == View.GONE) {
                binding.changePartyText.setVisibility(View.VISIBLE)
                binding.changePartyBtn.setImageResource(R.drawable.up)
            } else if(binding.changePartyText.getVisibility() == View.VISIBLE) {
                binding.changePartyText.setVisibility(View.GONE)
                binding.changePartyBtn.setImageResource(R.drawable.down)
            }
        }
        binding.twoFivePleasureBtn.setOnClickListener {
            if(binding.twoFivePleasureText.getVisibility() == View.GONE) {
                binding.twoFivePleasureText.setVisibility(View.VISIBLE)
                binding.twoFivePleasureBtn.setImageResource(R.drawable.up)
            } else if(binding.twoFivePleasureText.getVisibility() == View.VISIBLE) {
                binding.twoFivePleasureText.setVisibility(View.GONE)
                binding.twoFivePleasureBtn.setImageResource(R.drawable.down)
            }
        }
        binding.twoFiveCravingBtn.setOnClickListener {
            if(binding.twoFiveCravingText.getVisibility() == View.GONE) {
                binding.twoFiveCravingText.setVisibility(View.VISIBLE)
                binding.twoFiveCravingBtn.setImageResource(R.drawable.up)
            } else if(binding.twoFiveCravingText.getVisibility() == View.VISIBLE) {
                binding.twoFiveCravingText.setVisibility(View.GONE)
                binding.twoFiveCravingBtn.setImageResource(R.drawable.down)
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

        binding.pleasureStart.setOnClickListener{
            binding.pleasurePartyLO.setVisibility(View.VISIBLE)
            binding.fourNineLO.setVisibility(View.VISIBLE)
            binding.threeSixLO.setVisibility(View.VISIBLE)
            binding.inOutPleasureLO.setVisibility(View.VISIBLE)
            binding.twoFiveCravingLO.setVisibility(View.VISIBLE)

            binding.cravingPartyLO.setVisibility(View.GONE)
            binding.inOutCravingLO.setVisibility(View.GONE)
            binding.twoFivePleasureLO.setVisibility(View.GONE)
            binding.oneTwoLO.setVisibility(View.GONE)
        }

        binding.cravingStart.setOnClickListener{
            binding.pleasurePartyLO.setVisibility(View.GONE)
            binding.fourNineLO.setVisibility(View.GONE)
            binding.threeSixLO.setVisibility(View.GONE)
            binding.inOutPleasureLO.setVisibility(View.GONE)
            binding.twoFiveCravingLO.setVisibility(View.GONE)

            binding.cravingPartyLO.setVisibility(View.VISIBLE)
            binding.inOutCravingLO.setVisibility(View.VISIBLE)
            binding.twoFivePleasureLO.setVisibility(View.VISIBLE)
            binding.oneTwoLO.setVisibility(View.VISIBLE)
        }



        binding.stageTwo.setOnClickListener {
            mActivity.changeFrament("BKNORMAL2")
        }
    }
}