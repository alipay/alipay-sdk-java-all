package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线索业务状态查询
 *
 * @author auto create
 * @since 1.0, 2026-08-12 14:02:51
 */
public class AlipayEcoMycarLeadsBizstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8753616541881362372L;

	/**
	 * 线索id
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
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
