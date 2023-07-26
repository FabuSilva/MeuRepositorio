import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Home from "../components/pages/Home";
import Company from "../components/pages/Company";
import Contact from "../components/pages/Contact";
import NewProject from "../components/pages/NewProject";
import Container from "../components/layouts/Container";
import Navbar from "../components/layouts/Navbar";
import Footer from "../components/layouts/Footer";
import Project from "../components/pages/Project";

export default function RouteApp() {
  return (
    <Router>
      <Navbar />
      <Container>
        <Routes>
          <Route path="/" exact element={<Home />} />
          <Route path="/company" element={<Company />} />
          <Route path="/contact" element={<Contact />} />
          <Route path="/newProject" element={<NewProject />} />
          <Route path="/project" element={<Project />} />
        </Routes>
      </Container>
      <Footer />
    </Router>
  );
}
