package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房小区信息详情
 *
 * @author auto create
 * @since 1.0, 2025-07-14 11:04:58
 */
public class AlipayOpenAppRentroomAreaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1116635473276293936L;

	/**
	 * 小区ID，通过租房小区信息提报接口返参获取
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 商户侧对应的小区唯一编码，由商户自定义
	 */
	@ApiField("out_area_id")
	private String outAreaId;

	public String getAreaId() {
		return this.areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getOutAreaId() {
		return this.outAreaId;
	}
	public void setOutAreaId(String outAreaId) {
		this.outAreaId = outAreaId;
	}

}
