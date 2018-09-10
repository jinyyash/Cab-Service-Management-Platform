import React from 'react';
import { NavItem,NavLink } from 'mdbreact';


const navigateItem = (props) => (
    /*   <li className='nav-item ' style={{ marginRight: '20px' }}>
           <a href={props.link}>
   
           </a>*/
    <NavItem active>
        <a className="nav-link" href={props.link} className="grey-text"> {props.children}</a>
    </NavItem>
    // </li>

);
export default navigateItem;