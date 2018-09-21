import React from 'react';
import Aux from '../../hoc/Aux';
import ToolBar from '../../component/ToolBar/Header';
import {button,button2,sliderround,switches,font,packed} from './DriverHome.css';
import {switch_input,toggle__off,toggle__on,switch_label} from './button.css';


const DriverHome = () => (
    <Aux>

        <ToolBar />

        <div className="packed">
            <pre className="font"><font color="#91a4a3">Status</font></pre>
            <font color="#91a4a3">  Online </font> <input type="checkbox" id="id-name--1" name="set-name" className="switch_input" />
	<label for="id-name--1" className="switch_label"> 
    <span className="toggle__off"></span></label>
        </div>

            
        
        <div>
            <button className="button">Vehicle Details </button>
            <button className="button2">Payment Details </button>
        </div>
        

    </Aux>
    

);

export default DriverHome;