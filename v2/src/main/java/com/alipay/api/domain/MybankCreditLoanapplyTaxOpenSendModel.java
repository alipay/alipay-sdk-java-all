package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 税务授权结果通知处理器
 *
 * @author auto create
 * @since 1.0, 2023-08-10 10:22:44
 */
public class MybankCreditLoanapplyTaxOpenSendModel extends AlipayObject {

	private static final long serialVersionUID = 4335461361253737873L;

	/**
	 * 此场景固定使用TAX_APPLET_AUTH_NOTICE
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 业务字段
	 */
	@ApiField("data_object")
	private String dataObject;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getDataObject() {
		return this.dataObject;
	}
	public void setDataObject(String dataObject) {
		this.dataObject = dataObject;
	}

}
