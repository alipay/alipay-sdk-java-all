package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 引用复杂类型
 *
 * @author auto create
 * @since 1.0, 2025-04-15 13:53:48
 */
public class RainyComplexTypesTheThirteen extends AlipayObject {

	private static final long serialVersionUID = 3681795346636813677L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiListField("open_ids")
	@ApiField("string")
	private List<String> openIds;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getOpenIds() {
		return this.openIds;
	}
	public void setOpenIds(List<String> openIds) {
		this.openIds = openIds;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
