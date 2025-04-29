import React, { ReactNode } from "react";

type ProtectedRoutesProps = {
  children: ReactNode;
};

const ProtectedRoutes: React.FC<ProtectedRoutesProps> = ({ children }) => {
  return <div>{children}</div>;
};

export default ProtectedRoutes;