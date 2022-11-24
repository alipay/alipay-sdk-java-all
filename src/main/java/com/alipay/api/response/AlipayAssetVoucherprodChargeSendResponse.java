package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.voucherprod.charge.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-04 10:15:58
 */
public class AlipayAssetVoucherprodChargeSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3554814289518458747L;

	/** 
	 * 资产id编号
	 */
	@ApiField("asset_instance_id")
	private String assetInstanceId;

	/** 
	 * 支付宝充值订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setAssetInstanceId(String assetInstanceId) {
		this.assetInstanceId = assetInstanceId;
	}
	public String getAssetInstanceId( ) {
		return this.assetInstanceId;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
