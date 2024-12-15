package com.sideandbottomnav.android.sideandbottomnav.ui.dashbord

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.sideandbottomnav.android.sideandbottomnav.R
import com.sideandbottomnav.android.sideandbottomnav.databinding.FragmentDashbordBinding
import com.sideandbottomnav.android.sideandbottomnav.databinding.FragmentGalleryBinding


class DashboardFragment : Fragment() {
    private var _binding: FragmentDashbordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dashboardViewModel= ViewModelProvider(this).get(DashboardViewModel::class.java)
        _binding = FragmentDashbordBinding.inflate(inflater,container,false)
        val root:View =binding.root

        val textView:TextView =binding.dashTv     // bind textView with id
        dashboardViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        return root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding= null
    }



}