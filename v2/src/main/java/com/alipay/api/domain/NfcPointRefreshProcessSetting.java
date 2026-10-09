package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 进度条配置
 *
 * @author auto create
 * @since 1.0, 2026-10-09 15:27:54
 */
public class NfcPointRefreshProcessSetting extends AlipayObject {

	private static final long serialVersionUID = 2556397737495449447L;

	/**
	 * null
	 */
	@ApiListField("show_times")
	@ApiField("nfc_point_refresh_show_time")
	private List<NfcPointRefreshShowTime> showTimes;

	/**
	 * 进度展示方式：percent为百分比，count为份数
	 */
	@ApiField("show_type")
	private String showType;

	public List<NfcPointRefreshShowTime> getShowTimes() {
		return this.showTimes;
	}
	public void setShowTimes(List<NfcPointRefreshShowTime> showTimes) {
		this.showTimes = showTimes;
	}

	public String getShowType() {
		return this.showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}

}
