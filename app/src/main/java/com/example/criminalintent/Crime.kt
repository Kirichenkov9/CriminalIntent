package com.example.criminalintent

import java.util.*

class Crime(var id: UUID = UUID.randomUUID(), val title: String, val date: Date = Date(), val solved: Boolean)