/**
 * Created by Jinadi on 5/3/2018.
 */
import React from 'react';
import Aux from '../../hoc/Aux';
import ToolBar from '../../component/ToolBar/ToolBar'
const layout = (props) => (
    <Aux>
        <ToolBar />
        <main>{props.children} </main>
    </Aux>
);

export default layout;