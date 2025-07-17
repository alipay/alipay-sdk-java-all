package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 无线转账支付咨询接口
 *
 * @author auto create
 * @since 1.0, 2020-08-27 11:50:10
 */
public class AlipayFundTransAppConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2429891232592785312L;

	/**
	 * 描述特定的业务场景，比如对党费缴纳场景需走党费专户。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * JSON格式，传递业务扩展参数，使用前请与支付宝工程师联系！
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 商户端的唯一订单号。在咨询场景中该字段可为空。如果填写，将做格式、长度等检查。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款的资金账号
	 */
	@ApiField("payee_info")
	private Participant payeeInfo;

	/**
	 * 销售产品码，商家和支付宝签约的产品码。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 咨询转账备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 如：trans_amount(转账金额)
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
