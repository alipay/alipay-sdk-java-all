package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditbenefit.funcardbenefit.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-25 10:47:23
 */
public class AlipayPcreditHuabeiPcreditbenefitFuncardbenefitSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8344868758742753573L;

	/** 
	 * 业务单据号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 权益名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 发放外部单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 权益产品id
	 */
	@ApiField("product_id")
	private String productId;

	/** 
	 * 发放状态
	 */
	@ApiField("send_status")
	private String sendStatus;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductId( ) {
		return this.productId;
	}

	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}
	public String getSendStatus( ) {
		return this.sendStatus;
	}

}
