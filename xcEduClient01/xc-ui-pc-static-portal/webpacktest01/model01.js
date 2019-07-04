// 定义add函数
function add(x, y) {
	return x + y
}
// function add2(x, y) {
// return x + y+1
// }
// 导出add方法
module.exports.add = add;
// module.exports ={add,add2};//如果有多个方法这样导出
// module.exports.add2 = add2//如果有多个方法也可以这样导出