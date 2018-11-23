import React from 'react';
import ToolBar from '../../component/ToolBar/Header';
import Bar from '../../component/ToolBar/LandingNav';
import Landing from '../../Images/landing.jpg';

const LandingPage = () => (

    <div>
        <Bar />
        <img src={Landing} width="100%" height="100%"/>

    </div>

);


export default LandingPage;