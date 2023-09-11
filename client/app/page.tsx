"use client"
import {addNewVisit, getAllVisits, getTotalVisitCount} from '@/api/visitCaller'
import {useState, useEffect} from "react"
import Chart from './Chart'
export default function Home() {
  const [data, setData] = useState([])
  const [totalCount, setTotalCount] = useState<number | any>(0);
  const getData = async () => {
    const x = await getAllVisits()
    setData(x)
  }
  const getCount = async () => {
    const count = await getTotalVisitCount()
    console.log(count)
    setTotalCount(count)
  }
  useEffect(() => {
    addNewVisit()
    getData()
    getCount()
  }, [])
  return (
    <main className="flex min-h-screen flex-col items-center ">
      <h1 className='py-24'>Total Counts : {totalCount}</h1>
      <Chart data = {data}/>
      
    </main>
  )
}
