package com.example.tousnaapp.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.tousnaapp.activity.ItemPhnomPenhActivity
import com.example.tousnaapp.activity.ItemProvinceActivity
import com.example.tousnaapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    //Method for ImageSliderView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageSliderView = binding.imageSlider  // Corrected this line
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-KpvJUO1y-D0NI-MgIVJghCwUGzYEPkRXJQ&usqp=CAU"))
        imageList.add(SlideModel("https://i0.wp.com/sotheadventurebegins.com/wp-content/uploads/2022/09/ANGKOR-WAT-TIPS.png?fit=1060%2C710&ssl=1"))
        imageList.add(SlideModel("https://www.airpano.com/files/angkor-wat-cambodia/image1.jpg"))
        imageList.add(SlideModel("https://assets.editorial.aetnd.com/uploads/2018/02/lasers-reveal-medieval-cities-in-cambodian-jungles-featured-photo.jpg"))
        imageList.add(SlideModel("https://cdn.kastatic.org/ka-perseus-images/aaeb3d9d5a1eea9a40944ab103de7ff24250d1f4.jpg"))

        imageSliderView.setImageList(imageList, ScaleTypes.CENTER_INSIDE)


        // Set OnClickListener for the CardView (assuming you have a CardView in your layout)
        binding.cardViewLayout1.setOnClickListener {
            val intent = Intent(requireContext(), ItemPhnomPenhActivity::class.java)
            startActivity(intent)
        }

        binding.cardViewLayout2.setOnClickListener {
            val intent = Intent(requireContext(), ItemProvinceActivity::class.java)
            startActivity(intent)
        }
    }

}
