package com.example.venodrapp.ui.fragments

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import com.example.venodrapp.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
//    lateinit var tinyDB: TinyDB
//    private lateinit var onboardingViewModel: OnboardingViewModel
//    lateinit var dbinding: DialogueRedeemBinding
//    lateinit var mBuilder: AlertDialog.Builder

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        tinyDB = TinyDB(context)
//        onboardingViewModel = ViewModelProvider(this)[OnboardingViewModel::class.java]
//
//
//
//        onboardingViewModel.fetchUserData( hashMapOf(
//            "uid" to tinyDB.getString("userId").toString())
//        )
//
//
//        onboardingViewModel.onFetchUserData.observe(viewLifecycleOwner){
//
//            if(it != null){
//                binding.tvUsername.text = it.username
//                binding.tvEmail.text = it.email
//                binding.tvPoints.text = "Your Points :"+it.points
//                binding.tvReferCode.text = it.refercode
//            }
//        }
//
//         binding.btnSupport.setOnClickListener{
//             val email = Intent(Intent.ACTION_SENDTO)
//             email.data = Uri.parse("mailto:your.email@gmail.com")
//             email.putExtra(Intent.EXTRA_SUBJECT, "Support " + resources.getString(R.string.app_name))
//             email.putExtra(Intent.EXTRA_TEXT, "Do you want any help from us.")
//             startActivity(email)
//         }
//
//         binding.btnWithdraw.setOnClickListener{
//             dbinding = DialogueRedeemBinding.inflate(layoutInflater)
//
//
//             val mDialogView = dbinding.root
//
//
//             mBuilder = AlertDialog.Builder(activity)
//                 .setView(mDialogView)
//
//             //show dialog
//             val mAlertDialog = mBuilder.show()
//             //login button click of custom layout
//
//             dbinding.btnForgotPassword.setOnClickListener {
//                 if (dbinding.etPasswordEmail.text.toString().trim() != "" && dbinding.etAccountNum.text.toString().trim() !="" && dbinding.etIfsc.text.toString().trim() != "" ) {
//                    if(dbinding.etPasswordEmail.text.toString().trim().toInt() > binding.tvPoints.text.toString().trim().toInt()) {
//                        onboardingViewModel.fetchWithdrawPointResponse(
//                            hashMapOf(
//                                "uid" to tinyDB.getString("userId").toString().trim(),
//                                "email" to binding.tvEmail.text.toString().trim(),
//                                "name" to binding.tvUsername.text.toString().trim(),
//                                "points" to dbinding.etPasswordEmail.text.toString().trim(),
//                                "msg" to "Acc Num: " + dbinding.etAccountNum.text.toString()
//                                    .trim() + "\n IFSC: " + dbinding.etIfsc.text.toString().trim(),
//                            )
//                        )
//                    }else{
//                        Toast.makeText(activity, "Enter valid points", Toast.LENGTH_SHORT).show()
//                    }
//                 } else {
//                     Toast.makeText(context, "Minimum 100 points are required", Toast.LENGTH_SHORT).show()
//                 }
//             }
//             mDialogView.setOnClickListener {
//                 //dismiss dialog
//                 mAlertDialog.dismiss()
//             }
//
//
//         }
//          binding.btnLogOut.setOnClickListener{
//          tinyDB.clear()
//          startActivity(Intent(context,LoginActivity::class.java))
//          activity?.finish()
//          }
//
//
//        onboardingViewModel.onWithdrawPoints.observe(viewLifecycleOwner) {
//            if (it != null) {
//
//                Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
//
//                if(it == "Request Send Successfully"){
//                   startActivity(Intent(activity,MainActivity::class.java))
//                    activity?.finish()
//                }
//
//            } else {
//                Log.e("SendOtpActivity", "onSendOtpResponse is null")
//            }
//        }

        return root
    }


}