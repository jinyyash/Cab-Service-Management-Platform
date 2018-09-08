import React, { Component } from 'react';
import { Button, Form, FormGroup, Label, Input, FormText } from 'reactstrap';
import { Container, Row, Col } from 'reactstrap';




class SignUp extends Component {
    State = {
        name: '',
        email: '',
        phoneNumber: ''
    }
    render() {
        return (
            <div  style="display:none; margin-top:50px">
                <Container>
                    <Row>
                        <Col sm="12" md={{ size: 5, offset: 2 }}> <h4>Sign Up To Ride</h4></Col>
                    </Row>


                    <Form>
                        <Row >
                            <Col sm="12" md={{ size: 8, offset: 2 }}><Input type="name" name="name" id="name" placeholder="type your name" /></Col>
                        </Row>

                        <Input type="email" name="email" id="exampleEmail" placeholder="type your email" />
                        <Input type="username" name="username" id="username" placeholder="type your user name" />
                        <Input type="password" name="password" id="password" placeholder="Enter your password" />
                        <Input type="password" name="re-enter" id="re-enter" placeholder="Enter your password" />
                        <Button>SignUp</Button>
                    </Form>
                </Container>
            </div>

        );
    }

}
export default SignUp;