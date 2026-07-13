package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组合项子对象
 *
 * @author auto create
 * @since 1.0, 2026-04-23 16:10:16
 */
public class ExaminationPackageItem extends AlipayObject {

	private static final long serialVersionUID = 7385837471571693728L;

	/**
	 * 主要指标
	 */
	@ApiField("indicators")
	private String indicators;

	/**
	 * 标品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 标品id
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 履约方编码
	 */
	@ApiField("vendor_code")
	private String vendorCode;

	public String getIndicators() {
		return this.indicators;
	}
	public void setIndicators(String indicators) {
		this.indicators = indicators;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getVendorCode() {
		return this.vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

}
