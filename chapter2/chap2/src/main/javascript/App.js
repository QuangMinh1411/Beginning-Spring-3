import React from 'react';
import NewVideo from "./NewVideo";
import ListOfVideos from "./ListOfVideos";
const App = () => {
    return (
        <div>
            <ListOfVideos />
            <NewVideo />
        </div>
    );
};

export default App;