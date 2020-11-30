//package mm1.zeta.catatanfilm.ui
//
//import android.content.Context
//import android.content.Intent
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import mm1.zeta.catatanfilm.MyData
//
//class ListMyDataSearch {
//    class ListMyDataAdapter(private val listMyData: ArrayList<MyData>, val context: Context) :
//        RecyclerView.Adapter<ListMyDataAdapter.ListViewHolder>() {
//        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
//            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
//            return ListViewHolder(view)
//        }
//        override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
//            holder.bind(listMyData[position])
//            holder.itemView.setOnClickListener {
//                val moveWithObjectIntent = Intent(context, DetailActivity::class.java)
//                moveWithObjectIntent.putExtra(DetailActivity.EXTRA_MYDATA, listMyData[position])
//                context.startActivity(moveWithObjectIntent)
//            }
//        }
//        override fun getItemCount(): Int = listMyData.size
//        inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//            fun bind(myData: MyData) {
//                with(itemView){
//                    Glide.with(itemView.context)
//                        .load(myData.photo)
//                        .apply(RequestOptions().override(55, 55))
//                        .into(img_item_photo)
//                    tv_item_name.text = myData.name
//                    tv_item_genre.text = myData.genre
//                }
//            }
//        }
//    }
//}