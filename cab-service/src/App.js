import React, { Component } from 'react';
import Layout from './component/Layout/Layout'
import Routers from './containers/Pages/Routers';

class App extends Component {
  
  render() {
    return (
      <div className="grey-text">
        <Layout>
        <Routers/>
        </Layout>
      </div>);
  }
}

export default App;
