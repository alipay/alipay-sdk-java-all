package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户订阅状态
 *
 * @author auto create
 * @since 1.0, 2023-02-06 23:24:26
 */
public class MedicalUserMessageSubcriptionInfo extends AlipayObject {

	private static final long serialVersionUID = 4545957677295556694L;

	/**
	 * 行业类型id，医保动账5
	 */
	@ApiField("industry_type_id")
	private Long industryTypeId;

	/**
	 * 开放id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1已订阅，0未订阅
	 */
	@ApiField("state")
	private Long state;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Long getIndustryTypeId() {
		return this.industryTypeId;
	}
	public void setIndustryTypeId(Long industryTypeId) {
		this.industryTypeId = industryTypeId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getState() {
		return this.state;
	}
	public void setState(Long state) {
		this.state = state;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
