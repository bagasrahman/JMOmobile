package com.indocyber.jmomobile.activity.main_menu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.indocyber.jmomobile.R
import com.indocyber.jmomobile.activity.profile.ProfileActivity
import com.indocyber.jmomobile.databinding.MainMenuLayoutBinding

class MainMenuActivity : AppCompatActivity() {

    val adapter

    private lateinit var binding: MainMenuLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainMenuLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerMenu.adapter = adap

        val listService = resources.getStringArray(R.array.service_name)
        val listServiceLogo = resources.obtainTypedArray(R.array.service_name)


        binding.menuProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}