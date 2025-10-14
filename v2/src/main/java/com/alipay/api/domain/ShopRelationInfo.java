package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺关系信息
 *
 * @author auto create
 * @since 1.0, 2024-07-05 14:49:40
 */
public class ShopRelationInfo extends AlipayObject {

	private static final long serialVersionUID = 5258683512736614364L;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("credit_code")
	private String creditCode;

	/**
	 * 企信标识企业唯一ID
	 */
	@ApiField("ent_id")
	private String entId;

	/**
	 * 企业名称
	 */
	@ApiField("ent_name")
	private String entName;

	/**
	 * 店铺平台id
	 */
	@ApiField("platform_id")
	private String platformId;

	/**
	 * 店铺平台名称
	 */
	@ApiField("platform_name")
	private String platformName;

	/**
	 * 店铺平台类型
	 */
	@ApiField("platform_type_code")
	private String platformTypeCode;

	/**
	 * reg_no
	 */
	@ApiField("reg_no")
	private String regNo;

	/**
	 * 关系类型
	 */
	@ApiField("rel_type_code")
	private String relTypeCode;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 是否在营
	 */
	@ApiField("shop_status")
	private String shopStatus;

	/**
	 * 店铺类型
	 */
	@ApiField("shop_type")
	private String shopType;

	public String getCreditCode() {
		return this.creditCode;
	}
	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getEntId() {
		return this.entId;
	}
	public void setEntId(String entId) {
		this.entId = entId;
	}

	public String getEntName() {
		return this.entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getPlatformName() {
		return this.platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getPlatformTypeCode() {
		return this.platformTypeCode;
	}
	public void setPlatformTypeCode(String platformTypeCode) {
		this.platformTypeCode = platformTypeCode;
	}

	public String getRegNo() {
		return this.regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getRelTypeCode() {
		return this.relTypeCode;
	}
	public void setRelTypeCode(String relTypeCode) {
		this.relTypeCode = relTypeCode;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopStatus() {
		return this.shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

}
