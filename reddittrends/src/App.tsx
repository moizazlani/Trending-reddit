import { Posts, Profile, SharedLayout, Statistics } from "./pages/Dashboard";
import Landing from "./pages/Landing";
import { Login } from "./pages/Login";
import ProtectedRoutes from "./pages/ProtectedRoutes";
import Signup from "./pages/Signup";
import { BrowserRouter, Routes, Route } from "react-router-dom";

export default function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Landing></Landing>}></Route>
        <Route path="login" element={<Login></Login>}></Route>

        <Route path="signup" element={<Signup></Signup>}></Route>

        <Route
          path="/dashboard"
          element={
            <ProtectedRoutes>
              <SharedLayout></SharedLayout>
            </ProtectedRoutes>
          }
        >
          <Route index element={<Posts></Posts>}></Route>

          <Route path="profile" element={<Profile></Profile>}></Route>
          <Route path="statistics" element={<Statistics></Statistics>}></Route>
        </Route>
      </Routes>
    </BrowserRouter>
  );
}
