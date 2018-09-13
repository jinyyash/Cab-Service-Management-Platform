import React, { Component } from 'react';
import { Container, Row, Col, Button, Card, CardBody } from 'mdbreact';
import Input from '../../component/UI/Input/Input'

class SignUp extends Component {
    state = {
        signupForm: {
            name: {
                elementType: 'input',
                elementConfig: {
                    type: 'text',
                    placeholder: 'Your Name'

                },

                value: '',
                validation: {
                    required: true
                    
                },
                valid: false,
                touched: false

            },
            phone: {
                elementType: 'input',
                elementConfig: {
                    type: 'text',
                    placeholder: 'Your Phone Number'

                },

                value: '',
                validation: {
                    required: true,
                    minLength: 10,
                    maxLength: 10,
                    isNumeric: true
                },
                valid: false,
                touched: false

            },
            email: {
                elementType: 'input',
                elementConfig: {
                    type: 'email',
                    placeholder: 'Your E-Mail'

                },

                value: '',
                validation: {
                    required: true,
                    isEmail: true
                },
                valid: false,
                touched: false

            },
            password: {
                elementType: 'input',
                elementConfig: {
                    type: 'password',
                    placeholder: 'Your Password'

                },
                value: '',
                validation: {
                    required: true
                },
                valid: false,
                touched: false

            },
            reEnterPassword: {
                elementType: 'input',
                elementConfig: {
                    type: 'password',
                    placeholder: 'Re-Enter Your Password'

                },
                value: '',
                validation: {
                    required: true
                },
                valid: false,
                touched: false

            },



        },
        formIsValid: false,
        loading: false
    }
    checkValidity(value, rules) {
        let isValid = true;
        if (!rules) {
            return true;
        }

        if (rules.required) {
            isValid = value.trim() !== '' && isValid;
        }

        if (rules.minLength) {
            isValid = value.length >= rules.minLength && isValid
        }

        if (rules.maxLength) {
            isValid = value.length <= rules.maxLength && isValid
        }

        if (rules.isEmail) {
            const pattern = /[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?/;
            isValid = pattern.test(value) && isValid
        }

        if (rules.isNumeric) {
            const pattern = /^\d+$/;
            isValid = pattern.test(value) && isValid
        }

        return isValid;
    }
    inputChangedHandler = (event, inputIdentifier) => {
        const updatedForm = {
            ...this.state.signupForm
        };
        const updatedFormElement = {
            ...updatedForm[inputIdentifier]
        };
        updatedFormElement.value = event.target.value;
        console.log(updatedFormElement);
        updatedFormElement.valid = this.checkValidity(updatedFormElement.value, updatedFormElement.validation);
        updatedFormElement.touched = true;
        updatedForm[inputIdentifier] = updatedFormElement;

        let formIsValid = true;
        for (let inputIdentifier in updatedForm) {
            formIsValid = updatedForm[inputIdentifier].valid && formIsValid;
        }
        this.setState({ signupForm: updatedForm, formIsValid: formIsValid });
    }
    render() {
        const formElementsArray = [];
        for (let key in this.state.signupForm) {
            formElementsArray.push({
                id: key,
                config: this.state.signupForm[key]
            })
        }
        let form = (
            <form class="text-center">

                {formElementsArray.map(formElement => (
                    <Input
                        key={formElement.id}
                        elementType={formElement.config.elementType}
                        elementConfig={formElement.config.elementConfig}
                        value={formElement.config.value}
                        invalid={!formElement.config.valid}
                        shouldValidate={formElement.config.validation}
                        touched={formElement.config.touched}
                        changed={(event) => this.inputChangedHandler(event, formElement.id)}
                    />
                ))}
                <div className="text-center my-4">
                    <button class="btn btn-danger btn-block my-4" type="submit">Sign Up</button>
                </div>
                <div className="text-center my-4">
                    <h6>Already Member?
        <a href="">SignIn</a>
                    </h6>

                </div>


            </form>

        );



        return (
            <div style={{ padding: '80px 30px 30px 75px', marginLeft: ' 400px' }}>
                <Container   >
                    <Row>
                        <Col md="5">
                            <Card >
                                <CardBody>
                                    <h5 className="h4 text-center py-4" >Sign Up To Ride</h5>

                                    {form}


                                </CardBody>
                            </Card>
                        </Col>
                    </Row>
                </Container>
            </div >
        );
    }
}






export default SignUp;