package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 婉鑫测试
 *
 * @author auto create
 * @since 1.0, 2025-11-06 18:23:43
 */
public class AlipayOpenWanxintestwxQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6324667677159481196L;

	/**
	 * 测试
	 */
	@ApiField("age")
	private String age;

	/**
	 * 测试 当前字段已废弃(111111)
	 */
	@ApiField("op")
	@Deprecated
	private String op;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 测试
	 */
	@ApiField("test")
	private String test;

	/**
	 * 测试
	 */
	@ApiField("ty")
	private String ty;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getOp() {
		return this.op;
	}
	public void setOp(String op) {
		this.op = op;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}

	public String getTy() {
		return this.ty;
	}
	public void setTy(String ty) {
		this.ty = ty;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
