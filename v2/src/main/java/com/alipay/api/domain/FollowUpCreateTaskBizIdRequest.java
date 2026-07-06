package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-24 17:58:45
 */
public class FollowUpCreateTaskBizIdRequest extends AlipayObject {

	private static final long serialVersionUID = 7792676794331816564L;

	/**
	 * 蚂蚁健康OpenID
	 */
	@ApiField("aq_open_id")
	private String aqOpenId;

	/**
	 * 外部业务流水号
	 */
	@ApiField("biz_id")
	private String bizId;

	public String getAqOpenId() {
		return this.aqOpenId;
	}
	public void setAqOpenId(String aqOpenId) {
		this.aqOpenId = aqOpenId;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

}
