import React from 'react';
import NavigationItems from '../Navigation/NavigationItems/NavigationItems';
import {  Navbar, NavbarBrand,Collapse} from 'mdbreact';


const toolBar = (props) => (
    <Navbar color="white" expand="md" dark >
        <Collapse navbar>
            <NavbarBrand href="#" className="grey-text">
                LOGO
        </NavbarBrand>
            <NavigationItems />
        </Collapse>
    </Navbar >


);


export default toolBar;