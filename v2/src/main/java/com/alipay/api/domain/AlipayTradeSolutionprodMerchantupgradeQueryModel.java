package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个人用户升级查询接口
 *
 * @author auto create
 * @since 1.0, 2025-11-17 21:39:30
 */
public class AlipayTradeSolutionprodMerchantupgradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6611837365499116456L;

	/**
	 * 调用alipay.trade.solutionprod.merchantupgrade.apply返回的个人用户升级申请单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部请求流水号，调用alipay.trade.solutionprod.merchantupgrade.apply接口时传入
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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
