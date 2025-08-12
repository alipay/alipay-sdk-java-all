package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跑步记录运动轨迹查询
 *
 * @author auto create
 * @since 1.0, 2025-06-04 11:40:35
 */
public class AlipayCommerceEducateSmartcampusGeopointsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1587975511669457965L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 跑步记录id
	 */
	@ApiField("record_id")
	private String recordId;

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

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
