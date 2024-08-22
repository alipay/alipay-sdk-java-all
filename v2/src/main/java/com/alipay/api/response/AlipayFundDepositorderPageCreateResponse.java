package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.depositorder.page.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-26 10:22:05
 */
public class AlipayFundDepositorderPageCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4331286647147326527L;

	/** 
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 充值跳转链接
	 */
	@ApiField("deposit_link")
	private String depositLink;

	/** 
	 * 充值跳转链接类型
	 */
	@ApiField("deposit_link_type")
	private String depositLinkType;

	/** 
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setDepositLink(String depositLink) {
		this.depositLink = depositLink;
	}
	public String getDepositLink( ) {
		return this.depositLink;
	}

	public void setDepositLinkType(String depositLinkType) {
		this.depositLinkType = depositLinkType;
	}
	public String getDepositLinkType( ) {
		return this.depositLinkType;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
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
