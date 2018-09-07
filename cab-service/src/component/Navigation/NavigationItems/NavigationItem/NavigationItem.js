import React from 'react';
import { NavLink, NavItem } from 'reactstrap';
const navigateItem = (props) => (
    <NavItem>
        <NavLink href={props.link}> {props.children}</NavLink>
    </NavItem>

);
export default navigateItem;