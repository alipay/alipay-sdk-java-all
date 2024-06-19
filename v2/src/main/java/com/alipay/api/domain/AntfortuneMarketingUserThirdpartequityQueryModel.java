package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户第三方权益查询接口
 *
 * @author auto create
 * @since 1.0, 2024-05-13 14:38:46
 */
public class AntfortuneMarketingUserThirdpartequityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3894955377999285959L;

	/**
	 * 权益类型，查询用户在该权益类型下的可用权益
	 */
	@ApiField("equity_type")
	private String equityType;

	/**
	 * 消费id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 来源，每个接入的第三方都会有一个来源号
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getEquityType() {
		return this.equityType;
	}
	public void setEquityType(String equityType) {
		this.equityType = equityType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
