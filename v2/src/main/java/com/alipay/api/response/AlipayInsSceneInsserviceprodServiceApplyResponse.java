package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.service.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-17 10:11:46
 */
public class AlipayInsSceneInsserviceprodServiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3559834559625277969L;

	/** 
	 * 蚂蚁服务申请单号，机构通知蚂蚁生成服务订单后，返回给机构蚂蚁生成的单号，后续进度交互都需基于此单号
	 */
	@ApiField("ant_apply_order_no")
	private String antApplyOrderNo;

	public void setAntApplyOrderNo(String antApplyOrderNo) {
		this.antApplyOrderNo = antApplyOrderNo;
	}
	public String getAntApplyOrderNo( ) {
		return this.antApplyOrderNo;
	}

}
