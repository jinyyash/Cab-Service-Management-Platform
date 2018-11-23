import React from 'react';
import { Route, Switch } from 'react-router-dom';
import SignUpPage from './../SignUp/SignUp';
import LoginPage from './../Login/Login';
import LandingPage from '../../containers/Landing/LandingPage';
import HomePage from '../HomePage/Home';
import DriverPage from '../Driver/DriverHome';
class Routes extends React.Component {
  render() {
    return (
      <Switch>
         <Route path='/' exact component={LandingPage} />
        <Route path='/signup' component={SignUpPage} />
        <Route path='/login' component={LoginPage} />
        <Route path='/home' component={HomePage} />
        <Route path='/driver' component={DriverPage} />

      </Switch>
    );
  }
}
export default Routes;

