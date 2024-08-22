package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询申请单详情的入参
 *
 * @author auto create
 * @since 1.0, 2023-07-25 10:39:40
 */
public class SearchOrderRequest extends AlipayObject {

	private static final long serialVersionUID = 5569725373429752832L;

	/**
	 * 申请单id
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达
	 */
	@ApiField("apply_type")
	private String applyType;

	/**
	 * 品牌的模板id ONE_WITH_TWO：一拖二、DEFAULT：一拖四
	 */
	@ApiField("brand_template_id")
	private String brandTemplateId;

	/**
	 * 服务code
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务的类型默认使用小程序 SP_MINI_APP 小程序 SP_PUBLIC_APP 生活号
	 */
	@ApiField("spec_code")
	private String specCode;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyType() {
		return this.applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getBrandTemplateId() {
		return this.brandTemplateId;
	}
	public void setBrandTemplateId(String brandTemplateId) {
		this.brandTemplateId = brandTemplateId;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

}
