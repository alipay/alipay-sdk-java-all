package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一码通用户密钥失效接口
 *
 * @author auto create
 * @since 1.0, 2024-05-17 14:37:42
 */
public class AlipayPayCodecAcodeCertExpireModel extends AlipayObject {

	private static final long serialVersionUID = 3223473132784921638L;

	/**
	 * 用户业务身份标识
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 机构类型
	 */
	@ApiField("institution_type")
	private String institutionType;

	/**
	 * 变更时间点，会失效该时间点之前的证书（Long型）
	 */
	@ApiField("time")
	private Long time;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getInstitutionType() {
		return this.institutionType;
	}
	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}

	public Long getTime() {
		return this.time;
	}
	public void setTime(Long time) {
		this.time = time;
	}

}
