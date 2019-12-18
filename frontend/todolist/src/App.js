import React from 'react';
import './App.css';
import BaseRouter from './routes.js';
import { BrowserRouter as Router } from 'react-router-dom';
import Sidebar from './components/Sidebar.js';

function App() {
  return (
    <div className="App">
      <Router>
        <body>
          <Sidebar />
          <BaseRouter />
        </body>
      </Router>
    </div>
  );
}

export default App;
