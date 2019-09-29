import React, { Component } from 'react';
import './css/cunyboard.css';



class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      classes : [],
      student : ""
    }
  }

  render() {

    return (
        <body>
          <form id="form_login">
            <div className="container">
                <h1>CUNYBoard Sign in</h1>
                <p>Please fill in this form to create an account.</p>
                <hr />
                <div className="form-group">
                  <label for="email"><b>Email</b></label>
                  <input type="text" placeholder="ex johndoe@gmail.com" name="email" required />
                </div>
                <div className="form-group">
                  <label for="psw"><b>Password</b></label>
                  <input type="password" placeholder="password123" name="psw" required />
                </div>
                <label>
                  <input type="checkbox" checked="checked" name="remember" /> Remember me
                </label>    
                <div className="clearfix">
                  <button type="submit" className="signupbtn"> Sign in</button>
                </div>
                <div>
                  <a href="./sign-in.html"><button>Go To Sign Up</button></a>
                </div>
              </div>
          </form>
        </body>
      );


  }



}
export default App;
