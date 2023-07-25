import React from "react";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import Home from "../components/pages/Home";
import Company from "../components/pages/Company";
import Contact from "../components/pages/Contact";
import NewProject from "../components/pages/NewProject";
import Container from "../components/layouts/Container";

export default function RouteApp() {
  return (
    <BrowserRouter>
      <React.Fragment>
        <Link to="/">Home</Link>
        <Link to="/company">Company</Link>
        <Link to="/contact">Contact</Link>
        <Link to="/newProject">New Project</Link>
      </React.Fragment>
      <Container>
        <Routes>
          <Route path="/" exact element={<Home />} />
          <Route path="/company" element={<Company />} />
          <Route path="/contact" element={<Contact />} />
          <Route path="/newProject" element={<NewProject />} />
        </Routes>
      </Container>
      <React.Fragment>
        <p>footer</p>
      </React.Fragment>
    </BrowserRouter>
  );
}
