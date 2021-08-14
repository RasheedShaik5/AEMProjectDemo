import React, {Component} from 'react';
import {MapTo} from '@adobe/aem-react-editable-components';

export const CustomEditConfig = {

    emptyLabel: 'My_Custom',

    isEmpty: function(props) {
        return !props || !props.text || props.text.trim().length < 1;
    }
};

export default class Custom extends Component {

    render() {
        if(CustomEditConfig.isEmpty(this.props)) {
            return null;
        }

        return (
            <div class="CustomComponent">
                <h2 class="CustomComponent__text">{this.props.text}</h2>
            </div>
        );
    }
}

MapTo('apps/wknd-spa-react/components/my-component')(Custom, CustomEditConfig);
