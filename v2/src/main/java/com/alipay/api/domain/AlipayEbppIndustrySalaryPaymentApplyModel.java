package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 薪资发放申请
 *
 * @author auto create
 * @since 1.0, 2025-01-06 11:22:43
 */
public class AlipayEbppIndustrySalaryPaymentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7798688586574269438L;

	/**
	 * 大于0，金额为分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 默认填写156(人民币)
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 代发商户商户号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 外部流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 01：余额支付
	 */
	@ApiField("pay_way")
	private String payWay;

	/**
	 * 收款人账户类型
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 收款人支行名称
	 */
	@ApiField("payee_branch_name")
	private String payeeBranchName;

	/**
	 * 收款人卡号
	 */
	@ApiField("payee_card_no")
	private String payeeCardNo;

	/**
	 * 对私、对公代发都可不传
若传收方身份证，则在对私代发至网商、支付宝账户时校验证件有效性，其余场景均不校验
	 */
	@ApiField("payee_cert_no")
	private String payeeCertNo;

	/**
	 * 对公银行卡必填
	 */
	@ApiField("payee_contact_line")
	private String payeeContactLine;

	/**
	 * 收款人手机号码
	 */
	@ApiField("payee_mobile")
	private String payeeMobile;

	/**
	 * 收款人姓名
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 出资的子户账号
	 */
	@ApiField("payer_card_no")
	private String payerCardNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 备注字段枚举值：代发工资、奖金、绩效、津贴、补贴、对公支付
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 业务场景标识采用key1=value1|key2=value2|key3=value3格式
	 */
	@ApiField("scene_tag")
	private String sceneTag;

	/**
	 * 对接收付通加签的xml，通过base64Encode编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	/**
	 * 业务类型
	 */
	@ApiField("type")
	private String type;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayWay() {
		return this.payWay;
	}
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public String getPayeeAccountType() {
		return this.payeeAccountType;
	}
	public void setPayeeAccountType(String payeeAccountType) {
		this.payeeAccountType = payeeAccountType;
	}

	public String getPayeeBranchName() {
		return this.payeeBranchName;
	}
	public void setPayeeBranchName(String payeeBranchName) {
		this.payeeBranchName = payeeBranchName;
	}

	public String getPayeeCardNo() {
		return this.payeeCardNo;
	}
	public void setPayeeCardNo(String payeeCardNo) {
		this.payeeCardNo = payeeCardNo;
	}

	public String getPayeeCertNo() {
		return this.payeeCertNo;
	}
	public void setPayeeCertNo(String payeeCertNo) {
		this.payeeCertNo = payeeCertNo;
	}

	public String getPayeeContactLine() {
		return this.payeeContactLine;
	}
	public void setPayeeContactLine(String payeeContactLine) {
		this.payeeContactLine = payeeContactLine;
	}

	public String getPayeeMobile() {
		return this.payeeMobile;
	}
	public void setPayeeMobile(String payeeMobile) {
		this.payeeMobile = payeeMobile;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayerCardNo() {
		return this.payerCardNo;
	}
	public void setPayerCardNo(String payerCardNo) {
		this.payerCardNo = payerCardNo;
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

	public String getSceneTag() {
		return this.sceneTag;
	}
	public void setSceneTag(String sceneTag) {
		this.sceneTag = sceneTag;
	}

	public String getSignXml() {
		return this.signXml;
	}
	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
