package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单详情查询
 *
 * @author auto create
 * @since 1.0, 2026-08-25 10:08:48
 */
public class AlipayOpenSpNfcexpoprodOrderdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4619544981581452557L;

	/**
	 * 物料编号
	 */
	@ApiField("coil_no")
	private String coilNo;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务唯一编号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getCoilNo() {
		return this.coilNo;
	}
	public void setCoilNo(String coilNo) {
		this.coilNo = coilNo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
