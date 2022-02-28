package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除圈人规则
 *
 * @author auto create
 * @since 1.0, 2021-06-23 15:41:18
 */
public class AlipayMarketingCampaignRuleCrowdDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1295127876992958998L;

	/**
	 * 签约商户下属子机构唯一编号
	 */
	@ApiField("mpid")
	private String mpid;

	/**
	 * 对没有在使用的规则进行删除
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
