package com.asianaidt.orderapp.Adatpers

import android.content.Context
import android.security.identity.AccessControlProfileId
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.asianaidt.orderapp.R
import com.asianaidt.orderapp.datas.StoreDate

class StoreAdapter (
    val mContext: Context,
    val resId: Int,
    val mList : List<StoreDate>
        ): ArrayAdapter<StoreDate> (mContext,resId,mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if(tempRow == null){
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.store_list_item,null)
        }

        val row = tempRow!!

        return row
    }
}