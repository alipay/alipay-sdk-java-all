package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信助手会员包创建
 *
 * @author auto create
 * @since 1.0, 2026-01-23 10:17:42
 */
public class ZhimaCreditEpAssistantMembershippackageCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3356329284772997116L;

	/**
	 * 唯一键，幂等控制，同一个id不允许多次购买
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 企信会员产品码，由企信分配
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 企信会员产品包，由企信分配
	 */
	@ApiField("product_sku")
	private String productSku;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductSku() {
		return this.productSku;
	}
	public void setProductSku(String productSku) {
		this.productSku = productSku;
	}

}
