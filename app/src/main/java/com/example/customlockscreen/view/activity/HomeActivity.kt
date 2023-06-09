package com.example.customlockscreen.view.activity

import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.customlockscreen.R
import com.example.customlockscreen.adapter.HeaderSortNoteListAdapter
import com.example.customlockscreen.adapter.PagerAdapter
import com.example.customlockscreen.databinding.ActivityHomeBinding
import com.example.customlockscreen.model.bean.MessageEvent
import com.example.customlockscreen.model.db.DataBase
import com.example.customlockscreen.util.KvCommission
import com.example.customlockscreen.view.fragment.MineFragment
import com.example.customlockscreen.view.fragment.NoteListFragment
import com.example.customlockscreen.view.fragment.NoteSortFragment
import com.example.customlockscreen.view.fragment.SettingFragment
import org.greenrobot.eventbus.EventBus

class HomeActivity : AppCompatActivity() {

    private lateinit var  binding : ActivityHomeBinding

    private var fragmentList = ArrayList<Fragment>()

    private val sortNoteDao = DataBase.dataBase.sortNoteDao()

    private val labelDao = DataBase.dataBase.labelDao()

    private lateinit var adapter:HeaderSortNoteListAdapter

    private lateinit var clickListener: HeaderSortNoteListAdapter.OnClickListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  DataBindingUtil.setContentView(this,R.layout.activity_home)

        binding.lifecycleOwner = this

        setSupportActionBar(binding.homeToolbar)

        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.setHomeAsUpIndicator(R.mipmap.menu)
        }


        binding.navigationView.setNavigationItemSelectedListener {
            binding.drawerLayout.closeDrawers()
            true
        }


        val list = sortNoteDao.getAllSortNotes()

        clickListener =object :HeaderSortNoteListAdapter.OnClickListener{
            override fun onClick(sortNoteName: String) {
               EventBus.getDefault().post(MessageEvent(sortNoteName))
                binding.drawerLayout.closeDrawers()
                binding.homeViewPager.currentItem = 0
            }

        }

        adapter = HeaderSortNoteListAdapter(this, list, clickListener)

        val headerLayout = binding.navigationView.inflateHeaderView(R.layout.header_layout)
        val recycleView = headerLayout.findViewById<RecyclerView>(R.id.drawlayout_headerlayout_recycleview)
        recycleView.adapter = adapter
        recycleView.layoutManager = GridLayoutManager(this, 1)

        val textView = headerLayout.findViewById<TextView>(R.id.all_labels_count)
        headerLayout.findViewById<RelativeLayout>(R.id.all_labels_layout).setOnClickListener {
            binding.drawerLayout.closeDrawers()
            EventBus.getDefault().post(MessageEvent("All"))
            binding.homeViewPager.currentItem = 0
        }

        headerLayout.findViewById<LinearLayout>(R.id.sort_note_manager_layout).setOnClickListener {
            binding.drawerLayout.closeDrawers()
            binding.homeViewPager.currentItem = 1

        }

        headerLayout.findViewById<LinearLayout>(R.id.mine_layout).setOnClickListener {
            binding.drawerLayout.closeDrawers()
            binding.homeViewPager.currentItem = 2
        }

        headerLayout.findViewById<LinearLayout>(R.id.setting_layout).setOnClickListener {
            binding.drawerLayout.closeDrawers()
            binding.homeViewPager.currentItem = 3
        }


        binding.homeToolbar.setNavigationOnClickListener {

            adapter.sortNoteList = sortNoteDao.getAllSortNotes()
            adapter.notifyDataSetChanged()

            textView.text = labelDao.getLabelCount().toString()

            binding.drawerLayout.openDrawer(Gravity.LEFT)
        }


        fragmentControl()

    }

    private fun fragmentControl() {

        fragmentList.add(NoteListFragment.newInstance())
        fragmentList.add(NoteSortFragment.newInstance())
        fragmentList.add(MineFragment.newInstance())
        fragmentList.add(SettingFragment.newInstance())


        binding.homeViewPager.adapter = PagerAdapter(this, fragmentList)
        binding.homeViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when (position) {
                    0 -> {
                        binding.homeToolbar.title = "Home"
                        binding.homeNavigationView.selectedItemId = R.id.item_home
                    }

                    1 -> {
                        binding.homeToolbar.title = "Catalogue"
                        binding.homeNavigationView.selectedItemId = R.id.item_note
                    }

                    2 -> {
                        binding.homeToolbar.title = "Mine"
                        binding.homeNavigationView.selectedItemId = R.id.item_mine
                    }

                    3 -> {
                        binding.homeToolbar.title = "Setting"
                        binding.homeNavigationView.selectedItemId = R.id.item_setting
                    }
                }
            }
        })


        binding.homeNavigationView.setOnNavigationItemSelectedListener {

            when(it.itemId){
                R.id.item_home->{
                    binding.homeViewPager.currentItem = 0
                }

                R.id.item_note->{
                    binding.homeViewPager.currentItem = 1
                }

                R.id.item_mine,-> {
                    binding.homeViewPager.currentItem = 2
                }

                R.id.item_setting->{
                    binding.homeViewPager.currentItem = 3
                }

            }
            return@setOnNavigationItemSelectedListener true
        }

    }



    override fun onResume() {
        super.onResume()
        //用户是否改变了该应用的模式切换
        //1. 没有改变过:按照系统设置的模式改变
        //2. 改变：按照应用的设置
        val isFollowSystem by KvCommission("isFollowSystem",true)
        if(isFollowSystem){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        }else{
            val isDarkTheme by KvCommission("isDarkTheme",false)
            if(isDarkTheme){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
    }
}