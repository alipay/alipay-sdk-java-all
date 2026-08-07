package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 买家信息。pay_channels显式单选BANK_TRANSFER时条件必填。
 *
 * @author auto create
 * @since 1.0, 2026-08-03 11:52:51
 */
public class SaasBuyerInfo extends AlipayObject {

	private static final long serialVersionUID = 7636283958658662448L;

	/**
	 * 买家标识。buyer_id_type=customer_id时为SaaS 客户 ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家标识类型。customer_id表示SaaS 客户 ID
	 */
	@ApiField("buyer_id_type")
	private String buyerIdType;

	/**
	 * 商户名称，默认可选，如下单时需同步开户则必须提供
	 */
	@ApiField("out_merchant_name")
	private String outMerchantName;

	/**
	 * 外部平台二级商户唯一编码
	 */
	@ApiField("out_merchant_no")
	private String outMerchantNo;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerIdType() {
		return this.buyerIdType;
	}
	public void setBuyerIdType(String buyerIdType) {
		this.buyerIdType = buyerIdType;
	}

	public String getOutMerchantName() {
		return this.outMerchantName;
	}
	public void setOutMerchantName(String outMerchantName) {
		this.outMerchantName = outMerchantName;
	}

	public String getOutMerchantNo() {
		return this.outMerchantNo;
	}
	public void setOutMerchantNo(String outMerchantNo) {
		this.outMerchantNo = outMerchantNo;
	}

}
