package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即时交付物流公司信息
 *
 * @author auto create
 * @since 1.0, 2020-09-27 15:29:16
 */
public class LogisticsCompanyDTO extends AlipayObject {

	private static final long serialVersionUID = 4122338483623515222L;

	/**
	 * 配送公司客服电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 配送公司物流编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 配送公司名称
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsName() {
		return this.logisticsName;
	}
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

}
