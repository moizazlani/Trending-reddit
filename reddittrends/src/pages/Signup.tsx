import React from "react";
import { GalleryVerticalEnd } from "lucide-react";
import { LoginForm } from "@/components/login-form";

function Signup() {
  return (
    <div>
      <div className="flex min-h-svh flex-col items-center justify-center gap-6 bg-muted p-6 md:p-10">
        <div className="flex w-full max-w-sm flex-col gap-6">
          <LoginForm />
        </div>
      </div>
    </div>
  );
}

export default Signup;
