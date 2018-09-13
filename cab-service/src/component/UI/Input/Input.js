import React from 'react';
import { Input, Textarea, Label } from 'mdbreact';
import classes from 'mdbreact/dist/css/mdb.css';

const inputs = (props) => {
    let inputElement = null;
    const inputClasses = [classes.form];
    if (props.invalid && props.shouldValidate && props.touched) {
        inputClasses.push(classes.Invalid);
    }

    switch (props.elementType) {
        case ('input'):
            if (props.invalid && props.shouldValidate && props.touched) {
                inputElement = <input
                    class="form-control mb-2 is-invalid"
                    {...props.elementConfig}
                    value={props.value}
                    onChange={props.changed}
                />;
            } else {
                inputElement = <input
                    class="form-control mb-2"
                    {...props.elementConfig}
                    value={props.value}
                    onChange={props.changed}
                />;
            }
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