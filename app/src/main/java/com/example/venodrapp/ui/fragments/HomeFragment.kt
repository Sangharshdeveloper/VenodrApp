package com.example.venodrapp.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.venodrapp.adapters.VisitorAdapter
import com.example.venodrapp.databinding.FragmentHomeBinding
import com.example.venodrapp.model.Visitor


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    lateinit var list: ArrayList<Visitor>
    lateinit var adapter: VisitorAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        binding.rvVisitedUsers.layoutManager = LinearLayoutManager(context)

        list = ArrayList()


        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))
        list.add(Visitor(1,"","",""))

        adapter = VisitorAdapter(list)
        binding.rvVisitedUsers.adapter = adapter




//        onboardingViewModel.fetchVideo()
//        onboardingViewModel.fetchArticle()
//
//        onboardingViewModel.onFetchVideo.observe(viewLifecycleOwner){
//            if(it != null){
//                link = it.link.toString()
//                points = it.points.toString()
//                time = it.time.toString()
//            }
//        }
//
//        onboardingViewModel.onFetchArticle.observe(viewLifecycleOwner){
//            if(it != null){
//                linkWeb =   it.link.toString()
//                timeWeb =   it.time.toString()
//                pointsWeb = it.points.toString()
//            }
//        }



        return root
    }


}