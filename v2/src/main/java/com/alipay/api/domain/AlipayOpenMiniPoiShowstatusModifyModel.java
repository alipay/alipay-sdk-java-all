package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序修改POI展示状态
 *
 * @author auto create
 * @since 1.0, 2023-01-09 11:43:17
 */
public class AlipayOpenMiniPoiShowstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8668242348696961543L;

	/**
	 * poi id，地理位置标记信息
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 是否展示 0 不展示 1展示
	 */
	@ApiField("show_status")
	private String showStatus;

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public String getShowStatus() {
		return this.showStatus;
	}
	public void setShowStatus(String showStatus) {
		this.showStatus = showStatus;
	}

}
