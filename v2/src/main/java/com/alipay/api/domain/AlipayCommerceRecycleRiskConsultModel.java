package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收行业风险咨询
 *
 * @author auto create
 * @since 1.0, 2025-08-14 14:39:06
 */
public class AlipayCommerceRecycleRiskConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3212928843571999989L;

	/**
	 * 完整地址含省市区
	 */
	@ApiField("address")
	private String address;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 服务类目code
	 */
	@ApiField("service_category_code")
	private String serviceCategoryCode;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getServiceCategoryCode() {
		return this.serviceCategoryCode;
	}
	public void setServiceCategoryCode(String serviceCategoryCode) {
		this.serviceCategoryCode = serviceCategoryCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
