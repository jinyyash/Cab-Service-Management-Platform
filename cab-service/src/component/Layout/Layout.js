/**
 * Created by Jinadi on 5/3/2018.
 */
import React from 'react';
import Aux from '../../hoc/Aux';
import ToolBar from '../../component/ToolBar/ToolBar'
import SignUp from '../../containers/SignUp/SignUp';
const layout = (props) => (
    <Aux>
        <ToolBar />
        <SignUp/>
        <main>{props.children} </main>
    </Aux>
);

export default layout;