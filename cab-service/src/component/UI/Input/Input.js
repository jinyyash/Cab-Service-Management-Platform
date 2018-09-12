import React from 'react';
import { Input, Textarea, Label } from 'mdbreact';
import classes from './Input.css';

const inputs = (props) => {
    let inputElement = null;
    const inputClasses = [classes.InputElement];
    if (props.invalid && props.shouldValidate && props.touched) {
        inputClasses.push(classes.Invalid);
    }

    switch (props.elementType) {
        case ('input'):
            console.log('case start');
            console.log({...props.elementConfig});
            inputElement = <input
               class="form-control mb-4"
                {...props.elementConfig}
                value={props.value}
                onChange={props.changed}
            />;
            console.log('case end');

            break;
        case ('textarea'):
            inputElement = <Textarea
                className={inputClasses.join(' ')}
                {...props.elementConfig}
                value={props.value}
                onChange={props.changed}
            />;
            break;
        default:
            inputElement = <Input
                className={inputClasses.join(' ')}
                {...props.elementConfig}
                value={props.value}
                onChange={props.changed}
            />;
    }

    return (
        <div className={classes.Input}>
            <label className={classes.Label}>{props.label}</label>
            {inputElement}
        </div>
    );

};

export default inputs;