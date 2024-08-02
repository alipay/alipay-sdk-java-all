package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序类目模型
 *
 * @author auto create
 * @since 1.0, 2023-07-21 10:33:18
 */
public class MiniAppCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 4544587311343988732L;

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

	/**
	 * 三级类目id，可空
	 */
	@ApiField("third_category_id")
	private String thirdCategoryId;

	/**
	 * 三级类目名称，可空
	 */
	@ApiField("third_category_name")
	private String thirdCategoryName;

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

	public String getThirdCategoryId() {
		return this.thirdCategoryId;
	}
	public void setThirdCategoryId(String thirdCategoryId) {
		this.thirdCategoryId = thirdCategoryId;
	}

	public String getThirdCategoryName() {
		return this.thirdCategoryName;
	}
	public void setThirdCategoryName(String thirdCategoryName) {
		this.thirdCategoryName = thirdCategoryName;
	}

}
