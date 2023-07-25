package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部联系人
 *
 * @author auto create
 * @since 1.0, 2020-11-17 09:43:15
 */
public class ExternalContact extends AlipayObject {

	private static final long serialVersionUID = 7196957567629499332L;

	/**
	 * 邮箱地址
	 */
	@ApiField("email")
	private String email;

	/**
	 * 支付宝侧外部联系人的主键
	 */
	@ApiField("id")
	private String id;

	/**
	 * 工作时间段/工作性质等
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
