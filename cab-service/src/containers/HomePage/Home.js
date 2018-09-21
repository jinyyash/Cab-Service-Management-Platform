import React from 'react';
import Aux from '../../hoc/Aux';
import ToolBar from '../../component/ToolBar/Header'

const Home = (props) => (
    <Aux>
        <ToolBar />
        
        <main>{props.children} </main>
    </Aux>
); 

export default Home;