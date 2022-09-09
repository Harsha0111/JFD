import React, { useState } from "react";
import MiddleComponent from "./MiddleComponent";

const InputComponent = ({ driver, getBus }) => {
  const [busOne, setBusOne] = useState("");
  return (
    <>
      <div>
        <input
          type={"text"}
          value={driver}
          onChange={(event) => getBus(event.target.value)}
        />
        <MiddleComponent
          conductor={busOne}
          getCar={setBusOne}
          driver={driver}
        />
      </div>
    </>
  );
};

export default InputComponent;
