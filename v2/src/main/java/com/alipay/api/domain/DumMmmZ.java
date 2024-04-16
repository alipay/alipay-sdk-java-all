package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 据结构名据结构名据结构名据结构名
 *
 * @author auto create
 * @since 1.0, 2024-02-28 19:30:54
 */
public class DumMmmZ extends AlipayObject {

	private static final long serialVersionUID = 1549964941559532434L;

	/**
	 * 1
	 */
	@ApiField("field_a")
	private String fieldA;

	/**
	 * gdfhsdfghsdfgh
	 */
	@ApiField("field_b")
	private String fieldB;

	/**
	 * 11111
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 11111
	 */
	@ApiField("user_id")
	private String userId;

	public String getFieldA() {
		return this.fieldA;
	}
	public void setFieldA(String fieldA) {
		this.fieldA = fieldA;
	}

	public String getFieldB() {
		return this.fieldB;
	}
	public void setFieldB(String fieldB) {
		this.fieldB = fieldB;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
