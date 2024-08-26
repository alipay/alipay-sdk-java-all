package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户门店公共信息模型
 *
 * @author auto create
 * @since 1.0, 2020-09-14 14:33:36
 */
public class SubMerchantCommonEnterOpenModel extends AlipayObject {

	private static final long serialVersionUID = 5214333918937285316L;

	/**
	 * 扩展字段，为json字符串格式；入驻支付即开票的产品该字段必填，用户白名单，由此字段传入；支付即开票商户配置维度，如果不传默认为SMID_MODE，目前仅支持SMID_MODE和PID_MODE
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * 商户门店入驻的产品码,STANDARD_INVOICE:扫码开票，INVOICE_RETURN:企业自建-发票回传，INVOICE_EXPENSE:发票报销，PAYMENT_OPEN:支付即开票，PAY_FEE_OPEN:缴费后开票。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户门店所属的服务方简称。
	 */
	@ApiField("s_short_name")
	private String sShortName;

	public String getExtendFields() {
		return this.extendFields;
	}
	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

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
