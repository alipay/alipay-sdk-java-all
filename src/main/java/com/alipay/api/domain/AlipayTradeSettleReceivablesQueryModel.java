package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通微账余额查询
 *
 * @author auto create
 * @since 1.0, 2019-05-07 14:52:36
 */
public class AlipayTradeSettleReceivablesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8582132577291521773L;

	/**
	 * 收单产品码，商家和支付宝签约的产品码
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 商户信息
	 */
	@ApiField("merchant_info")
	private SettleEntity merchantInfo;

	/**
	 * 外部请求号，32个字符以内，可包含字母、数字、下划线。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public SettleEntity getMerchantInfo() {
		return this.merchantInfo;
	}
	public void setMerchantInfo(SettleEntity merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
