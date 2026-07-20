package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 端权限字段
 *
 * @author auto create
 * @since 1.0, 2026-07-20 09:58:53
 */
public class SystemPermissionPrivacyFields extends AlipayObject {

	private static final long serialVersionUID = 4491749915587483577L;

	/**
	 * 字段的code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 和code匹配传入，具体匹配关系及枚举请参见文档
	 */
	@ApiField("name")
	private String name;

	/**
	 * 向用户说明获取该端权限的必要性
	 */
	@ApiField("purpose")
	private String purpose;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return this.purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

}
