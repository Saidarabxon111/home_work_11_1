package uz.saidarabxon.akramov.homework11_1

import adapter.MyAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.constraintlayout.helper.widget.Carousel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_1.*
import models.User

class MainActivity : AppCompatActivity() {

    lateinit var list: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

loadData()
    }

    private fun loadData() {
        list = ArrayList()

        list.add(User(R.drawable.android_logo,"Android"))
        list.add(User(R.drawable.java_lodo,"Java"))
        list.add(User(R.drawable.python,"Python"))
        list.add(User(R.drawable.sql,"MySQL"))
        list.add(User(R.drawable.php,"PHP"))


//        list.add("Android")
//        list.add("Java")
//        list.add("Python")
//        list.add("MySQL")
//        list.add("PHP")


    val adapter  = MyAdapter(list,this)
        list_view.adapter  =adapter


        list_view.setOnItemClickListener { parent, view, i, id ->
            Toast.makeText(this, "${list[i]}", Toast.LENGTH_SHORT).show()
        }

//   lin_1.setOnClickListener {
//       val intent = Intent(this,MainActivity2::class.java)
//
//       startActivity(intent)
//   }






    }

}