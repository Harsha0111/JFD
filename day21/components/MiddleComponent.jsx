import React from "react";
import OutputComponent from "./OutputComponent";

const MiddleComponent = ({ conductor, getCar, driver }) => {
  return (
    <div>
      <input
        type={"text"}
        value={conductor}
        onChange={(event) => getCar(event.target.value)}
      />
      <OutputComponent driver={driver} conductor={conductor} />
    </div>
  );
};

export default MiddleComponent;
