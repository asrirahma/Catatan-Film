package mm1.zeta.catatanfilm.ui.home

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_card_horizontal.view.*
import mm1.zeta.catatanfilm.R
import mm1.zeta.catatanfilm.model.StaticData
import mm1.zeta.catatanfilm.ui.DetailActivity

class RecomendedAdapter(private val list: List<StaticData>) :
    RecyclerView.Adapter<RecomendedAdapter.ViewHolder>() {
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_card_horizontal, parent, false)
        )
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.recomended_name.text = list[position].name
      //  holder.view.popularRating.text = list[position].voteAverage.toString()
        Glide.with(holder.view)
            .load(list[position].image)
            .placeholder(R.color.gray)
            .into(holder.view.recomended_backdrop)

        holder.view.setOnClickListener {
            val intentDetail = Intent(holder.view.context, DetailActivity::class.java)
            intentDetail.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            intentDetail.putExtra("EXTRA", list[position])
            holder.view.context.startActivity(intentDetail)
        }
    }

}