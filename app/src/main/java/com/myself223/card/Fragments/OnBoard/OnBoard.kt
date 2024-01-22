package com.myself223.card.Fragments.OnBoard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myself223.card.R
import com.myself223.card.databinding.FragmentOnBoardBinding

class OnBoard : Fragment() {
    private val binding : FragmentOnBoardBinding by lazy {
        FragmentOnBoardBinding.inflate(layoutInflater)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = OnBoardAdapter()
        binding.viwePager.adapter = adapter
    }
}