package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 账户使用条件
 *
 * @author auto create
 * @since 1.0, 2026-04-01 11:13:46
 */
public class EcPayRestriction extends AlipayObject {

	private static final long serialVersionUID = 5273174122859711187L;

	/**
	 * 账户使用条件类型
	 */
	@ApiField("category")
	private String category;

	/**
	 * 账户使用范围限定。是企业码平台定义的费用类型，如差旅（ENT_TRAVEL）、外卖（TAKE_AWAY），更多类型请咨询业务
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
