package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.affinitycard.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-11 16:57:32
 */
public class AlipayPcreditHuabeiAffinitycardOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7338781584612296561L;

	/** 
	 * 支付宝订单实际占用场景额度，单位：元，精确到小数点后2位
	 */
	@ApiField("occupy_scene_amount")
	private String occupySceneAmount;

	public void setOccupySceneAmount(String occupySceneAmount) {
		this.occupySceneAmount = occupySceneAmount;
	}
	public String getOccupySceneAmount( ) {
		return this.occupySceneAmount;
	}

}
