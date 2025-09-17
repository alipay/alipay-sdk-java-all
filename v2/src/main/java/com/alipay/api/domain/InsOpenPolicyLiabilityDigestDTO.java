package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险场景开放平台保单责任摘要
 *
 * @author auto create
 * @since 1.0, 2025-06-04 10:02:20
 */
public class InsOpenPolicyLiabilityDigestDTO extends AlipayObject {

	private static final long serialVersionUID = 8365882121446111737L;

	/**
	 * 蚂蚁保某个保险产品的责任名称
	 */
	@ApiField("liability_name")
	private String liabilityName;

	/**
	 * 蚂蚁保分配的某个保险产品的责任编号
	 */
	@ApiField("liability_no")
	private String liabilityNo;

	/**
	 * 责任保额，单位分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	public String getLiabilityName() {
		return this.liabilityName;
	}
	public void setLiabilityName(String liabilityName) {
		this.liabilityName = liabilityName;
	}

	public String getLiabilityNo() {
		return this.liabilityNo;
	}
	public void setLiabilityNo(String liabilityNo) {
		this.liabilityNo = liabilityNo;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
