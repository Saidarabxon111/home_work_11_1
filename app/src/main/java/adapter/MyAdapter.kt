package adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_1.view.*
import models.User
import uz.saidarabxon.akramov.homework11_1.R

class MyAdapter(private val list:ArrayList<User>, context: Context):ArrayAdapter<User>(context, R.layout.item_1,list) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemView:View
if (convertView==null){
    itemView=LayoutInflater.from(context).inflate(R.layout.item_1,parent,false)
}else{
  itemView = convertView
}

        itemView.tv_item.text = list[position].name
        itemView.image_item.setImageResource(list[position].image)


        return itemView
    }

}