package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 达尔文指标结果
 *
 * @author auto create
 * @since 1.0, 2022-09-06 20:01:18
 */
public class TestResult extends AlipayObject {

	private static final long serialVersionUID = 3561349625218362426L;

	/**
	 * 置信区间下界
	 */
	@ApiField("c_i_lower")
	private String cILower;

	/**
	 * 置信区间上界
	 */
	@ApiField("c_i_upper")
	private String cIUpper;

	/**
	 * 差别
	 */
	@ApiField("diff")
	private String diff;

	/**
	 * p值
	 */
	@ApiField("p_val")
	private String pVal;

	/**
	 * 是否显著
	 */
	@ApiField("significance")
	private Boolean significance;

	/**
	 * 指标值
	 */
	@ApiField("value")
	private String value;

	public String getcILower() {
		return this.cILower;
	}
	public void setcILower(String cILower) {
		this.cILower = cILower;
	}

	public String getcIUpper() {
		return this.cIUpper;
	}
	public void setcIUpper(String cIUpper) {
		this.cIUpper = cIUpper;
	}

	public String getDiff() {
		return this.diff;
	}
	public void setDiff(String diff) {
		this.diff = diff;
	}

	public String getpVal() {
		return this.pVal;
	}
	public void setpVal(String pVal) {
		this.pVal = pVal;
	}

	public Boolean getSignificance() {
		return this.significance;
	}
	public void setSignificance(Boolean significance) {
		this.significance = significance;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
