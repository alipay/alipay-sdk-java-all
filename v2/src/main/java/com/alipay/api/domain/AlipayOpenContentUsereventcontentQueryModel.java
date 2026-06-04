package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户事件内容查询
 *
 * @author auto create
 * @since 1.0, 2026-05-26 13:47:45
 */
public class AlipayOpenContentUsereventcontentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2825713558288949489L;

	/**
	 * 请求唯一标识，用于全链路追踪，UUID 格式
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 厂商触发事件信息
	 */
	@ApiField("smartphone_vendors_event_info")
	private SmartphoneVendorsEventInfo smartphoneVendorsEventInfo;

	/**
	 * 手机厂商用户唯一标识
	 */
	@ApiField("smartphone_vendors_user_identity")
	private SmartphoneVendorsUserIdentity smartphoneVendorsUserIdentity;

	/**
	 * 手机厂商厂商标识
	 */
	@ApiField("vendor")
	private String vendor;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SmartphoneVendorsEventInfo getSmartphoneVendorsEventInfo() {
		return this.smartphoneVendorsEventInfo;
	}
	public void setSmartphoneVendorsEventInfo(SmartphoneVendorsEventInfo smartphoneVendorsEventInfo) {
		this.smartphoneVendorsEventInfo = smartphoneVendorsEventInfo;
	}

	public SmartphoneVendorsUserIdentity getSmartphoneVendorsUserIdentity() {
		return this.smartphoneVendorsUserIdentity;
	}
	public void setSmartphoneVendorsUserIdentity(SmartphoneVendorsUserIdentity smartphoneVendorsUserIdentity) {
		this.smartphoneVendorsUserIdentity = smartphoneVendorsUserIdentity;
	}

	public String getVendor() {
		return this.vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
