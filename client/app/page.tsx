"use client"

import getAllVisits from '@/api/visitCaller'
import Image from 'next/image'
import {useState} from "react"
export default function Home() {
  const [data, setData] = useState([])
  const getData = () => {
    const x = getAllVisits()
    console.log(x)
  }
  return (
    <main className="flex min-h-screen flex-col items-center justify-between p-24">
     <button className='btn' onClick={getData}>button</button>
    </main>
  )
}
