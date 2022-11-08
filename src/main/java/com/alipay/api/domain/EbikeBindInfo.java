package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电动车绑定信息
 *
 * @author auto create
 * @since 1.0, 2022-07-13 11:51:59
 */
public class EbikeBindInfo extends AlipayObject {

	private static final long serialVersionUID = 6142777894972848175L;

	/**
	 * 电动车品牌唯一标识
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 电动车品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 智能电动车名称
	 */
	@ApiField("ebike_name")
	private String ebikeName;

	/**
	 * 智能电动车编号
	 */
	@ApiField("ebike_no")
	private String ebikeNo;

	/**
	 * 绑定状态
	 */
	@ApiField("is_bind")
	private Boolean isBind;

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getEbikeName() {
		return this.ebikeName;
	}
	public void setEbikeName(String ebikeName) {
		this.ebikeName = ebikeName;
	}

	public String getEbikeNo() {
		return this.ebikeNo;
	}
	public void setEbikeNo(String ebikeNo) {
		this.ebikeNo = ebikeNo;
	}

	public Boolean getIsBind() {
		return this.isBind;
	}
	public void setIsBind(Boolean isBind) {
		this.isBind = isBind;
	}

}
