package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * POI信息
 *
 * @author auto create
 * @since 1.0, 2018-12-26 15:33:52
 */
public class NearbyAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 2462268561984228399L;

	/**
	 * 审核状态,AUDIT-审核中，AUDIT_SUCCESS-审核通过，AUDIT_FAIL-审核不通过，AUDIT_CANCEL-取消审核
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 营业执照号
	 */
	@ApiField("certificate")
	private String certificate;

	/**
	 * 地点展示状态,UNDISPLAYED-未展示,DISPLAYED-已展示
	 */
	@ApiField("display_status")
	private String displayStatus;

	/**
	 * 审核失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 地址
	 */
	@ApiField("poi_address")
	private String poiAddress;

	/**
	 * poi id，地理位置标记信息
	 */
	@ApiField("poi_id")
	private String poiId;

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getCertificate() {
		return this.certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getDisplayStatus() {
		return this.displayStatus;
	}
	public void setDisplayStatus(String displayStatus) {
		this.displayStatus = displayStatus;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getPoiAddress() {
		return this.poiAddress;
	}
	public void setPoiAddress(String poiAddress) {
		this.poiAddress = poiAddress;
	}

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

}
