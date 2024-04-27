package com.satish.navigationexample.framents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.satish.navigationexample.R
import com.satish.navigationexample.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return FragmentFirstBinding.inflate(LayoutInflater.from(requireContext()), container, false).apply { binding=this }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //TODO: Define your actions over here
        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.secondFragment)
        }
    }

}