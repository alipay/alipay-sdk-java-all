package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业征信数据服务连接-税票信息单次申请模型
 *
 * @author auto create
 * @since 1.0, 2022-04-01 15:31:30
 */
public class TaxReceiptOnceInfo extends AlipayObject {

	private static final long serialVersionUID = 6244166224718116282L;

	/**
	 * 已认证的法人手机号
	 */
	@ApiField("cognizant_mobile")
	private String cognizantMobile;

	/**
	 * 纳税人识别号，也称税号
	 */
	@ApiField("ep_tax_id")
	private String epTaxId;

	public String getCognizantMobile() {
		return this.cognizantMobile;
	}
	public void setCognizantMobile(String cognizantMobile) {
		this.cognizantMobile = cognizantMobile;
	}

	public String getEpTaxId() {
		return this.epTaxId;
	}
	public void setEpTaxId(String epTaxId) {
		this.epTaxId = epTaxId;
	}

}
