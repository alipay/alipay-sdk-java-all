package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * A+区域同步
 *
 * @author auto create
 * @since 1.0, 2022-11-21 18:52:56
 */
public class AlipayOverseasTravelIntlAreaSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1859324569758465425L;

	/**
	 * 区域类型
	 */
	@ApiField("area_info")
	private AreaDTO areaInfo;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public AreaDTO getAreaInfo() {
		return this.areaInfo;
	}
	public void setAreaInfo(AreaDTO areaInfo) {
		this.areaInfo = areaInfo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
