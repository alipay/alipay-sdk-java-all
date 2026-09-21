package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云陪诊云配药卡
 *
 * @author auto create
 * @since 1.0, 2026-09-17 14:27:55
 */
public class YpzCloudDispenseMedicineCardOne extends AlipayObject {

	private static final long serialVersionUID = 6242777963419978879L;

	/**
	 * 主按钮跳转地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 卡片状态
	 */
	@ApiField("status")
	private String status;

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
