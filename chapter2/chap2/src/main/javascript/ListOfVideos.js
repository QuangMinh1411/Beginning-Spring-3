import React, {useEffect, useState} from 'react';

const ListOfVideos = () => {
    const [data,setData] = useState([]);
    useEffect(()=>{
        const fetchData = async ()=>{
            const response = await fetch("/api/videos");
            const json = await response.json();
            setData(json)
        }
        fetchData().catch(console.error)

    },[data])
    return (
        <ul>
            {data.map((item,index)=>(
                <li key={index}>
                    {item.name}
                </li>
            ))}
        </ul>


    );
};

export default ListOfVideos;


// import React from "react"
//
// class ListOfVideos extends React.Component {
//     constructor(props) {
//         super(props)
//         this.state = {data: []}
//     }
//
//     async componentDidMount() {
//         let json = await fetch("/api/videos").then(r => r.json())
//         this.setState({data: json})
//     }
//
//     render() {
//         return (
//             <ul>
//                 {this.state.data.map(item =>
//                     <li>
//                         {item.name}
//                     </li>)}
//             </ul>
//         )
//     }
// }
//
// export default ListOfVideos