/**
 * Created by Jinadi on 5/3/2018.
 */
import React from 'react';
import Aux from '../../hoc/Aux';
import ToolBar from '../../component/ToolBar/ToolBar'
import SignUp from '../../containers/SignUp/SignUp';
import Login from '../../containers/Login/Login';
import Sidebar from '../Sidebar/Sidebar';
const layout = (props) => (
    <Aux>
        <ToolBar />
     <Sidebar/>
      
        <main>{props.children} </main>
    </Aux>
);

export default layout;