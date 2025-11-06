package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金委托支付接口	
 *
 * @author auto create
 * @since 1.0, 2022-04-01 13:44:34
 */
public class AlipayFundTransEntrustPayModel extends AlipayObject {

	private static final long serialVersionUID = 4539313128474462717L;

	/**
	 * 授权对象
	 */
	@ApiField("auth_info")
	private AuthInfo authInfo;

	/**
	 * 业务场景，比如诚e赊还款、淘宝心选等
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * JSON格式，传递业务扩展参数，使用前请与支付宝工程师联系！
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 默认都是ASYNC；填SYNC是准实时委托扣款，并不会实时返回支付结果
	 */
	@ApiField("entrust_payment_mode")
	private String entrustPaymentMode;

	/**
	 * 订单的标题，用于在消费记录展示
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户端的唯一订单号，对于同一笔委托支付请求，商户需保证该订单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 回传参数，如果请求时传递了该参数，则异步通知商户时会回传该参数。
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
	 * 销售产品码，商家和支付宝签约的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("trans_amount")
	private String transAmount;

	public AuthInfo getAuthInfo() {
		return this.authInfo;
	}
	public void setAuthInfo(AuthInfo authInfo) {
		this.authInfo = authInfo;
	}

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

	public String getEntrustPaymentMode() {
		return this.entrustPaymentMode;
	}
	public void setEntrustPaymentMode(String entrustPaymentMode) {
		this.entrustPaymentMode = entrustPaymentMode;
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
