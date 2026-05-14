package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询检查或检验类目树列表
 *
 * @author auto create
 * @since 1.0, 2026-04-23 16:10:18
 */
public class AlipayCommerceMedicalExaminationCategorylistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2421649446364452965L;

	/**
	 * 类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 检查类目类型:CHECK_CATEGORY、 检验类目类型：INSPECTION_CATEGORY 不传，默认查全部
	 */
	@ApiField("category_state")
	private String categoryState;

	/**
	 * 类目状态
	 */
	@ApiField("category_type")
	private String categoryType;

	/**
	 * query_type 查询类型
? all：全部数据
? primary：按一级分类查询
? secondary：按二级分类查询
? three：按三级分类查询
	 */
	@ApiField("query_type")
	private String queryType;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryState() {
		return this.categoryState;
	}
	public void setCategoryState(String categoryState) {
		this.categoryState = categoryState;
	}

	public String getCategoryType() {
		return this.categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

}
