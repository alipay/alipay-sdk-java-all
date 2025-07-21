package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商机业务流水号查询
 *
 * @author auto create
 * @since 1.0, 2025-04-01 16:35:53
 */
public class AlipayCommerceOperationOpportunityBizQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8788575519814548956L;

	/**
	 * 商机 ID
	 */
	@ApiField("opportunity_id")
	private String opportunityId;

	/**
	 * 业务申请编号。业务自定义，保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOpportunityId() {
		return this.opportunityId;
	}
	public void setOpportunityId(String opportunityId) {
		this.opportunityId = opportunityId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
