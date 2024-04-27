package com.satish.navigationexample.framents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.satish.navigationexample.R
import com.satish.navigationexample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        return FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()),container,false).apply { binding=this }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.thirdFragment)
        }
        binding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}