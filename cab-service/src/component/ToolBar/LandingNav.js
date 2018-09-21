import React from 'react';
import NavigateLanding from '../Navigation/NavigationItems/LandingHeader';
import {  Navbar, NavbarBrand,Collapse} from 'mdbreact';
import logo from '../../Images/logo.png'


const Bar = (props) => (
    <Navbar color="white" expand="md" dark >
        <Collapse navbar>
            <NavbarBrand href="#" className="grey-text">
                
                <img src={logo} width="50" height="35"/>
                
        </NavbarBrand>
            <NavigateLanding />
        </Collapse>
    </Navbar >


);


export default Bar;