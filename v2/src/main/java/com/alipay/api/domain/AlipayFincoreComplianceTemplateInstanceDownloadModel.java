package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实例下载
 *
 * @author auto create
 * @since 1.0, 2023-08-31 19:40:53
 */
public class AlipayFincoreComplianceTemplateInstanceDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 4622398127229872384L;

	/**
	 * 链接持续时间（分钟）
	 */
	@ApiField("duration")
	private Long duration;

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
