package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实例下载
 *
 * @author auto create
 * @since 1.0, 2025-01-10 15:57:14
 */
public class AlipayFincoreComplianceTemplateInstanceDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 7481669145112132515L;

	/**
	 * 链接持续时间（分钟）
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 是否需要效验实例必填项，默认为否
	 */
	@ApiField("required_validate")
	private Boolean requiredValidate;

	/**
	 * 下载类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 实例唯一标识
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Boolean getRequiredValidate() {
		return this.requiredValidate;
	}
	public void setRequiredValidate(Boolean requiredValidate) {
		this.requiredValidate = requiredValidate;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
