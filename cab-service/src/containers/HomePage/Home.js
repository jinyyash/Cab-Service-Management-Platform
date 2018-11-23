import React from 'react';
import Aux from '../../hoc/Aux';
import ToolBar from '../../component/ToolBar/Header';
import photo from '../../Images/home.png'
import {textx,rowx,bigPackx,cenx,rightx,upx,leftx,lastx,texx,imgLeftx,inputLeftx,bookx,pls} from './home.css';
import Pack from '../Packages/Package';
import silver from '../../Images/silver.png';
import gold from '../../Images/Gold.png';
import platinum from '../../Images/platinum.png';

const Home = (props) => (
    <Aux>
        <ToolBar />
        <div align="leftx">
        
        <img src={photo} height="100%" width="55%"/>
        
        <div className="bigPackx" >
            <h1 className="cenx"><font color="#91a4a3"> Hi! </font></h1>
            <pre className="cenx"><font color="#91a4a3"> Select Your Preferences </font></pre>
            <Pack heading="Platinum" image={platinum} price="50$ Per Day"/>
            <Pack heading="Gold" image={gold} price="25$ Per Day"/>
            <Pack heading="Silver" image={silver} price="12$ Per Day"/>
        
        
            <div>
        
                <pre className="lefx"><font color="#91a4a3">    Pickup Date                                 End Date                                       Pickup Location</font></pre>
            </div>
            <div className="inputLeftx">
                
                <font color="#91a4a3"><input className="rightx" STYLE="color: #91a4a3" type="date" name="pickupdate"/></font>
                <font color="#91a4a3"><input className="rightx" STYLE="color: #91a4a3"  type="date" name="enddate"/></font> 
                <font color="#91a4a3"><input className="rightx" STYLE="color: #91a4a3" type="text" name="location"/></font> 
         
            </div>
                
            <div>
                
                <button className="bookx"> Book Now </button>
                
               
                
            </div>
            
            </div>
        </div>
       
        
        <main>{props.children} </main>
    </Aux>
); 

export default Home;