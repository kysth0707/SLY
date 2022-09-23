package com.example.savelistenyoutube

import android.content.Context
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import android.util.Log
import com.android.volley.toolbox.Volley
import org.json.JSONObject

object RequestObject {
    const val URLValue= "https://www.youtube.com/results?search_query=애국가"
    fun send(context : Context, success : (Boolean) -> Unit) {
        val myJson = JSONObject()
        val requestBody = myJson.toString()

        val testRequest = object : StringRequest(Method.GET, URLValue, Response.Listener
        { response ->
            success(true)
            Log.v("Success", "서버 Response 성공 : $response")
        }, Response.ErrorListener { error ->
            success(false)
            Log.d("Error", "서버 Response 실패 : $error")
        }){
            override fun getBodyContentType(): String {
                return "application/json; charset=utf-8"
            }

            override fun getBody(): ByteArray {
                return requestBody.toByteArray()
            }
        }

        Volley.newRequestQueue(context).add(testRequest)

    }
}