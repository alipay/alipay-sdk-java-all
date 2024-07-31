package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业入驻发票平台信息查询
 *
 * @author auto create
 * @since 1.0, 2020-06-18 22:32:54
 */
public class AlipayEbppInvoiceTopregisterCompanyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6235859472918888654L;

	/**
	 * 业务平台Code,由发票中台分配
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 入驻工单ID
	 */
	@ApiField("register_id")
	private String registerId;

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getRegisterId() {
		return this.registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

}
