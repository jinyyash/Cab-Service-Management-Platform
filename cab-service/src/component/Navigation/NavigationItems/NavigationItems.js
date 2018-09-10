import React from 'react';
import NavigationItem from '../NavigationItems/NavigationItem/NavigationItem'
import { NavbarNav } from 'mdbreact';

import 'bootstrap/dist/css/bootstrap.min.css'
const navigateItems = () => (
    <NavbarNav right>
          <NavigationItem link="/"  > Contact </NavigationItem>
          <NavigationItem link="/" active >  About</NavigationItem>   
    </NavbarNav>
);
export default navigateItems;