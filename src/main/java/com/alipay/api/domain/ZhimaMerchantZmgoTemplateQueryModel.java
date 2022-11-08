package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO模板查询
 *
 * @author auto create
 * @since 1.0, 2022-08-29 17:36:11
 */
public class ZhimaMerchantZmgoTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2337416412414319243L;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 模板ID，由创建模板接口返回结果提供
	 */
	@ApiField("template_no")
	private String templateNo;

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getTemplateNo() {
		return this.templateNo;
	}
	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}

}
