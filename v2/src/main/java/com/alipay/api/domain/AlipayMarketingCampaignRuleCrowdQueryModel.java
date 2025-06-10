package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 圈人规则详情查询
 *
 * @author auto create
 * @since 1.0, 2021-06-23 15:40:39
 */
public class AlipayMarketingCampaignRuleCrowdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5572472943181932843L;

	/**
	 * 签约商户下属机构唯一编号
	 */
	@ApiField("mpid")
	private String mpid;

	/**
	 * 所要查询的规则id
	 */
	@ApiField("ruleid")
	private String ruleid;

	public String getMpid() {
		return this.mpid;
	}
	public void setMpid(String mpid) {
		this.mpid = mpid;
	}

	public String getRuleid() {
		return this.ruleid;
	}
	public void setRuleid(String ruleid) {
		this.ruleid = ruleid;
	}

}
