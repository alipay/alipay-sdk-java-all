package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT商家自发券配置信息查询（蚂蚁自实现）
 *
 * @author auto create
 * @since 1.0, 2021-07-23 13:25:40
 */
public class AlipayOpenIotMembershipcouponQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4415118627229562976L;

	/**
	 * 小程序ID，来自于BPaaS注册的应用ID，取值通常和小程序的appId相同
	 */
	@ApiField("application_id")
	private String applicationId;

	/**
	 * ISV序列号，来自于ISV成员体系数据
	 */
	@ApiField("membership_id")
	private String membershipId;

	/**
	 * 服务码，来源于ISV自行配置，用于区分具体的服务类型
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 设备SN，与设备ID共同描述IoT设备信息
	 */
	@ApiField("sn")
	private String sn;

	public String getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getMembershipId() {
		return this.membershipId;
	}
	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
