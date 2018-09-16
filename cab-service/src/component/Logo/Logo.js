import React from 'react';
import logo from '../../assest/Images/download.png';
import classes from './Logo.css';

const lo = (props) => (
    <div className={classes.Logo} style={{height: props.height}}>
        <img src={logo} alt="Cab" />
    </div>
);

export default lo;