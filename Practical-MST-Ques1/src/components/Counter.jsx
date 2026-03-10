import {useState} from 'react';

function Counter() {
    const [count, setCount] = useState(0);

    const increment = () => {
        setCount(count + 1);
    };  
    const decrement = () => {
        setCount(count - 1);
    };

    return (
        <div style={{ textAlign: 'center', marginTop: '390px', fontSize: '24px', justifyContent: "center",alignItems: "center",height: "100vh",flexDirection: "column" }}>
            <h1>Counter: {count}</h1>
            <button onClick={increment} >Increment</button  >
            <button onClick={decrement}>Decrement</button>
        </div>
    );
}
export default Counter;
