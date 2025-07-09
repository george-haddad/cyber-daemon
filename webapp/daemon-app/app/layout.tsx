import type { Metadata } from "next";
import "./globals.css";

export const metadata: Metadata = {
  title: "Le Daemon App",
  description: "A daemon app to be a demon app",
};

export default function RootLayout({
  children,
}: Readonly<{ children: React.ReactNode }>) {
  return (
    <html lang="en">
      <body>{children}</body>
    </html>
  );
}
