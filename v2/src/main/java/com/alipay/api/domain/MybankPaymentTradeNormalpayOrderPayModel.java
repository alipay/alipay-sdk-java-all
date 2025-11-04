package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 普通支付支付接口
 *
 * @author auto create
 * @since 1.0, 2019-12-10 12:32:02
 */
public class MybankPaymentTradeNormalpayOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 2341947484982173997L;

	/**
	 * 支付金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 币种
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/**
	 * 扩展参数，内容是JSON格式，并用urlconde编码，按场景约定具体字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 操作场景类型 ：NORMAL_PAY_PAYMENT_WITH_CREDIT-周卡支付;NORMAL_PAY_PAYMENT_WITH_GUARANTEE-担保支付；不传默认为周卡支付；
	 */
	@ApiField("operate_scene_type")
	private String operateSceneType;

	/**
	 * 创建订单时返回的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 创建订单的订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 收方资产信息，内容是JSON格式，并用urlencode编码，按场景约定具体字段
	 */
	@ApiField("payee_fund_detail")
	private String payeeFundDetail;

	/**
	 * 付方资产信息，内容是JSON格式，并用urlencode编码，按场景约定具体字段
	 */
	@ApiField("payer_fund_detail")
	private String payerFundDetail;

	/**
	 * 支付备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 请求流水号，表示外部一次请求，幂等字段
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 请求时间，格式是yyyyMMddHHmmss
	 */
	@ApiField("request_time")
	private String requestTime;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
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

	public String getOperateSceneType() {
		return this.operateSceneType;
	}
	public void setOperateSceneType(String operateSceneType) {
		this.operateSceneType = operateSceneType;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPayeeFundDetail() {
		return this.payeeFundDetail;
	}
	public void setPayeeFundDetail(String payeeFundDetail) {
		this.payeeFundDetail = payeeFundDetail;
	}

	public String getPayerFundDetail() {
		return this.payerFundDetail;
	}
	public void setPayerFundDetail(String payerFundDetail) {
		this.payerFundDetail = payerFundDetail;
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

}
