import React, { Component } from 'react';
import List from '@material-ui/core/List';
import Divider from '@material-ui/core/Divider';
import ListItemText from '@material-ui/core/ListItemText';
import ListItem from '@material-ui/core/ListItem';
import '../static/Sidebar.css';

class Sidebar extends Component {
    state = {
        links : [
            "Create new list",
            "Show my lists",
            "Edit profile",
            "Logout"
        ],
    }

    render() {
        return(
            <div className='Sidebar'>
                <List>
                    {this.state.links.map((text, index) => (
                        <ListItem button key={text}>
                            <ListItemText primary={text} />
                        </ListItem>
                    ))}
                </List>
                <Divider />
            </div>
        );
    }
}

export default Sidebar;