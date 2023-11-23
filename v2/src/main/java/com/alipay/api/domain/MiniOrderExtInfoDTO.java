package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单扩展信息模型
 *
 * @author auto create
 * @since 1.0, 2023-11-16 11:35:59
 */
public class MiniOrderExtInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5782161148687726831L;

	/**
	 * 二方接入交易组件用于返佣计算的特殊参数，单位为元
	 */
	@ApiField("addition_rebate_base_price")
	private String additionRebateBasePrice;

	/**
	 * 预约上门取件的时间,格式为  yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("door_time")
	private Date doorTime;

	/**
	 * 芝麻免押冻结资金签名串，调用
<a href="https://opendocs.alipay.com/open/e2e70da4_alipay.fund.auth.order.app.freeze?pathHash=1002681c&ref=api">alipay.fund.auth.order.app.freeze</a>生成，用于租赁场景冻结授权资金
	 */
	@ApiField("order_str")
	private String orderStr;

	/**
	 * 订单的交易类型用于区分担保交易或者普通JSAPI支付，担保交易类型该字段必填，创支付单会对改类型进行校验，如果参入错误，创支付单会失败
	 */
	@ApiField("order_trade_type")
	private String orderTradeType;

	public String getAdditionRebateBasePrice() {
		return this.additionRebateBasePrice;
	}
	public void setAdditionRebateBasePrice(String additionRebateBasePrice) {
		this.additionRebateBasePrice = additionRebateBasePrice;
	}

	public Date getDoorTime() {
		return this.doorTime;
	}
	public void setDoorTime(Date doorTime) {
		this.doorTime = doorTime;
	}

	public String getOrderStr() {
		return this.orderStr;
	}
	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}

	public String getOrderTradeType() {
		return this.orderTradeType;
	}
	public void setOrderTradeType(String orderTradeType) {
		this.orderTradeType = orderTradeType;
	}

}
