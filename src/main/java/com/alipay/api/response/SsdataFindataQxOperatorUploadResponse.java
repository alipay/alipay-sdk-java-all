package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.findata.qx.operator.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class SsdataFindataQxOperatorUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2886569483211465539L;

	/** 
	 * 系统业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 商户系统的业务流水号
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}
	public String getOrgBizNo( ) {
		return this.orgBizNo;
	}

}
