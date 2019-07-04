var {add} = require('./model01.js');
var Vue = require('./vue.min');
var VM = new Vue({
			el: '#app', // vm接管了app区域的管理 
			data: {
				list: [1, 2, 3, 4, 5],
				user: {
					name: 'itcast',
					age: '10'
				},
				userlist: [{
						user: {
							name: 'itcast',
							age: '10'
						}
					},
					{
						user: {
							name: 'itheima',
							age: '11'
						}
					},
				]
			},
		})