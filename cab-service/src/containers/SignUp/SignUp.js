import React, { Component } from 'react';
import { Container, Row, Col, Input, Button, Card, CardBody } from 'mdbreact';
import classes from './SignUp.css';
import Center from 'react-center';

class SignUp extends Component {
    State = {
        name: '',
        email: '',
        phoneNumber: ''
    }
    render() {
        return (

            <div style={{padding: '50px 30px 30px 75px' ,    marginLeft:' 300px'
        }}>
              
                    <Container   >

                        <Row>
                            <Col md="6">
                                <Card >
                                    <CardBody>
                                        <form>
                                            <h5 className="h4 text-center py-4" >Sign Up to Ride</h5>
                                           <Center><h4>Safe, reliable rides in minutes</h4></Center> 
                                            <div className="grey-text">
                                                <Input label="Your name" icon="user" group type="text" validate error="wrong" success="right" />
                                                <Input label="Your email" icon="envelope" group type="email" validate error="wrong" success="right" />
                                                <Input label="Your Phone Number" icon="exclamation-triangle" group type="text" validate error="wrong" success="right" />
                                                <Input label="Your password" icon="lock" group type="password" validate />
                                            </div>
                                            <div className="text-center py-4 mt-3">
                                                <Button color="red" type="submit">Register</Button>
                                            </div>
                                        </form>
                                    </CardBody>
                                </Card>
                            </Col>
                        </Row>

                    </Container>
                
            </div>




        );
    }
}






export default SignUp;