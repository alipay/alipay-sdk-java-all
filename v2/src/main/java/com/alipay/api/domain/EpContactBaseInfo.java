package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业联系方式基础信息
 *
 * @author auto create
 * @since 1.0, 2024-08-20 17:41:20
 */
public class EpContactBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 7584973197786669468L;

	/**
	 * 联系方式可信度
	 */
	@ApiField("confidence_level")
	private String confidenceLevel;

	/**
	 * 联系方式
	 */
	@ApiField("contact_number")
	private String contactNumber;

	public String getConfidenceLevel() {
		return this.confidenceLevel;
	}
	public void setConfidenceLevel(String confidenceLevel) {
		this.confidenceLevel = confidenceLevel;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}
