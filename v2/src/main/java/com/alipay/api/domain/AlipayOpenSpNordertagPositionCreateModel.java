package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下创建点位信息
 *
 * @author auto create
 * @since 1.0, 2025-06-03 15:09:44
 */
public class AlipayOpenSpNordertagPositionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7517359727638641718L;

	/**
	 * 详细地址，如果省市区为空，则这里必须带有省市区信息
	 */
	@ApiField("address")
	private String address;

	/**
	 * 所在城市名称
	 */
	@ApiField("city")
	private String city;

	/**
	 * 详细地址所在区县
	 */
	@ApiField("district")
	private String district;

	/**
	 * 点位的品牌、场景、场所信息
	 */
	@ApiField("ext_info")
	private NorderTagPositionExtInfo extInfo;

	/**
	 * 对点位进行的操作
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 点位标识，更新点位信息时必填，取值方式：创建点位时候返回
	 */
	@ApiField("position_id")
	private String positionId;

	/**
	 * 省份中文名称
	 */
	@ApiField("province")
	private String province;

	/**
	 * 点位名称
	 */
	@ApiField("tag_position_name")
	private String tagPositionName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public NorderTagPositionExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(NorderTagPositionExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getPositionId() {
		return this.positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getTagPositionName() {
		return this.tagPositionName;
	}
	public void setTagPositionName(String tagPositionName) {
		this.tagPositionName = tagPositionName;
	}

}
