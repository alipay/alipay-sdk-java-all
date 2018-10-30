package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝转账支付接口
 *
 * @author auto create
 * @since 1.0, 2018-10-10 21:27:33
 */
public class AlipayFundTransUniTransferModel extends AlipayObject {

	private static final long serialVersionUID = 2197777432218481487L;

	/**
	 * 描述特定的业务场景，比如对党费缴纳场景需走党费专户
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 转账请求的扩展参数，具体请与支付宝工程师联系
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 转账的标题，用于在支付宝用户的账单里显示
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户端的唯一订单号，对于同一笔转账请求，商户需保证该订单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款方信息
	 */
	@ApiField("payee_info")
	private Participant payeeInfo;

	/**
	 * 付款方信息
	 */
	@ApiField("payer_info")
	private Participant payerInfo;

	/**
	 * 转账产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 转账备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("trans_amount")
	private String transAmount;

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

	public Participant getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(Participant payeeInfo) {
		this.payeeInfo = payeeInfo;
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

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

}
