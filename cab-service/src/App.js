import React, { Component } from 'react';
import Layout from './component/Layout/Layout'
import { Route, Switch } from 'react-router-dom';
import Login from '../src/containers/Login/Login';
import SignUp from '../src/containers/SignUp/SignUp';

class App extends Component {
 /* async componentDidMount() {
    const response = await fetch('/api/customer');
    const body = await response.json();
   // this.setState({ groups: body, isLoading: false });
  }*/
  render() {
    return (
      <div >
        <Layout>
        <Switch>
            <Route path="/login" component={Login} />
            <Route path="/signup" component={SignUp} />
         
          </Switch>
        </Layout>
      </div>);
  }
}

export default App;
