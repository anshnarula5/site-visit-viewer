const getAllVisits = () => {
    const data = fetch("http://localhost:8080/api/visit", {})
    console.log(data)
    return data;
}
export default getAllVisits;