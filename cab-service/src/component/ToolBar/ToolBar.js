import React from 'react';
import NavigationItems from '../Navigation/NavigationItems/NavigationItems';
import {  Navbar, NavbarBrand,Collapse} from 'mdbreact';
import DrawerToggle from '../Navigation/SideDrawer/DraweToggle/DrawerToggle';

const toolBar = (props) => (
     this.state = {
            collapse: false,
        };
    <Navbar color="white" expand="md"   fixed="right">
        <Collapse isOpen = { this.state.collapse } navbar>
        <DrawerToggle clicked={props.drawerToggleClicked} />
        
            <NavbarBrand href="#" className="grey-text">
                LOGO
        </NavbarBrand>
            <NavigationItems />
        </Collapse>
    </Navbar >


);


export default toolBar;