package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下陪诊卡
 *
 * @author auto create
 * @since 1.0, 2026-05-18 17:42:49
 */
public class YpzMedAccompanyCardOne extends AlipayObject {

	private static final long serialVersionUID = 5484886199888656482L;

	/**
	 * 陪诊师名字
	 */
	@ApiField("attendant_name")
	private String attendantName;

	/**
	 * 主按钮url
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 左按钮url
	 */
	@ApiField("redirect_url_left")
	private String redirectUrlLeft;

	/**
	 * 右按钮url
	 */
	@ApiField("redirect_url_right")
	private String redirectUrlRight;

	/**
	 * 卡片状态
	 */
	@ApiField("status")
	private String status;

	public String getAttendantName() {
		return this.attendantName;
	}
	public void setAttendantName(String attendantName) {
		this.attendantName = attendantName;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getRedirectUrlLeft() {
		return this.redirectUrlLeft;
	}
	public void setRedirectUrlLeft(String redirectUrlLeft) {
		this.redirectUrlLeft = redirectUrlLeft;
	}

	public String getRedirectUrlRight() {
		return this.redirectUrlRight;
	}
	public void setRedirectUrlRight(String redirectUrlRight) {
		this.redirectUrlRight = redirectUrlRight;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
