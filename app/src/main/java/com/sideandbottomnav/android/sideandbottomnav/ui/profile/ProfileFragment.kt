package com.sideandbottomnav.android.sideandbottomnav.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.sideandbottomnav.android.sideandbottomnav.R
import com.sideandbottomnav.android.sideandbottomnav.databinding.FragmentGalleryBinding
import com.sideandbottomnav.android.sideandbottomnav.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val profileViewModel =
            ViewModelProvider(this).get(ProfileViewModel::class.java)

        _binding = FragmentProfileBinding.inflate(inflater,container,false)
        val root:View = binding.root

        val textView:TextView =binding.profileTextView
        profileViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        return root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding =null
    }
}