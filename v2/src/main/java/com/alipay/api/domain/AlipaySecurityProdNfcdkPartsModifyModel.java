package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC碰一下车辆换件时设备信息修改
 *
 * @author auto create
 * @since 1.0, 2025-10-28 09:59:02
 */
public class AlipaySecurityProdNfcdkPartsModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5428122576696234411L;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 车辆N模块的tagId
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 车辆NFC模组的sn号
	 */
	@ApiField("tag_sn")
	private String tagSn;

	/**
	 * 中控设备唯一标识
	 */
	@ApiField("tuid")
	private String tuid;

	/**
	 * 车辆的车架号
	 */
	@ApiField("vin")
	private String vin;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getTagSn() {
		return this.tagSn;
	}
	public void setTagSn(String tagSn) {
		this.tagSn = tagSn;
	}

	public String getTuid() {
		return this.tuid;
	}
	public void setTuid(String tuid) {
		this.tuid = tuid;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
