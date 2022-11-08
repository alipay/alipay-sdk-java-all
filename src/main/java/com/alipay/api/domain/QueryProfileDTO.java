package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 档案查询结果DTO
 *
 * @author auto create
 * @since 1.0, 2022-01-06 11:19:04
 */
public class QueryProfileDTO extends AlipayObject {

	private static final long serialVersionUID = 1616259388443937191L;

	/**
	 * 是否有档案
	 */
	@ApiField("has_profile")
	private Boolean hasProfile;

	/**
	 * 识别标识
	 */
	@ApiField("mark_id")
	private String markId;

	public Boolean getHasProfile() {
		return this.hasProfile;
	}
	public void setHasProfile(Boolean hasProfile) {
		this.hasProfile = hasProfile;
	}

	public String getMarkId() {
		return this.markId;
	}
	public void setMarkId(String markId) {
		this.markId = markId;
	}

}
