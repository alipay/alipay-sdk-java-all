package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金转入计划详情
 *
 * @author auto create
 * @since 1.0, 2022-07-18 22:11:08
 */
public class DepositForm extends AlipayObject {

	private static final long serialVersionUID = 4129873342647218992L;

	/**
	 * 充值金额（单位为元，必须大于0且最多小数点后两位）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订单标题：敏感字、长度超长会拒绝交易，可包括数字、字母、空格、汉字，但不能包括特殊字符、emoji等
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户侧单号（幂等字段）
补充说明：转入场景幂等逻辑（商户appid+out_biz_no），商户集成时需注意，如换号重复发起，则认为是一笔新的请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

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

}
