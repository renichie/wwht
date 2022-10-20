package de.renichie.wwht.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.renichie.wwht.R
import de.renichie.wwht.model.Forecast

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Forecast>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val topicTextView: TextView = view.findViewById(R.id.forecast_topic)
        val predictionTextView: TextView = view.findViewById(R.id.forecast_prediction)
        val resultTextView: TextView = view.findViewById(R.id.forecast_result)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.forecast_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.topicTextView.text = item.topic
        holder.predictionTextView.text = item.prediction
        holder.resultTextView.text = item.forecastResult.toString()
    }
}
