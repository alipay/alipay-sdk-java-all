package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 垫资查询
 *
 * @author auto create
 * @since 1.0, 2019-12-03 14:19:49
 */
public class AlipayTradeAdvanceConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2192687331739761396L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ） ，在进行单笔订单风险评估预咨询时必传。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 支付宝用户 id，2088开头的16为数字。
除单笔订单风险预评估场景(即consult_scene指定ORDER_RISK_EVALUATION)外，其他场景必选。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 订单咨询类型，用以选择咨询的服务。不传时默认为垫资咨询，其他的场景需要按照对接的服务传入指定的值。
ORDER_RISK_EVALUATION：表示单笔订单风险预评估。
	 */
	@ApiField("consult_scene")
	private String consultScene;

	/**
	 * 预估订单总金额，单位为元，精确到小数点后两位，单笔订单风险预评估时使用，取值范围[0.01,100000000]。
	 */
	@ApiField("estimated_order_amount")
	private String estimatedOrderAmount;

	/**
	 * 行业产品信息，咨询时会从该产品对应的销售方案中获取相关垫资规则配置。
	 */
	@ApiField("industry_product_code")
	private String industryProductCode;

	/**
	 * 商户请求时的外部订单号，在花芝场景下非空。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 子商户id
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 子商户类型
	 */
	@ApiField("sub_merchant_type")
	private String subMerchantType;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getConsultScene() {
		return this.consultScene;
	}
	public void setConsultScene(String consultScene) {
		this.consultScene = consultScene;
	}

	public String getEstimatedOrderAmount() {
		return this.estimatedOrderAmount;
	}
	public void setEstimatedOrderAmount(String estimatedOrderAmount) {
		this.estimatedOrderAmount = estimatedOrderAmount;
	}

	public String getIndustryProductCode() {
		return this.industryProductCode;
	}
	public void setIndustryProductCode(String industryProductCode) {
		this.industryProductCode = industryProductCode;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public String getSubMerchantType() {
		return this.subMerchantType;
	}
	public void setSubMerchantType(String subMerchantType) {
		this.subMerchantType = subMerchantType;
	}

}
