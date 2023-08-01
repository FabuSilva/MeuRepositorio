import style from "./InputComponent.module.css";
export default function InputComponent({
  type,
  text,
  name,
  placeholder,
  handleOnChange,
  value,
}) {
  return (
    <div className={style.control}>
      <label htmlFor={name}>{text}</label>
      <input
        type={type}
        name={name}
        id={name}
        placeholder={placeholder}
        onChange={handleOnChange}
        value={value}
      />
    </div>
  );
}
