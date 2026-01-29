package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 期数、免息/折扣/商家贴息信息
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:19:59
 */
public class InstallmentIntDiscountModel extends AlipayObject {

	private static final long serialVersionUID = 2321727978552861493L;

	/**
	 * 是否有折扣，不包括全部免息
	 */
	@ApiField("has_int_discount")
	private Boolean hasIntDiscount;

	/**
	 * 是否有免息，仅表示全部免息，不包括部分折扣
	 */
	@ApiField("has_int_free")
	private Boolean hasIntFree;

	/**
	 * 分期期数
	 */
	@ApiField("install_num")
	private String installNum;

	public Boolean getHasIntDiscount() {
		return this.hasIntDiscount;
	}
	public void setHasIntDiscount(Boolean hasIntDiscount) {
		this.hasIntDiscount = hasIntDiscount;
	}

	public Boolean getHasIntFree() {
		return this.hasIntFree;
	}
	public void setHasIntFree(Boolean hasIntFree) {
		this.hasIntFree = hasIntFree;
	}

	public String getInstallNum() {
		return this.installNum;
	}
	public void setInstallNum(String installNum) {
		this.installNum = installNum;
	}

}
