package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IM群聊加入列表
 *
 * @author auto create
 * @since 1.0, 2025-01-06 14:56:42
 */
public class ServiceProvider extends AlipayObject {

	private static final long serialVersionUID = 1242535379253577115L;

	/**
	 * 服务提供者:医生/医助头像
	 */
	@ApiField("avatar_url")
	private String avatarUrl;

	/**
	 * 服务提供者:外部医生/医助id
	 */
	@ApiField("out_doctor_id")
	private String outDoctorId;

	/**
	 * 角色类型：医生、医助
	 */
	@ApiField("provider_type")
	private String providerType;

	/**
	 * 服务提供者:医生/医助姓名
	 */
	@ApiField("service_provider_name")
	private String serviceProviderName;

	public String getAvatarUrl() {
		return this.avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getOutDoctorId() {
		return this.outDoctorId;
	}
	public void setOutDoctorId(String outDoctorId) {
		this.outDoctorId = outDoctorId;
	}

	public String getProviderType() {
		return this.providerType;
	}
	public void setProviderType(String providerType) {
		this.providerType = providerType;
	}

	public String getServiceProviderName() {
		return this.serviceProviderName;
	}
	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}

}
