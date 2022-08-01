package com.indocyber.jmomobile.activity.profile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.indocyber.jmomobile.activity.main_menu.MainMenuActivity
import com.indocyber.jmomobile.databinding.ProfilLayoutBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ProfilLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ProfilLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuHome.setOnClickListener {
            startActivity(Intent(this, MainMenuActivity::class.java))
        }
    }
}