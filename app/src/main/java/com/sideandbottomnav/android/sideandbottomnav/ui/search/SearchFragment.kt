package com.sideandbottomnav.android.sideandbottomnav.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.sideandbottomnav.android.sideandbottomnav.R
import com.sideandbottomnav.android.sideandbottomnav.databinding.FragmentGalleryBinding
import com.sideandbottomnav.android.sideandbottomnav.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val searchViewModel =
            ViewModelProvider(this).get(SearchViewModel::class.java)

        _binding=FragmentSearchBinding.inflate(inflater,container,false)
        val root:View =binding.root

        val textView:TextView = binding.searchTextView
        searchViewModel.text.observe(viewLifecycleOwner){
            textView.text=it
        }
        return root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}