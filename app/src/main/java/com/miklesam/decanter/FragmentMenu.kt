package com.miklesam.decanter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.miklesam.decanter.databinding.FragmentMenuBinding

class FragmentMenu : Fragment(R.layout.fragment_menu) {

    private lateinit var binding: FragmentMenuBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        binding = FragmentMenuBinding.bind(view)
        binding.staticBttn.setOnClickListener {
            navController.navigate(R.id.action_fragmentMenu_to_fragmentStaticSegmentation)
        }
    }

}