package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提现商户资产
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:24:54
 */
public class AlipayCommerceRecycleMerchantassetWithdrawModel extends AlipayObject {

	private static final long serialVersionUID = 7415892985474576534L;

	/**
	 * 订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户端的唯一订单号，对于同一笔提现请求，商户需保证该订单号唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 订单备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 提现总金额，单位：分
	 */
	@ApiField("trans_amount")
	private Long transAmount;

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(Long transAmount) {
		this.transAmount = transAmount;
	}

}
