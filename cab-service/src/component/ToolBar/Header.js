import React from 'react';
import NavigationItems from '../Navigation/NavigationItems/NavigationItems';
import {  Navbar, NavbarBrand,Collapse} from 'mdbreact';
import logo from '../../Images/logo.png'


const toolBar = (props) => (
    <Navbar color="white" expand="md" dark >
        <Collapse navbar>
            <NavbarBrand href="#" className="grey-text">
            <img src={logo} width="50" height="35"/>
        </NavbarBrand>
            <NavigationItems />
        </Collapse>
    </Navbar >


);


export default toolBar;