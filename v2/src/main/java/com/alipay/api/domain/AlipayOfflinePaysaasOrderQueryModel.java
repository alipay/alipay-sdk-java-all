package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单状态查询
 *
 * @author auto create
 * @since 1.0, 2025-02-25 19:53:33
 */
public class AlipayOfflinePaysaasOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6332276957362645579L;

	/**
	 * 收款订单投送N手持设备ID
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 服务商外部单号,外部实际使用单号
	 */
	@ApiField("isv_out_order_no")
	private String isvOutOrderNo;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getIsvOutOrderNo() {
		return this.isvOutOrderNo;
	}
	public void setIsvOutOrderNo(String isvOutOrderNo) {
		this.isvOutOrderNo = isvOutOrderNo;
	}

}
