package com.zzh.gogo.apiController;

import com.baomidou.mybatisplus.plugins.Page;
import com.zzh.gogo.entity.User;
import com.zzh.gogo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags={"用户操作接口"})
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private IUserService userService;


    @ApiOperation(value = "获取用户列表", notes = "获取所有的用户")
    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public Object getUserList() {
        Page<User> r = userService.selectPage(new Page<User>(0, 12));
        return r;
    }

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Object addUser(@RequestBody User user) {
        return userService.insert(user);
    }

    @ApiOperation(value = "获取用户", notes = "根据id来获取用户")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "String", paramType = "query")
    @RequestMapping(value = "/findUserById", method = RequestMethod.GET)
    public Object getUser(String id) {
        return userService.selectById(id);
    }

    @ApiOperation(value = "更新用户", notes = "根据User对象更新用户")
    @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "String")
    @RequestMapping(value = "/updateUserById", method = RequestMethod.GET)
    public Object updateUser(@RequestBody User user) {
        return userService.updateById(user);
    }

    @ApiOperation(value = "删除用户", notes = "根据id删除用户")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "String", paramType = "query")
    @RequestMapping(value = "/deleteUserById", method = RequestMethod.GET)
    public Object deleteUser(String id) {
        return userService.deleteById(id);
    }


    @ApiOperation(value = "分页", notes = "根据分页参数")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "current", value = "页号", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "size",    value = "页长", required = true, dataType = "String", paramType = "query")
    })
    @PostMapping("/findUserByPage")
    public Page<User> test(Integer current, Integer size) {
        return userService.selectPage(new Page<User>(current, size));
    }
//
//	/**
//	 * AR 部分测试
//	 */
//	@GetMapping("/test1")
//	public Page<User> test1() {
//		User user = new User("testAr", 0, 1);
//		System.err.println("删除所有：" + user.delete(null));
//		user.setRole(111L);
//		user.setTestDate(new Date());
//		user.setPhone("13111110000");
//		user.insert();
//		System.err.println("查询插入结果：" + user.selectById().toString());
//		user.setName("mybatis-plus-ar");
//		System.err.println("更新：" + user.updateById());
//		return user.selectPage(new Page<User>(0, 12), null);
//	}
//
//	/**
//	 * 增删改查 CRUD
//	 */
//	@GetMapping("/test2")
//	public User test2() {
//		System.err.println("删除一条数据：" + userService.deleteById(1L));
//		System.err.println("deleteAll：" + userService.deleteAll());
//		System.err.println("插入一条数据：" + userService.insert(new User(1L, "张三", 17, 1)));
//		User user = new User("张三", 17, 1);
//		boolean result = userService.insert(user);
//		// 自动回写的ID
//		Long id = user.getId();
//		System.err.println("插入一条数据：" + result + ", 插入信息：" + user.toString());
//		System.err.println("查询：" + userService.selectById(id).toString());
//		System.err.println("更新一条数据：" + userService.updateById(new User(1L, "三毛", 18, 2)));
//		for(int i=0;i<5;++i){
//			userService.insert(new User(Long.valueOf(100+i), "张三"+i, 17+i, 1));
//		}
//		Page<User> userListPage = userService.selectPage(new Page<User>(1,5), new EntityWrapper<>(new User()));
//		System.err.println("total="+userListPage.getTotal()+", current list size="+userListPage.getRecords().size());
//		return userService.selectById(1L);
//	}
//
//	/**
//	 * 插入 OR 修改
//	 */
//	@GetMapping("/test3")
//	public User test3() {
//		userService.insertOrUpdate(new User(1L, "王五", 19, 3));
//		return userService.selectById(1L);
//	}
//
//	@GetMapping("/add")
//	public Object addUser(){
//		User user = new User("张三", 17, 1);
//		JSONObject result = new JSONObject();
//		result.put("result", userService.insert(user));
//		return result;
//	}
//
//	@GetMapping("/selectsql")
//	public Object getUserBySql() {
//		JSONObject result = new JSONObject();
//		result.put("records", userService.selectListBySQL());
//		return result;
//	}
//
//	@GetMapping("/inff")
//	public Object addfUser(){
//		User user = new User("张三", 17, 1);
//		return user;
//	}

}
