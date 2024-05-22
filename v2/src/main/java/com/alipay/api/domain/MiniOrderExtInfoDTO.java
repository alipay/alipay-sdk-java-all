package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单扩展信息模型
 *
 * @author auto create
 * @since 1.0, 2024-01-26 18:20:15
 */
public class MiniOrderExtInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8561388151351165299L;

	/**
	 * 二方接入交易组件用于返佣计算的特殊参数，单位为元
	 */
	@ApiField("addition_rebate_base_price")
	private String additionRebateBasePrice;

	/**
	 * 代扣协议签约场景值，商户可根据代扣产品常见场景值选择符合自身的行业场景，必须和合约中配置的一致。
	 */
	@ApiField("deduct_sign_scene")
	private String deductSignScene;

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
	 * 订单的交易类型用于区分担保交易或者普通JSAPI支付，创支付单会对该类型进行校验，如果参入错误，创支付单会失败
	 */
	@ApiField("order_trade_type")
	private String orderTradeType;

	/**
	 * 支付单交易号，用于信用下单不成功转普通支付。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAdditionRebateBasePrice() {
		return this.additionRebateBasePrice;
	}
	public void setAdditionRebateBasePrice(String additionRebateBasePrice) {
		this.additionRebateBasePrice = additionRebateBasePrice;
	}

	public String getDeductSignScene() {
		return this.deductSignScene;
	}
	public void setDeductSignScene(String deductSignScene) {
		this.deductSignScene = deductSignScene;
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

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
