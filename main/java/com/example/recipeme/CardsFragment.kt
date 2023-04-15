package com.example.recipeme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeme.databinding.FragmentCardsBinding


class CardsFragment : Fragment() {
    private lateinit var navController: NavController
    private lateinit var recyclerView: RecyclerView
    private lateinit var items: ArrayList<RecipeCardData>
    private lateinit var myadapter: MyAdapter
    private lateinit var binding: FragmentCardsBinding
    private val recipes = listOf(
        Recipe(1, "Pasta", "Delicious pasta with tomato sauce"),
        Recipe(2, "Pizza", "Authentic Italian pizza"),
        Recipe(3, "Burger", "Classic American cheeseburger"),
        Recipe(1, "Pasta", "Delicious pasta with tomato sauce"),
        Recipe(2, "Pizza", "Authentic Italian pizza"),
        Recipe(3, "Burger", "Classic American cheeseburger"),
        Recipe(1, "Pasta", "Delicious pasta with tomato sauce"),
        Recipe(2, "Pizza", "Authentic Italian pizza"),
    )



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCardsBinding.inflate(inflater, container, false)
        val args = Fragment2Args.fromBundle(requireArguments())

        val view = inflater.inflate(R.layout.fragment_cards, container, false)
        val recyclerView = binding.recycler
        recyclerView.adapter = MyAdapter(items)
        recyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycler)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = layoutManager
        myadapter = MyAdapter(items)
        recyclerView.adapter = myadapter
        navController = findNavController()
        myadapter.setOnItemClickListener(object :MyAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {

                val SelectedRecipe = recipes[position]
                val action = CardsFragmentDirections.actionCardsFragmentToFragment2(SelectedRecipe)
               /* val action2 :NavDirections= CardsFragmentDirections.actionCardsFragmentToFragment2(selectedRecipe.instructions)
                val action3:NavDirections = CardsFragmentDirections.actionCardsFragmentToFragment2(selectedRecipe.name)*/
                navController.navigate(action)
               /* navController.navigate(action2)
                navController.navigate(action3)
*/


        }})



        items.add(
            RecipeCardData(
                "chicken biryani",
                "number of Ingredients",
                "20",
                "For",
                "Lunch",
                "Time Taken",
                "60",
                )
        )
        items.add(
            RecipeCardData(
                "chapathi",
                "number of Ingredients",
                "2",
                "For",
                "dinner",
                "Time Taken",
                "23",

                )
        )
        items.add(
            RecipeCardData(
                "chapathi",
                "number of Ingredients",
                "2",
                "For",
                "dinner",
                "Time Taken",
                "23",

                )
        )
        items.add(
            RecipeCardData(
                "chapathi",
                "number of Ingredients",
                "2",
                "For",
                "dinner",
                "Time Taken",
                "23",

                )
        )
        items.add(
            RecipeCardData(
                "chapathi",
                "number of Ingredients",
                "2",
                "For",
                "dinner",
                "Time Taken",
                "23",

                )
        )
        items.add(
            RecipeCardData(
                "chapathi",
                "number of Ingredients",
                "2",
                "For",
                "dinner",
                "Time Taken",
                "23",

                )
        )
        items.add(
            RecipeCardData(
                "chapathi",
                "number of Ingredients",
                "2",
                "For",
                "dinner",
                "Time Taken",
                "23",

                )
        )
        items.add(
            RecipeCardData(
                "chapathi",
                "number of Ingredients",
                "2",
                "For",
                "dinner",
                "Time Taken",
                "23",
            )
        )


    }


}
