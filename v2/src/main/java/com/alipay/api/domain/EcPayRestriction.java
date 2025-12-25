package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 账户使用条件
 *
 * @author auto create
 * @since 1.0, 2025-11-28 10:24:41
 */
public class EcPayRestriction extends AlipayObject {

	private static final long serialVersionUID = 2535431453744454216L;

	/**
	 * 账户使用条件类型
	 */
	@ApiField("category")
	private String category;

	/**
	 * 账户使用范围限定
	 */
	@ApiListField("ranges")
	@ApiField("string")
	private List<String> ranges;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public List<String> getRanges() {
		return this.ranges;
	}
	public void setRanges(List<String> ranges) {
		this.ranges = ranges;
	}

}
