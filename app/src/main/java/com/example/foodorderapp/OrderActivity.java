package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Bundle;
import com.example.foodorderapp.Adapters.OrdersAdapter;
import com.example.foodorderapp.Models.OrdersModel;
import com.example.foodorderapp.databinding.ActivityOrderBinding;
import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "5", "12345678"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "5", "12345678"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "5", "12345678"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "5", "12345678"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "5", "12345678"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "5", "12345678"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "5", "12345678"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "5", "12345678"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "5", "12345678"));

        OrdersAdapter adapter = new OrdersAdapter(list, this);
        binding.ordersRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.ordersRecyclerView.setLayoutManager(layoutManager);
    }
}