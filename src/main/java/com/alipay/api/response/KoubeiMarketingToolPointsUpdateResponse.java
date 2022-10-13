package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.points.update response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-28 11:40:15
 */
public class KoubeiMarketingToolPointsUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2164541486652977371L;

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
