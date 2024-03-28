package me.lucky.duress

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import me.lucky.duress.databinding.ActivityAppLockBinding

open class AppLockActivity : AppCompatActivity(){

    private lateinit var binding: ActivityAppLockBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppLockBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSubmit.setOnClickListener{
            val userName = binding.etUsername.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()
            if (userName == "aaa" && password == "bbb"){
                openMainScreen()
            }else{
                Toast.makeText(this, "Invalid username and password", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun openMainScreen(){
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }

}