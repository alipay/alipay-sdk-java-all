package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行预付融资订单退款
 *
 * @author auto create
 * @since 1.0, 2018-12-14 19:37:49
 */
public class MybankPaymentTradeFinancingOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2299294333331183212L;

	/**
	 * 退款金额，单位：分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 外部业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 操作币种，默认：156
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/**
	 * 扩展字段， JSON字符串；URLEncoder.encode(String,"UTF-8")
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 网商的订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 退款类型，阿里云填 REFUND
	 */
	@ApiField("refund_type")
	private String refundType;

	/**
	 * 交易备注,URLEncoder.encode(String,"UTF-8")
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 请求流水号，bktradecore根据此字段做幂等控制
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 请求时间，格式yyyyMMddHHmmss
	 */
	@ApiField("request_time")
	private String requestTime;

	/**
	 * FINANCING_REFUND_BY_PAYER-退款场景1（付方垫付利息)
FINANCING_REFUND_BY_PAYEE-退款场景2（收方垫付利息）
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCurrencyValue() {
		return this.currencyValue;
	}
	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRefundType() {
		return this.refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
