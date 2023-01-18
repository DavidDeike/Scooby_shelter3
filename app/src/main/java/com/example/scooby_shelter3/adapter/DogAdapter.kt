package com.example.scooby_shelter3.adapter



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.scooby_shelter3.R
import com.example.scooby_shelter3.data.model.Dog

// der Adapter braucht den Context um auf String Resourcen zuzugreifen
// und die Liste an Jokes um sie für die RecyclerView vorzubereiten
class DogAdapter(
    private val dataset: List<Dog>
) : RecyclerView.Adapter<DogAdapter.ViewHolder>() {

    // IDEE EINES VIEWHOLDERS
    // der ViewHolder weiß welche Teile des Layouts beim Recycling angepasst werden
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val dogImage = view.findViewById<ImageView>(R.id.dog_image)
        val dogName = view.findViewById<TextView>(R.id.dog_name)
        val dogAge = view.findViewById<TextView>(R.id.dog_age)
        val dogWeight = view.findViewById<TextView>(R.id.dog_weight)

        val adopButton = view.findViewById<Button>(R.id.dog_adop)
    }

    // ERSTELLEN DES VIEWHOLDERS
    // hier werden neue ViewHolder erstellt
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.dog_item, parent, false)

        return ViewHolder(adapterLayout)
    }

    // BEFÜLLEN DES VIEWHOLDERS
    // hier findet der Recyclingprozess statt
    // die vom ViewHolder bereitgestellten Parameter werden verändert
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dog = dataset[position]

       holder.dogImage.setImageResource(dog.imageResource)
        holder.dogName.text=dog.name
        holder.dogAge.text="${dog.age} Monate"
        holder.dogWeight.text="${dog.weight} kg"
    }

    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }
}