package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序类目模型
 *
 * @author auto create
 * @since 1.0, 2018-12-25 18:05:38
 */
public class MiniAppCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 6536739586283893658L;

	/**
	 * 一级类目id
	 */
	@ApiField("first_category_id")
	private String firstCategoryId;

	/**
	 * 一级类目名称
	 */
	@ApiField("first_category_name")
	private String firstCategoryName;

	/**
	 * 二级类目id
	 */
	@ApiField("second_category_id")
	private String secondCategoryId;

	/**
	 * 二级类目名称
	 */
	@ApiField("second_category_name")
	private String secondCategoryName;

	public String getFirstCategoryId() {
		return this.firstCategoryId;
	}
	public void setFirstCategoryId(String firstCategoryId) {
		this.firstCategoryId = firstCategoryId;
	}

	public String getFirstCategoryName() {
		return this.firstCategoryName;
	}
	public void setFirstCategoryName(String firstCategoryName) {
		this.firstCategoryName = firstCategoryName;
	}

	public String getSecondCategoryId() {
		return this.secondCategoryId;
	}
	public void setSecondCategoryId(String secondCategoryId) {
		this.secondCategoryId = secondCategoryId;
	}

	public String getSecondCategoryName() {
		return this.secondCategoryName;
	}
	public void setSecondCategoryName(String secondCategoryName) {
		this.secondCategoryName = secondCategoryName;
	}

}
