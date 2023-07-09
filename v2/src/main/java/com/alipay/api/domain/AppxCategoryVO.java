package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目信息VO
 *
 * @author auto create
 * @since 1.0, 2023-05-22 17:35:25
 */
public class AppxCategoryVO extends AlipayObject {

	private static final long serialVersionUID = 7566422882848264967L;

	/**
	 * 类目编号
	 */
	@ApiField("cat_id")
	private String catId;

	/**
	 * 类目层级
	 */
	@ApiField("cat_level")
	private Long catLevel;

	/**
	 * 类目名称
	 */
	@ApiField("cat_name")
	private String catName;

	/**
	 * 父类目编号
	 */
	@ApiField("f_cat_id")
	private String fCatId;

	public String getCatId() {
		return this.catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}

	public Long getCatLevel() {
		return this.catLevel;
	}
	public void setCatLevel(Long catLevel) {
		this.catLevel = catLevel;
	}

	public String getCatName() {
		return this.catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getfCatId() {
		return this.fCatId;
	}
	public void setfCatId(String fCatId) {
		this.fCatId = fCatId;
	}

}
