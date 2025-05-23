package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 责任数据
 *
 * @author auto create
 * @since 1.0, 2020-06-28 19:21:15
 */
public class Liability extends AlipayObject {

	private static final long serialVersionUID = 3754322514879858392L;

	/**
	 * 是否投保不计免赔，0-否，1-是
	 */
	@ApiField("iop")
	private String iop;

	/**
	 * 标准责任编码
	 */
	@ApiField("liability_no")
	private String liabilityNo;

	/**
	 * 保额，单位分(分金额类的保额和枚举类的保额，注意参考数据字典)
	 */
	@ApiField("sum_insured")
	private String sumInsured;

	public String getIop() {
		return this.iop;
	}
	public void setIop(String iop) {
		this.iop = iop;
	}

	public String getLiabilityNo() {
		return this.liabilityNo;
	}
	public void setLiabilityNo(String liabilityNo) {
		this.liabilityNo = liabilityNo;
	}

	public String getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}

}
