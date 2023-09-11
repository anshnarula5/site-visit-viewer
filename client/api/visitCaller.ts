import { convertDate } from "@/utils";

export const getAllVisits = async () => {
    const response = await fetch("http://localhost:8080/api/visit", {
        method: "GET",
        mode: "cors",
        headers: {
            "Content-Type": "application/json",
        },
    })
    const data = await response.json();
    const convertedDate = data.map((visit: any) => ({
        ...visit, date: convertDate(visit.date)
    }))
    return convertedDate;
}

export const addNewVisit = async () => {
    const data = {
        date : new Date().toJSON().slice(0, 10)
    }
    const response = await fetch("http://localhost:8080/api/visit", {
        method: "POST",
        mode: "cors",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(data),
    })
}
export const getTotalVisitCount = async() => {
    const response = await fetch("http://localhost:8080/api/count", {
        method: "GET",
        mode: "cors",
        headers: {
            "Content-Type": "application/json",
        },
    })
    const data = await response.json();
    return data
}