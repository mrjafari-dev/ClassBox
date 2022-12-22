package dev.mrjafari.classboc.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import dev.mrjafari.classboc.R
import dev.mrjafari.classboc.databinding.FragmentFirstBinding
import dev.mrjafari.classboc.model.FirstFragmentModel
import dev.mrjafari.classboc.view.Adapters.FirstFragmentAdapter

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val list = ArrayList<FirstFragmentModel>()
        val firstFragmentModel = FirstFragmentModel(1,2,"mohammadreza")
        for (item in 0..9 ){
            list.add(firstFragmentModel)
        }

        val adapter = FirstFragmentAdapter(list)
        val recyclerVIew = binding.HomeList
        recyclerVIew.adapter = adapter
        val layoutManager:LayoutManager = LinearLayoutManager(activity)
        recyclerVIew.layoutManager = layoutManager
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}