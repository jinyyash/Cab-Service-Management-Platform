import React from 'react';
import { Switch, Route } from 'react-router-dom';
import {  NavItem, NavLink } from 'reactstrap';


const sidebarItem = ( props ) => (
    <li >
        <a 
            href={props.link}
            exact={props.exact}
            >{props.children}</a>
            
    </li>
);
export default sidebarItem;