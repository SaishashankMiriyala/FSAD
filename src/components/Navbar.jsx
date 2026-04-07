import { useNavigate, Link } from "react-router-dom"; 
 
function Navbar() { 
  const navigate = useNavigate(); 
 
  const handleLogout = () => { 
    localStorage.removeItem("userId"); 
    localStorage.removeItem("username"); 
    navigate("/"); 
  }; 
 
  return ( 
    <div> 
      <Link to="/home" style={{ marginRight: "16px" }}>Home</Link> 
      <Link to="/profile" style={{ marginRight: "16px" }}>Profile</Link> 
      <button onClick={handleLogout}>Logout</button> 
    </div> 
  ); 
} 
 
export default Navbar; 