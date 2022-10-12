package com.example.navleonidasvanegas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navleonidasvanegas.databinding.FragmentLoginBinding
import com.example.navleonidasvanegas.databinding.FragmentMenuBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {

    private lateinit var fbinding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fbinding = FragmentLoginBinding.inflate(layoutInflater)
        iniciar()
        return fbinding.root
    }

    private fun iniciar() {
        fbinding.btnAcceder.setOnClickListener{
            Navigation.findNavController(fbinding.root).navigate(R.id.acnLoginMenu)
        }

    }



}