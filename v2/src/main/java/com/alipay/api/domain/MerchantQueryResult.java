package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户信息查询结果
 *
 * @author auto create
 * @since 1.0, 2021-12-07 09:37:22
 */
public class MerchantQueryResult extends AlipayObject {

	private static final long serialVersionUID = 2573496889715193258L;

	/**
	 * 商户的别名，用户商户对客展示的名称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 商户认证证件号，企业营业执照号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 市名称
	 */
	@ApiField("city")
	private String city;

	/**
	 * 商户经营详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 区县名称
	 */
	@ApiField("distinct")
	private String distinct;

	/**
	 * 商户新版mcc code
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 描述商户类型，个人-P/企业-B
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 商户认证名称信息
	 */
	@ApiField("name")
	private String name;

	/**
	 * 省名称
	 */
	@ApiField("province")
	private String province;

	public String getAliasName() {
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getDistinct() {
		return this.distinct;
	}
	public void setDistinct(String distinct) {
		this.distinct = distinct;
	}

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
