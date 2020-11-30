package mm1.zeta.catatanfilm.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*
import mm1.zeta.catatanfilm.R
import mm1.zeta.catatanfilm.model.StaticData

class HomeFragment : Fragment() {
    private val data = listOf(
        StaticData(
            R.drawable.film_badboys,
            "Bad Boys",
            28,
            "Marcus and Mike are forced to confront new threats, career changes, and midlife crises as they join the newly created elite team AMMO of the Miami police department to take down the ruthless Armando Armas, the vicious leader of a Miami drug cartel.",
            "8",
            "https://youtu.be/jKCj3XuPG8M",
            "Thriller, Action, Crime"
        ),
        StaticData(R.drawable.film_deadpool, "Popular", 12, "a","9"),
        StaticData(R.drawable.film_jumanji, "Tv Show", 16, "a","9"),
        StaticData(R.drawable.film_charliesangels, "Series", 35, "a","9"),
        StaticData(R.drawable.film_kkn, "Genre", 80, "a","9"),
        StaticData(R.drawable.film_nkcthi, "Country", 99, "a","9")
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recomended_rv.apply {
            recomended_rv.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = RecomendedAdapter(data)
        }
        popular_rv.apply {
            popular_rv.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = PopularAdapter(data)
        }
    }
}