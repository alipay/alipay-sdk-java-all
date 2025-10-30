package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构信号对象
 *
 * @author auto create
 * @since 1.0, 2025-05-23 11:02:43
 */
public class InstSigConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 3586414559492361796L;

	/**
	 * 行业指数代码，非枚举类型
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 原始因子值，无单位，主要是描述信号强弱的绝对数据
	 */
	@ApiField("value_factor")
	private String valueFactor;

	/**
	 * 行业排名，排名取1-45个行业，后续会随着行业增加或者减少而改变这个数字
	 */
	@ApiField("value_rank")
	private Long valueRank;

	/**
	 * 上车信号标识，绝对值
	 */
	@ApiField("value_sig")
	private String valueSig;

	public String getIndustryCode() {
		return this.industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getValueFactor() {
		return this.valueFactor;
	}
	public void setValueFactor(String valueFactor) {
		this.valueFactor = valueFactor;
	}

	public Long getValueRank() {
		return this.valueRank;
	}
	public void setValueRank(Long valueRank) {
		this.valueRank = valueRank;
	}

	public String getValueSig() {
		return this.valueSig;
	}
	public void setValueSig(String valueSig) {
		this.valueSig = valueSig;
	}

}
