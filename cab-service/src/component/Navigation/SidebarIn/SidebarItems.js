import React from 'react';
import {  Nav } from 'reactstrap';
import SidebarItem from './SidebarItem/SidebarItem';

const sidebarItems = () => (
    <ul className="nav nav-sidebar" color="black">
        <SidebarItem link="/"  > Contact </SidebarItem>
        <SidebarItem link="/" active >  About</SidebarItem>
        <SidebarItem link="/"  > Contact </SidebarItem>
        <SidebarItem link="/"  > Contact </SidebarItem>
    </ul >
);

export default sidebarItems;