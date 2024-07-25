package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小区服务申请上线接口
 *
 * @author auto create
 * @since 1.0, 2024-06-28 10:00:07
 */
public class AlipayEbppCommunityServiceOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 2446312473812922569L;

	/**
	 * 小区短名
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
