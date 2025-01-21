package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 1cv
 *
 * @author auto create
 * @since 1.0, 2023-10-11 20:09:23
 */
public class AlipayBossSWsstestAddModel extends AlipayObject {

	private static final long serialVersionUID = 7479528572935326938L;

	/**
	 * 1
	 */
	@ApiField("address")
	private ManjiangTestComplexOneData address;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1
	 */
	@ApiField("sss")
	private String sss;

	/**
	 * 1
	 */
	@ApiField("sssdsds")
	private Long sssdsds;

	/**
	 * 1
	 */
	@ApiField("test_2")
	private ParamValidateTest test2;

	/**
	 * 1
	 */
	@ApiField("type")
	private String type;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public ManjiangTestComplexOneData getAddress() {
		return this.address;
	}
	public void setAddress(ManjiangTestComplexOneData address) {
		this.address = address;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSss() {
		return this.sss;
	}
	public void setSss(String sss) {
		this.sss = sss;
	}

	public Long getSssdsds() {
		return this.sssdsds;
	}
	public void setSssdsds(Long sssdsds) {
		this.sssdsds = sssdsds;
	}

	public ParamValidateTest getTest2() {
		return this.test2;
	}
	public void setTest2(ParamValidateTest test2) {
		this.test2 = test2;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
