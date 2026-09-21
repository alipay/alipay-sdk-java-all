package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 神奇草原用户信息查询
 *
 * @author auto create
 * @since 1.0, 2026-09-21 15:22:25
 */
public class AlipaySocialAntforestGrasslanduserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2372993496936366463L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 访问来源，业务自己定
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

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
