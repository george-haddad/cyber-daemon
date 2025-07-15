import Image from "next/image";

export default function Home() {
  return (
    <div className="grid grid-rows-[20px_1fr_20px] items-center justify-items-center min-h-screen p-8 pb-20 gap-16 sm:p-20 font-[family-name:Arial]">
      <main className="flex flex-col gap-[32px] row-start-2 items-center sm:items-start">
        <Image
          src="/devil.png"
          alt="cyber daemon"
          width={100}
          height={100}
          priority
        />

        <a href="https://www.flaticon.com/free-icons/devil" title="devil icons">
          Devil icons created by Smashicons - Flaticon
        </a>
      </main>
    </div>
  );
}
