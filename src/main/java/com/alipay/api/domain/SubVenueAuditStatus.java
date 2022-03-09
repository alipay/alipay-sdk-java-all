package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子场馆审核状态
 *
 * @author auto create
 * @since 1.0, 2021-04-01 15:36:15
 */
public class SubVenueAuditStatus extends AlipayObject {

	private static final long serialVersionUID = 3455317356479529258L;

	/**
	 * 服务商对应的子场馆ID
	 */
	@ApiField("out_sub_venue_id")
	private String outSubVenueId;

	/**
	 * 支付宝对应的子场馆ID
	 */
	@ApiField("sub_venue_id")
	private String subVenueId;

	/**
	 * 场馆当前状态 安全审核中：infosec-audit 安全审核不通过：infosec-unpass 云验收中： cloud-audit 云验收不通过： cloud-unpass 上架： online 下架： offline 人工下架： manual-offline
	 */
	@ApiField("sub_venue_status")
	private String subVenueStatus;

	public String getOutSubVenueId() {
		return this.outSubVenueId;
	}
	public void setOutSubVenueId(String outSubVenueId) {
		this.outSubVenueId = outSubVenueId;
	}

	public String getSubVenueId() {
		return this.subVenueId;
	}
	public void setSubVenueId(String subVenueId) {
		this.subVenueId = subVenueId;
	}

	public String getSubVenueStatus() {
		return this.subVenueStatus;
	}
	public void setSubVenueStatus(String subVenueStatus) {
		this.subVenueStatus = subVenueStatus;
	}

}
