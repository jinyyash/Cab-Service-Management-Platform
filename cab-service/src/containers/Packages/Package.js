import React from 'react';
import {pack,font,heading,cen,tag} from './package.css';


const Choose = (props) => (
    <div className="pack">
        <pre className="tag">{props.price} </pre>
        <img src={props.image} width="100" height="100" className="cen"/>
        
        <pre className="font"><font color="#91A4A3"> Affordable car for family <br/> trips and travel purposes</font></pre>
        <h1 className="heading"><font color="#91A4A3">{props.heading} </font></h1>
        
        
        
        
    </div>
        
); 

export default Choose;