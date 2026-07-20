package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务项限制使用规则
 *
 * @author auto create
 * @since 1.0, 2026-06-12 14:54:45
 */
public class ServiceItemRestrictRule extends AlipayObject {

	private static final long serialVersionUID = 5889731679997157447L;

	/**
	 * 限制类型，手机号、证件类型、证件号
	 */
	@ApiField("restrict_type")
	private String restrictType;

	/**
	 * 服务项ID
	 */
	@ApiField("service_item_id")
	private String serviceItemId;

	/**
	 * 用户证件号
	 */
	@ApiListField("user_cert_no_list")
	@ApiField("string")
	private List<String> userCertNoList;

	/**
	 * 证件类型
	 */
	@ApiListField("user_cert_type_list")
	@ApiField("string")
	private List<String> userCertTypeList;

	/**
	 * 用户手机号
	 */
	@ApiListField("user_phone_no_list")
	@ApiField("string")
	private List<String> userPhoneNoList;

	public String getRestrictType() {
		return this.restrictType;
	}
	public void setRestrictType(String restrictType) {
		this.restrictType = restrictType;
	}

	public String getServiceItemId() {
		return this.serviceItemId;
	}
	public void setServiceItemId(String serviceItemId) {
		this.serviceItemId = serviceItemId;
	}

	public List<String> getUserCertNoList() {
		return this.userCertNoList;
	}
	public void setUserCertNoList(List<String> userCertNoList) {
		this.userCertNoList = userCertNoList;
	}

	public List<String> getUserCertTypeList() {
		return this.userCertTypeList;
	}
	public void setUserCertTypeList(List<String> userCertTypeList) {
		this.userCertTypeList = userCertTypeList;
	}

	public List<String> getUserPhoneNoList() {
		return this.userPhoneNoList;
	}
	public void setUserPhoneNoList(List<String> userPhoneNoList) {
		this.userPhoneNoList = userPhoneNoList;
	}

}
