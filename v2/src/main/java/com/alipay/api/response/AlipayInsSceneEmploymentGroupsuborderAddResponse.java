package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.groupsuborder.add response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:36
 */
public class AlipayInsSceneEmploymentGroupsuborderAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4782772291123383764L;

	/** 
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

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

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

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
