import React from 'react';
import NavigationItem from '../NavigationItems/NavigationItem/NavigationItem'
import { NavbarNav} from 'mdbreact';
import myButton from './button.css';


import 'bootstrap/dist/css/bootstrap.min.css'
const navigateLanding = () => (
    <NavbarNav right>
          <NavigationItem link="/"  > Contact </NavigationItem>
          <NavigationItem link="/" active >  About</NavigationItem>   
          <NavigationItem link="/signup" active > <a className="myButton" ><font color="fb494d">Sign up  </font></a></NavigationItem> 
          <NavigationItem link="/login" active > <a className="myButton2" ><font color="ffffff">Log in  </font></a></NavigationItem> 
          
    </NavbarNav>

);
export default navigateLanding;