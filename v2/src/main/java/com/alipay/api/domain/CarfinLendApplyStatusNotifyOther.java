package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支用流程其他信息
 *
 * @author auto create
 * @since 1.0, 2026-05-15 17:14:56
 */
public class CarfinLendApplyStatusNotifyOther extends AlipayObject {

	private static final long serialVersionUID = 6161339532766544626L;

	/**
	 * 是否安装GPS
	 */
	@ApiField("needs_gps_installation")
	private Boolean needsGpsInstallation;

	public Boolean getNeedsGpsInstallation() {
		return this.needsGpsInstallation;
	}
	public void setNeedsGpsInstallation(Boolean needsGpsInstallation) {
		this.needsGpsInstallation = needsGpsInstallation;
	}

}
