/**
 * Created by Jinadi on 5/3/2018.
 */
import React from 'react';
import Aux from '../../hoc/Aux';
import Header from '../ToolBar/Header';
import SideDrawer from '../Navigation/SideDrawer/Sidedrawer'
const layout = (props) => (
    <Aux>
        <main>{props.children} </main>
    </Aux>
);

export default layout;