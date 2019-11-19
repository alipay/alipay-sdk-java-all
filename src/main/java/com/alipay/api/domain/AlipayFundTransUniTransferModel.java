package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝转账支付接口
 *
 * @author auto create
 * @since 1.0, 2019-10-23 15:09:00
 */
public class AlipayFundTransUniTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4589926851289332162L;

	/**
	 * 描述特定的业务场景，可传的参数如下：
PERSONAL_COLLECTION：C2C现金红包-领红包；
DIRECT_TRANSFER：B2C现金红包、单笔无密转账
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 转账业务请求的扩展参数，支持传入的扩展参数如下：
1、sub_biz_scene 子业务场景，红包必传，取值REDPACKET，c2c现金红包、b2c现金红包均需传入
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 转账业务的标题，用于在支付宝用户的账单里显示
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 原支付宝业务单号。C2C现金红包-红包领取时，传红包支付时返回的支付宝单号；B2C现金红包、单笔无密转账不需要该参数。
	 */
	@ApiField("original_order_id")
	private String originalOrderId;

	/**
	 * 商户端的唯一订单号，对于同一笔转账请求，商户需保证该订单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则异步通知商户时会回传该参数。
	 */
	@ApiField("passback_params")
	private String passbackParams;

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
	 * 业务产品码，
收发现金红包固定为：STD_RED_PACKET；
单笔无密转账固定为：TRANS_ACCOUNT_NO_PWD；
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 业务备注
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

	public String getOriginalOrderId() {
		return this.originalOrderId;
	}
	public void setOriginalOrderId(String originalOrderId) {
		this.originalOrderId = originalOrderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPassbackParams() {
		return this.passbackParams;
	}
	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
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
