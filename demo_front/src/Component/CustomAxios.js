import axios from 'axios';

export const CustomAxios = async ({ methodType, backendURL, fetchData, onResponse }) => {
    const URL = process.env.REACT_APP_SPRING_SERVER + backendURL;
    const timeout = 5000;
    
    const headers = {
        'Content-Type': 'application/json',
        'Authorization': sessionStorage.getItem('token')
    };

    try {
        let response;
        switch (methodType.toUpperCase()) {
            case "GET":
                response = await axios.get(URL, { headers, timeout });
                break;
            case "POST":
                response = await axios.post(URL, fetchData, { headers, timeout });
                break;
            case "PUT":
                response = await axios.put(URL, fetchData, { headers, timeout });
                break;
            case "DELETE":
                response = await axios.delete(URL, { headers, timeout });
                break;
            default:
                throw new Error("method type error");
        }
        
        if (onResponse) {
            onResponse(response.data, response.headers);
        }
        return response.data;
    } catch (error) {
        // console.error(error.message+"::"+error.response.data);
        throw error;
    }
};