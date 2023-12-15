package com.shoykat.androidmaterialdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.shoykat.androidmaterialdesign.databinding.FragmentIntroUidesignBinding


class IntroUidesignFragment : Fragment() {
    private lateinit var binding : FragmentIntroUidesignBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentIntroUidesignBinding.inflate(inflater,container,false)
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_introUidesignFragment_to_homeFragment)
        }
        return binding.root
    }


}