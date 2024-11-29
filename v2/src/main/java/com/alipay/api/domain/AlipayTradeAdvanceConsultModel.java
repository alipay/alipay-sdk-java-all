package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 垫资查询
 *
 * @author auto create
 * @since 1.0, 2021-10-12 10:42:58
 */
public class AlipayTradeAdvanceConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3592154163458986372L;

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
	 * 是否需要进行用户风险预测
	 */
	@ApiField("need_user_risk_prediction")
	private String needUserRiskPrediction;

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

	/**
	 * 交易信息摘要，需要进行用户风险预测时可传，用于结合场景的更加精细的预测。具体信息结构服务接入前咨询约定。
	 */
	@ApiField("trade_digest")
	private String tradeDigest;

	/**
	 * 用户在外部域账号系统绑定的手机号，需要进行用户风险预测时必传，用于预测用户是否面临被二次放号的场景。使用时需要对请求加密，加密后请求在公网传输时为加密文本。详见：https://opendocs.alipay.com/open/common/104567；https://opendocs.alipay.com/isv/grefvl/getaes
	 */
	@ApiField("user_out_binding_phone")
	private String userOutBindingPhone;

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

	public String getNeedUserRiskPrediction() {
		return this.needUserRiskPrediction;
	}
	public void setNeedUserRiskPrediction(String needUserRiskPrediction) {
		this.needUserRiskPrediction = needUserRiskPrediction;
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

	public String getTradeDigest() {
		return this.tradeDigest;
	}
	public void setTradeDigest(String tradeDigest) {
		this.tradeDigest = tradeDigest;
	}

	public String getUserOutBindingPhone() {
		return this.userOutBindingPhone;
	}
	public void setUserOutBindingPhone(String userOutBindingPhone) {
		this.userOutBindingPhone = userOutBindingPhone;
	}

}
