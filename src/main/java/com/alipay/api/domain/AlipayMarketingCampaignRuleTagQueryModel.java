package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 圈人标签查询
 *
 * @author auto create
 * @since 1.0, 2018-10-17 14:07:55
 */
public class AlipayMarketingCampaignRuleTagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2268692531661543542L;

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
