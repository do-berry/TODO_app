import React from 'react';
import { Route } from 'react-router-dom';
import List from './components/List.js';
import Login from './components/Login.js';

const BaseRouter = () => (
    <div>
        <Route exact path='/' />
        <Route exact path='/list/all' component={List} />
        <Route exact path='/login' component={Login} />
    </div>
);

export default BaseRouter;