package com.android.lostarkraid

import android.app.Activity
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.android.lostarkraid.databinding.FragmentBaltanHardBinding


class BaltanHardFragment : Fragment() {

    private lateinit var binding: FragmentBaltanHardBinding
    private lateinit var mActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBaltanHardBinding.inflate(inflater, container, false)
        mActivity = activity as MainActivity

        val fourtyTextEffectArray = arrayOf(arrayOf(0,1,3), arrayOf(26,29,2), arrayOf(62,64,2), arrayOf(78,81,1))
        val twoFiveTextEffectArray = arrayOf(arrayOf(1,1,3), arrayOf(26,29,1), arrayOf(62,64,1), arrayOf(78,81,2))

        mActivity.setTextEffect(fourtyTextEffectArray,binding.fourtyInfo)
        mActivity.setTextEffect(twoFiveTextEffectArray,binding.twoFiveInfo)

        setBtnEventListener()

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_baltan_hard, container, false)
        return binding.root
    }
    fun setBtnEventListener(){
        binding.fourFiveBtn.setOnClickListener {
            if(binding.fourFiveText.getVisibility() == View.GONE) {
                binding.fourFiveText.setVisibility(View.VISIBLE)
                binding.fourFiveBtn.setImageResource(R.drawable.up)
            } else if(binding.fourFiveText.getVisibility() == View.VISIBLE) {
                binding.fourFiveText.setVisibility(View.GONE)
                binding.fourFiveBtn.setImageResource(R.drawable.down)
            }
        }
        binding.fourtyBtn.setOnClickListener {
            if(binding.fourtyText.getVisibility() == View.GONE) {
                binding.fourtyText.setVisibility(View.VISIBLE)
                binding.fourtyBtn.setImageResource(R.drawable.up)
            } else if(binding.fourtyText.getVisibility() == View.VISIBLE) {
                binding.fourtyText.setVisibility(View.GONE)
                binding.fourtyBtn.setImageResource(R.drawable.down)
            }
        }
        binding.thirtyBtn.setOnClickListener {
            if(binding.thirtyText.getVisibility() == View.GONE) {
                binding.thirtyText.setVisibility(View.VISIBLE)
                binding.thirtyBtn.setImageResource(R.drawable.up)
            } else if(binding.thirtyText.getVisibility() == View.VISIBLE) {
                binding.thirtyText.setVisibility(View.GONE)
                binding.thirtyBtn.setImageResource(R.drawable.down)
            }
        }
        binding.twoFiveBtn.setOnClickListener {
            if(binding.twoFiveText.getVisibility() == View.GONE) {
                binding.twoFiveText.setVisibility(View.VISIBLE)
                binding.twoFiveBtn.setImageResource(R.drawable.up)
            } else if(binding.twoFiveText.getVisibility() == View.VISIBLE) {
                binding.twoFiveText.setVisibility(View.GONE)
                binding.twoFiveBtn.setImageResource(R.drawable.down)
            }
        }
        binding.oneFiveBtn.setOnClickListener {
            if(binding.oneFiveText.getVisibility() == View.GONE) {
                binding.oneFiveText.setVisibility(View.VISIBLE)
                binding.oneFiveBtn.setImageResource(R.drawable.up)
            } else if(binding.oneFiveText.getVisibility() == View.VISIBLE) {
                binding.oneFiveText.setVisibility(View.GONE)
                binding.oneFiveBtn.setImageResource(R.drawable.down)
            }
        }
        binding.blackBtn.setOnClickListener {
            if(binding.blackText.getVisibility() == View.GONE) {
                binding.blackText.setVisibility(View.VISIBLE)
                binding.blackBtn.setImageResource(R.drawable.up)
            } else if(binding.blackText.getVisibility() == View.VISIBLE) {
                binding.blackText.setVisibility(View.GONE)
                binding.blackBtn.setImageResource(R.drawable.down)
            }
        }
        binding.stageTwo.setOnClickListener{
            mActivity.changeFrament("BTHARD2")
        }
    }
}