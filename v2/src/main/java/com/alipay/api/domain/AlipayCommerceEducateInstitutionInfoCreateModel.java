package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建机构
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:32:41
 */
public class AlipayCommerceEducateInstitutionInfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4684959972878795952L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 关联高校运动学校编号
	 */
	@ApiField("ref_inst_code")
	private String refInstCode;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getRefInstCode() {
		return this.refInstCode;
	}
	public void setRefInstCode(String refInstCode) {
		this.refInstCode = refInstCode;
	}

}
