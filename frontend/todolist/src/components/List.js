import React, { Component } from 'react';
import axios from 'axios';
import '../static/List.css'

class List extends Component {
    state = {
        data: [],
    }

    componentDidMount() {
        axios.get('http://localhost:8080/list/all')
            .then(res => {
                this.setState({
                    data: res.data
                });
                console.log(res.data);
            })
    }

    render() {
        return(
            <div>
                <ul class='Lists'>
                    { this.state.data.map((item) => <li class='List'><h1 class='Name'>{item.name}</h1></li>) }
                </ul>
            </div>
        );
    }
}

export default List;