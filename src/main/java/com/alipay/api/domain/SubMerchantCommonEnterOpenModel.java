package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户门店公共信息模型
 *
 * @author auto create
 * @since 1.0, 2018-01-19 10:21:21
 */
public class SubMerchantCommonEnterOpenModel extends AlipayObject {

	private static final long serialVersionUID = 5721816242499967983L;

	/**
	 * 商户门店入驻的产品码,QRCODE_MERCHANT_OPEN:企业自建-扫码开票，INVOICE_RETURN:企业自建-发票回传，INVOICE_EXPENSE:发票报销。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户门店所属的服务方简称。
	 */
	@ApiField("s_short_name")
	private String sShortName;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getsShortName() {
		return this.sShortName;
	}
	public void setsShortName(String sShortName) {
		this.sShortName = sShortName;
	}

}
