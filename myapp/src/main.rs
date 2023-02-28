fn main() {
    println!("Hello, world!");
    let gil = person{name: "Gil".to_string(), age: 12};
    print!("{}", gil);
}

pub struct person{
    name: String,
    age: i32
}