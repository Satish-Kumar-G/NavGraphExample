package com.satish.navigationexample.framents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.satish.navigationexample.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?, ): View {
        // Inflate the layout for this fragment
        return FragmentThirdBinding.inflate(LayoutInflater.from(requireContext()),container,false).apply { binding=this }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}