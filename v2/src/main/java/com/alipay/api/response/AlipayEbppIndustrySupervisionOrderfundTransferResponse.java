package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.orderfund.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-14 19:17:39
 */
public class AlipayEbppIndustrySupervisionOrderfundTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 4299877279527745711L;

	/** 
	 * 行业受理划拨请求的生成操作单号
	 */
	@ApiField("operate_no")
	private String operateNo;

	public void setOperateNo(String operateNo) {
		this.operateNo = operateNo;
	}
	public String getOperateNo( ) {
		return this.operateNo;
	}

}
