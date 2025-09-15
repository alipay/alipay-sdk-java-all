package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IpAddrLbsInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.info.ipaddrinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:05:14
 */
public class AlipaySecurityDataInfoIpaddrinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1653924268859266343L;

	/** 
	 * ip_addr_lbs_info:IP地址归属地对象。其中province为IP地址归属地的省，city为IP地址归属地的城市
	 */
	@ApiField("ip_addr_lbs_info")
	private IpAddrLbsInfo ipAddrLbsInfo;

	public void setIpAddrLbsInfo(IpAddrLbsInfo ipAddrLbsInfo) {
		this.ipAddrLbsInfo = ipAddrLbsInfo;
	}
	public IpAddrLbsInfo getIpAddrLbsInfo( ) {
		return this.ipAddrLbsInfo;
	}

}
