package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户列表
 *
 * @author auto create
 * @since 1.0, 2022-02-23 12:04:15
 */
public class UserDTO extends AlipayObject {

	private static final long serialVersionUID = 1673764723712816261L;

	/**
	 * 用户雇佣编号
	 */
	@ApiField("order_num")
	private String orderNum;

	/**
	 * 域账号
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名,有花名时返回花名,没有则返回真名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 用户工号
	 */
	@ApiField("user_no")
	private String userNo;

	public String getOrderNum() {
		return this.orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNo() {
		return this.userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

}
