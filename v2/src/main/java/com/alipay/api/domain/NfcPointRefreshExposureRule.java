package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 曝光规则
 *
 * @author auto create
 * @since 1.0, 2026-10-14 11:22:57
 */
public class NfcPointRefreshExposureRule extends AlipayObject {

	private static final long serialVersionUID = 5352756381577987268L;

	/**
	 * 以刷新后的值决定是否展示进度条
	 */
	@ApiField("process_open")
	private Boolean processOpen;

	public Boolean getProcessOpen() {
		return this.processOpen;
	}
	public void setProcessOpen(Boolean processOpen) {
		this.processOpen = processOpen;
	}

}
