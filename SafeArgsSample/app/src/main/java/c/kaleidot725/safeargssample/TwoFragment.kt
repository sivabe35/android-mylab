package c.kaleidot725.safeargssample


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class TwoFragment : Fragment() {

    val args : TwoFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val b = view.findViewById<Button>(R.id.next_button)
        b.setOnClickListener {
            val action = TwoFragmentDirections.actionTwoFragmentToThreeFragment("Three Fragment")
            this.findNavController().navigate(action)
        }

        val t = view.findViewById<TextView>(R.id.param_view)
        t.text = args.title
    }
}
