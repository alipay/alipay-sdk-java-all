package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构准入咨询接口
 *
 * @author auto create
 * @since 1.0, 2021-04-27 14:37:42
 */
public class MybankCreditSceneprodInstAuthConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6739555273657127271L;

	/**
	 * 需要咨询的内容信息，不填默认是机构是否准入咨询
	 */
	@ApiField("consult_content")
	private String consultContent;

	/**
	 * 机构码，机构入驻时网商分配
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 网商分配的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getConsultContent() {
		return this.consultContent;
	}
	public void setConsultContent(String consultContent) {
		this.consultContent = consultContent;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
