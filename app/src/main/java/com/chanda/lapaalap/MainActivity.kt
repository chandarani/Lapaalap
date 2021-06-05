package com.chanda.lapaalap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.cardview.widget.CardView
import com.chanda.lapaalap.menu.BurgerMenuActivity
import com.chanda.lapaalap.menu.CoffeeMenuActivity
import com.chanda.lapaalap.menu.ColdDrinksMenuActivity
import com.chanda.lapaalap.menu.PizzaMenuActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_burger_menu.imageView3
import kotlinx.android.synthetic.main.activity_coffee_menu.imageView4
import kotlinx.android.synthetic.main.activity_cold_drinks_menu.imageView
import kotlinx.android.synthetic.main.activity_coffee_menu.imageView4


class MainActivity : AppCompatActivity() ,View.OnClickListener {

    private  var burgermenu: CardView? = null
    private var pizzamenu: CardView? = null
    private var cold_drinkmenu: CardView? = null
    private var coffeemenu: CardView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        burgermenu = findViewById(R.id.BurgerMenu)
        pizzamenu = findViewById(R.id.PizzaMenu)
        cold_drinkmenu = findViewById(R.id.ColdDrinkMenu)
        coffeemenu = findViewById(R.id.CoffeeMenu)

        burgermenu?.setOnClickListener(this)
        pizzamenu?.setOnClickListener(this)
        cold_drinkmenu?.setOnClickListener(this)
        coffeemenu?.setOnClickListener(this)

    }

    override fun onClick(view: View?){

        when(view?.id){
            (R.id.BurgerMenu) -> {
               val intent = Intent(this,BurgerMenuActivity::class.java)
                startActivity(intent)

            }

            (R.id.PizzaMenu) -> {
                val intent = Intent(this,PizzaMenuActivity::class.java)
                startActivity(intent)

            }

            (R.id.ColdDrinkMenu) -> {
                val intent = Intent(this,ColdDrinksMenuActivity::class.java)
                startActivity(intent)

            }

            (R.id.CoffeeMenu) -> {
                val intent = Intent(this,CoffeeMenuActivity::class.java)
                        startActivity(intent)

            }
        }

    }


}