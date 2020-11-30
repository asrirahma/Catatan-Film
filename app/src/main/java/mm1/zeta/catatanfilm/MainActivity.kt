package mm1.zeta.catatanfilm

import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.nav_header_main.*
//import mm1.zeta.catatanfilm.ui.ListMyDataSearch

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
//    private val list = ArrayList<MyData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        rv_mydata.setHasFixedSize(true)
//        list.addAll(getListMyDatas())
//        showRecyclerList()

        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val navController = findNavController(nav_host_fragment.id)

        appBarConfiguration = AppBarConfiguration(setOf(R.id.nav_home, R.id.nav_language, R.id.nav_slideshow), drawer_layout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        nav_view.setupWithNavController(navController)

//        navHeaderProfile.setOnClickListener {
//            Toast.makeText(it.context, "test", Toast.LENGTH_LONG).show()
//        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(nav_host_fragment.id)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

//    fun getListMyDatas(): ArrayList<MyData> {
//        val dataName = resources.getStringArray(R.array.data_name)
//        val dataDescription = resources.getStringArray(R.array.data_genre)
//        val dataPhoto = resources.getStringArray(R.array.data_photo)
//        val listMyData = ArrayList<MyData>()
//        for (position in dataName.indices) {
//            val myData = MyData(
//                dataName[position],
//                dataGenre[position],
//                dataPhoto[position]
//            )
//            listMyData.add(myData)
//        }
//        return listMyData
//    }

//    private fun showRecyclerList() {
//        rv_mydata.layoutManager = LinearLayoutManager(this)
//        val listMyDataAdapter = ListMyDataSearch.ListMyDataAdapter(list, this@MainActivity)
//        rv_mydata.adapter = listMyDataAdapter
//    }
}