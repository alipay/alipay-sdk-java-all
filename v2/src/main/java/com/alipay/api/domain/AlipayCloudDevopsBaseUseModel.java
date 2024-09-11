package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云测设备能力使用
 *
 * @author auto create
 * @since 1.0, 2023-10-16 17:27:32
 */
public class AlipayCloudDevopsBaseUseModel extends AlipayObject {

	private static final long serialVersionUID = 4796851653642299818L;

	/**
	 * 使用条件
	 */
	@ApiField("condition")
	private String condition;

	/**
	 * 缺陷列表
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 子编码
	 */
	@ApiField("sub_code")
	private String subCode;

	/**
	 * 蚂蚁数科
	 */
	@ApiField("sub_name")
	private String subName;

	public String getCondition() {
		return this.condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getSubCode() {
		return this.subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return this.subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}

}
