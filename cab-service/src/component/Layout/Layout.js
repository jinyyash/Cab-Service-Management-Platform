/**
 * Created by Jinadi on 5/3/2018.
 */
import React from 'react';
import Aux from '../../hoc/Aux';
import ToolBar from '../../component/ToolBar/ToolBar'
import SideDrawer from '../Navigation/SideDrawer/Sidedrawer'
const layout = (props) => (
    <Aux>
        <ToolBar />
        <SideDrawer/>
    
        <main>{props.children} </main>
    </Aux>
);

export default layout;