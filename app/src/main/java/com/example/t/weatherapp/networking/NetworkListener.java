package com.example.t.weatherapp.networking;



public interface NetworkListener<T>
{
    void onResult(T object);

}
