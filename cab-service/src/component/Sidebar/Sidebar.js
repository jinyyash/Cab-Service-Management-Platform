import React from 'react';
import SidebarItems from '../Navigation/SidebarIn/SidebarItems';
import { Collapse, Navbar, NavbarToggler, NavbarBrand, Nav, NavItem, NavLink, Button } from 'reactstrap';


const sideBar = (props) => (
    <div class="container-fluid">
    <div class="row">
        <div className="col-sm-3 col-md-2 sidebar">
      <SidebarItems/>
      </div>
            <div className="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                <h1 class="page-header">Dashboard</h1>
                
            </div>
        </div>
    </div>
    



);


export default sideBar;