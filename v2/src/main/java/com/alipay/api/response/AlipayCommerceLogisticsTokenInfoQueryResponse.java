package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserAddressInfoObj;
import com.alipay.api.domain.ServiceInfoObj;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.token.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:06:45
 */
public class AlipayCommerceLogisticsTokenInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5621186363255634273L;

	/** 
	 * 收件信息
	 */
	@ApiField("receive_info")
	private UserAddressInfoObj receiveInfo;

	/** 
	 * 寄件信息
	 */
	@ApiField("send_info")
	private UserAddressInfoObj sendInfo;

	/** 
	 * 服务信息
	 */
	@ApiField("service_info")
	private ServiceInfoObj serviceInfo;

	public void setReceiveInfo(UserAddressInfoObj receiveInfo) {
		this.receiveInfo = receiveInfo;
	}
	public UserAddressInfoObj getReceiveInfo( ) {
		return this.receiveInfo;
	}

	public void setSendInfo(UserAddressInfoObj sendInfo) {
		this.sendInfo = sendInfo;
	}
	public UserAddressInfoObj getSendInfo( ) {
		return this.sendInfo;
	}

	public void setServiceInfo(ServiceInfoObj serviceInfo) {
		this.serviceInfo = serviceInfo;
	}
	public ServiceInfoObj getServiceInfo( ) {
		return this.serviceInfo;
	}

}
