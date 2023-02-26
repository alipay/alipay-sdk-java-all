package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.contract.facetoface.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 15:56:02
 */
public class AntMerchantExpandContractFacetofaceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6444949565167624975L;

	/** 
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 产品签约审核结果，申请单状态为审核失败时失败原因用“;”分割，其他状态产品签约审核结果为空
	 */
	@ApiField("order_detail")
	private String orderDetail;

	/** 
	 * 支付宝端商户入驻申请单据号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付宝商户入驻申请单状态，申请单状态包括：暂存、审核中、审核成功、审核失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 由开发者创建的外部入驻申请单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
	}
	public String getOrderDetail( ) {
		return this.orderDetail;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
