package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.grouporder.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:41:45
 */
public class AlipayInsSceneEmploymentGrouporderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7744883713239957492L;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 主单号
	 */
	@ApiField("summary_order_no")
	private String summaryOrderNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setSummaryOrderNo(String summaryOrderNo) {
		this.summaryOrderNo = summaryOrderNo;
	}
	public String getSummaryOrderNo( ) {
		return this.summaryOrderNo;
	}

}
