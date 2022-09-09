import React from "react";

const OutputComponent = ({ driver, conductor }) => {
  return (
    <div>
      <p> {parseInt(driver) + parseInt(conductor)}</p>
    </div>
  );
};

export default OutputComponent;
