package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金开放订单查询
 *
 * @author auto create
 * @since 1.0, 2022-06-29 13:44:59
 */
public class AlipayFundTransInnovateOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6643766454144738359L;

	/**
	 * 描述特定的业务场景，如果传递了out_biz_no则该字段为必传。房租为：HOUSE_RENT
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 转账业务请求的扩展参数，格式为json格式
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 支付宝转账单据号。当和商户转账唯一订单号同时提供时，将用本参数进行查询，忽略商户转账唯一订单号。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户转账唯一订单号：发起转账来源方定义的转账单据ID。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 付款方账号信息
	 */
	@ApiField("payer_info")
	private Participant payerInfo;

	/**
	 * 销售产品码，商家和支付宝签约的产品码，如果传递了out_biz_no则该字段为必传。可传值如下： 转账到支付宝账号 TRANSFER_TO_ALIPAY_ACCOUNT 转账到银行卡 TRANSFER_TO_BANK_CARD
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
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

	public Participant getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(Participant payerInfo) {
		this.payerInfo = payerInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
