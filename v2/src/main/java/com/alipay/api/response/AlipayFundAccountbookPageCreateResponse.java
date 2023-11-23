package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.accountbook.page.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:26:45
 */
public class AlipayFundAccountbookPageCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1793748637912614818L;

	/** 
	 * 业务场景码，固定值：页面创建
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 当前开通状态
	 */
	@ApiField("process_status")
	private String processStatus;

	/** 
	 * 产品码，固定值：资金账本管理
	 */
	@ApiField("product_code")
	private String productCode;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	public String getProcessStatus( ) {
		return this.processStatus;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

}
