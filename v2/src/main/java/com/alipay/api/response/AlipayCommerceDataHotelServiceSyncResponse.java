package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.hotel.service.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:57:56
 */
public class AlipayCommerceDataHotelServiceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3177667169569762363L;

	/** 
	 * 服务提报失败原因
	 */
	@ApiField("audit_msg")
	private String auditMsg;

	/** 
	 * 审核状态 [AUDIT_AGREE ：审核通过，AUDIT_REJECT：审核不通过， AUDITING：审核中]
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 酒店所在小程序的appid
	 */
	@ApiField("hotel_app_id")
	private String hotelAppId;

	/** 
	 * 支付宝侧维护的酒店id
	 */
	@ApiField("hotel_id")
	private String hotelId;

	/** 
	 * 服务商侧酒店id
	 */
	@ApiField("outer_hotel_id")
	private String outerHotelId;

	/** 
	 * 支付宝行业侧服务的标识
	 */
	@ApiField("service_id")
	private String serviceId;

	/** 
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/** 
	 * [ONLINE : 服务上架， OFFLINE ：服务下架]
	 */
	@ApiField("service_status")
	private String serviceStatus;

	/** 
	 * 服务连接，对应入参的service_url
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public void setAuditMsg(String auditMsg) {
		this.auditMsg = auditMsg;
	}
	public String getAuditMsg( ) {
		return this.auditMsg;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setHotelAppId(String hotelAppId) {
		this.hotelAppId = hotelAppId;
	}
	public String getHotelAppId( ) {
		return this.hotelAppId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelId( ) {
		return this.hotelId;
	}

	public void setOuterHotelId(String outerHotelId) {
		this.outerHotelId = outerHotelId;
	}
	public String getOuterHotelId( ) {
		return this.outerHotelId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceId( ) {
		return this.serviceId;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceName( ) {
		return this.serviceName;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public String getServiceStatus( ) {
		return this.serviceStatus;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	public String getServiceUrl( ) {
		return this.serviceUrl;
	}

}
