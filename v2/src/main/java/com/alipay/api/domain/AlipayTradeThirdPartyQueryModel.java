package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资方付款指令接口查询
 *
 * @author auto create
 * @since 1.0, 2026-02-03 14:52:42
 */
public class AlipayTradeThirdPartyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4841445974447524785L;

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

}
