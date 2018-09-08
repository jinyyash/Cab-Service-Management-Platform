import React from 'react';
import { Nav } from 'reactstrap';
import NavigationItem from '../NavigationItems/NavigationItem/NavigationItem'

const navigateItems = () => (

    <Nav>
        <NavigationItem link="/"  color="light"> Login </NavigationItem>
        <NavigationItem link="/" active>  ...</NavigationItem>

    </Nav>
);
export default navigateItems;