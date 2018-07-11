package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.points.update response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-15 18:49:47
 */
public class KoubeiMarketingToolPointsUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5586613922428968868L;

	/** 
	 * 集点变更流水号
	 */
	@ApiField("point_log_no")
	private String pointLogNo;

	public void setPointLogNo(String pointLogNo) {
		this.pointLogNo = pointLogNo;
	}
	public String getPointLogNo( ) {
		return this.pointLogNo;
	}

}
