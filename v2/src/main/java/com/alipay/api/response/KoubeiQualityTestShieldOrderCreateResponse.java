package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.shield.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:05:42
 */
public class KoubeiQualityTestShieldOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2132774767596441995L;

	/** 
	 * 加购单批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}
	public String getExtInfos( ) {
		return this.extInfos;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
