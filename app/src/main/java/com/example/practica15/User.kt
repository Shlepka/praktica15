package com.example.practica15

import android.os.Parcel
import android.os.Parcelable

class User() : Parcelable {
    private var name: String = ""
    private var month: Int = 0
    private var age: Int = 0
    constructor(parcel: Parcel) : this() {
        name = parcel.readString().toString()
        month = parcel.readInt()
        age = parcel.readInt()
    }
    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }
        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
    constructor(_name: String, _month: Int, _age: Int) : this() {
        name = _name
        month = _month
        age = _age
    }
    fun setName(_name: String){
        name = _name
    }
    fun getName(): String {
        return name
    }
    fun setMonth(_month: Int){
        month = _month
    }
    fun getMonth(): Int {
        return month
    }
    fun setAge(_age: Int){
        age = _age
    }
    fun getAge(): Int {
        return age
    }
    override fun describeContents(): Int {
        return 0
    }
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(name)
        dest?.writeInt(month)
        dest?.writeInt(age)
    }
}
