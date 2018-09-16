import React from 'react';
import silver from './silver.png';
import {pack,center} from './package.css';


const Choose = () => (
    <div className="pack">
        
        <img src={silver} width="100" height="100" />
        
        <pre className="grey-text"> Affordable car for family <br/> trips and travel purposes</pre>
        <h1 className="grey-text">Silver </h1>
        
    </div>
        
); 

export default Choose;