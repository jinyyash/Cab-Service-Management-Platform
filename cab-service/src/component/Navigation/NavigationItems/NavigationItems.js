import React from 'react';
import NavigationItem from '../NavigationItems/NavigationItem/NavigationItem'
import { NavbarNav} from 'mdbreact';
import myButton from './button.css';


import 'bootstrap/dist/css/bootstrap.min.css'
const navigateItems = () => (
    <NavbarNav right>
          <NavigationItem link="/"  > Contact </NavigationItem>
          <NavigationItem link="/" active >  About</NavigationItem>   
          <NavigationItem link="/" active > <a className="myButton" ><font color="fb494d">Logout  </font></a></NavigationItem> 
          
          
    </NavbarNav>

);
export default navigateItems;