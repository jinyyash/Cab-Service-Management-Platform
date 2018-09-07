import React from 'react';
import {
    Collapse,
    Navbar,
    NavbarToggler,
    NavbarBrand
} from 'reactstrap';

import NavigationItems from '../Navigation/NavigationItems/NavigationItems'

const toolBar = (props) => (
    <div>
        <Navbar color="light" light expand="md">
            <NavbarBrand href="/">logo</NavbarBrand>
            <NavbarToggler onClick={this.toggle} />
            <Collapse  navbar>
                <nav>
                    <NavigationItems />
                </nav>
            </Collapse>
        </Navbar>
    </div>

);


export default toolBar;