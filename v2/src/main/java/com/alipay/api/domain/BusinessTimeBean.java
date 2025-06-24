package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业时间对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:36
 */
public class BusinessTimeBean extends AlipayObject {

	private static final long serialVersionUID = 3153951769235695849L;

	/**
	 * 停止营业时间
	 */
	@ApiField("close_time")
	private String closeTime;

	/**
	 * 开始营业时间
	 */
	@ApiField("open_time")
	private String openTime;

	public String getCloseTime() {
		return this.closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public String getOpenTime() {
		return this.openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

}
