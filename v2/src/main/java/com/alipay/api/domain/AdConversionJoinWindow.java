package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转化归因窗口
 *
 * @author auto create
 * @since 1.0, 2026-07-23 10:32:54
 */
public class AdConversionJoinWindow extends AlipayObject {

	private static final long serialVersionUID = 6328649955423993898L;

	/**
	 * ONE_DAY("1d", "1天"),
THREE_DAY("3d", "3天"),
SEVEN_DAY("7d", "7天"),
FIFTEEN_DAY("15d", "15天");
	 */
	@ApiField("join_window_code")
	private String joinWindowCode;

	/**
	 * 名称
	 */
	@ApiField("join_window_name")
	private String joinWindowName;

	public String getJoinWindowCode() {
		return this.joinWindowCode;
	}
	public void setJoinWindowCode(String joinWindowCode) {
		this.joinWindowCode = joinWindowCode;
	}

	public String getJoinWindowName() {
		return this.joinWindowName;
	}
	public void setJoinWindowName(String joinWindowName) {
		this.joinWindowName = joinWindowName;
	}

}
