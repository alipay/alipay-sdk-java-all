package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费送数据
 *
 * @author auto create
 * @since 1.0, 2019-01-23 20:29:23
 */
public class MallConsumeVoucher extends AlipayObject {

	private static final long serialVersionUID = 6365665558987442377L;

	/**
	 * 券品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 消费送活动id
	 */
	@ApiField("source_camp")
	private String sourceCamp;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券面额或者折扣
	 */
	@ApiField("worth_value")
	private String worthValue;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getSourceCamp() {
		return this.sourceCamp;
	}
	public void setSourceCamp(String sourceCamp) {
		this.sourceCamp = sourceCamp;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public String getWorthValue() {
		return this.worthValue;
	}
	public void setWorthValue(String worthValue) {
		this.worthValue = worthValue;
	}

}
