package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 助贷双发资方指定同步接口
 *
 * @author auto create
 * @since 1.0, 2025-12-23 15:49:12
 */
public class AlipayTradeThirdPartyPayModel extends AlipayObject {

	private static final long serialVersionUID = 4887648498845756749L;

	/**
	 * 代扣信息
	 */
	@ApiField("agreement_params")
	private AgreementParams agreementParams;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 助贷平台PID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 资方和支付宝签约的产品码。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 资方在助贷平台侧入驻的smid
	 */
	@ApiField("secondary_merchant_no")
	private String secondaryMerchantNo;

	/**
	 * 订单标题
注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 单位为元，精确到小数点后两位，取值范围：[0.01,100000000] 。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public AgreementParams getAgreementParams() {
		return this.agreementParams;
	}
	public void setAgreementParams(AgreementParams agreementParams) {
		this.agreementParams = agreementParams;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSecondaryMerchantNo() {
		return this.secondaryMerchantNo;
	}
	public void setSecondaryMerchantNo(String secondaryMerchantNo) {
		this.secondaryMerchantNo = secondaryMerchantNo;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
