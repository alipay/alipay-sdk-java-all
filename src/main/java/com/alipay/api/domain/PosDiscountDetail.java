package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos优惠明细信息
 *
 * @author auto create
 * @since 1.0, 2018-03-20 18:20:26
 */
public class PosDiscountDetail extends AlipayObject {

	private static final long serialVersionUID = 2672787883221714485L;

	/**
	 * 优惠名称
	 */
	@ApiField("discount_name")
	private String discountName;

	/**
	 * 优惠类型
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 扩展信息，存储优惠的详细模型。json对象格式，key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商家出资优惠金额，以元为单位，精确到分
	 */
	@ApiField("mrt_discount")
	private String mrtDiscount;

	/**
	 * 平台出资优惠金额，以元为单位，精确到分
	 */
	@ApiField("rt_discount")
	private String rtDiscount;

	public String getDiscountName() {
		return this.discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMrtDiscount() {
		return this.mrtDiscount;
	}
	public void setMrtDiscount(String mrtDiscount) {
		this.mrtDiscount = mrtDiscount;
	}

	public String getRtDiscount() {
		return this.rtDiscount;
	}
	public void setRtDiscount(String rtDiscount) {
		this.rtDiscount = rtDiscount;
	}

}
