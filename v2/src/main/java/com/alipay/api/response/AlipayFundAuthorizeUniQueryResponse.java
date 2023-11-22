package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.authorize.uni.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:11:44
 */
public class AlipayFundAuthorizeUniQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5422118897752676661L;

	/** 
	 * 授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 操作时间
	 */
	@ApiField("operate_time")
	private String operateTime;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 业务产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 授权状态
	 */
	@ApiField("status")
	private String status;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}
	public String getOperateTime( ) {
		return this.operateTime;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
