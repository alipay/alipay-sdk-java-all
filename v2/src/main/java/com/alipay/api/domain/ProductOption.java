package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收下单产品选项
 *
 * @author auto create
 * @since 1.0, 2024-04-19 17:29:41
 */
public class ProductOption extends AlipayObject {

	private static final long serialVersionUID = 1583172299226373253L;

	/**
	 * 产品选项区间最大数量
	 */
	@ApiField("max_unit")
	private Long maxUnit;

	/**
	 * 产品选项区间最小数量
	 */
	@ApiField("min_unit")
	private Long minUnit;

	/**
	 * 产品定量区间选项code
	 */
	@ApiField("option_code")
	private String optionCode;

	/**
	 * 产品选项副标题，所选定量区间的重量
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 选项标题，对应产品定量区间
	 */
	@ApiField("title")
	private String title;

	public Long getMaxUnit() {
		return this.maxUnit;
	}
	public void setMaxUnit(Long maxUnit) {
		this.maxUnit = maxUnit;
	}

	public Long getMinUnit() {
		return this.minUnit;
	}
	public void setMinUnit(Long minUnit) {
		this.minUnit = minUnit;
	}

	public String getOptionCode() {
		return this.optionCode;
	}
	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
