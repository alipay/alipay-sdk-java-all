package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 圈人标签查询
 *
 * @author auto create
 * @since 1.0, 2021-06-23 15:40:00
 */
public class AlipayMarketingCampaignRuleTagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1713431821738682349L;

	/**
	 * 签约商户下属机构唯一编号
	 */
	@ApiField("mpid")
	private String mpid;

	public String getMpid() {
		return this.mpid;
	}
	public void setMpid(String mpid) {
		this.mpid = mpid;
	}

}
