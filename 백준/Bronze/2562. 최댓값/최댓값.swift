import Foundation

var numbers: [Int] = []
for _ in 0..<9 {
    numbers.append(Int(readLine()!)!)
}
let max = numbers.max()!
let indexofnumber = numbers.firstIndex(of: max)! + 1
print("\(max)" + "\n" + "\(indexofnumber)")