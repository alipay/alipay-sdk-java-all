package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 圈人标签查询
 *
 * @author auto create
 * @since 1.0, 2020-08-20 14:01:02
 */
public class AlipayMarketingCampaignRuleTagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5214191784326928359L;

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
