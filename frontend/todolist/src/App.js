import React from 'react';
import './App.css';
import BaseRouter from './routes.js';
import { BrowserRouter as Router } from 'react-router-dom';

function App() {
  return (
    <div className="App">
      <Router>
        <body>
          <BaseRouter />
        </body>
      </Router>
    </div>
  );
}

export default App;
