import React from 'react';
import { Route } from 'react-router-dom';
import List from './components/List.js'

const BaseRouter = () => (
    <div>
        <Route exact path='/' />
        <Route exact path='/list/all' component={List} />
    </div>
);

export default BaseRouter;