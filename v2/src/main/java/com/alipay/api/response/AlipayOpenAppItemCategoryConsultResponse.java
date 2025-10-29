package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.category.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-24 13:35:52
 */
public class AlipayOpenAppItemCategoryConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6462552112543431712L;

	/** 
	 * 类目层级
	 */
	@ApiField("cat_level")
	private Long catLevel;

	/** 
	 * 类目不可用错误码
	 */
	@ApiField("category_error_code")
	private String categoryErrorCode;

	/** 
	 * 类目不可用原因。例如：无权限；无行业白名单邀约；资质未开通；资质已开通；资质审核中；资质审核驳回；小程序的类目经营范围内没有这些商品类目；未查询到类目。
	 */
	@ApiField("category_error_desc")
	private String categoryErrorDesc;

	/** 
	 * 商品类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 商品类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/** 
	 * 类目状态。true：类目可用；false：类目不可用
	 */
	@ApiField("status")
	private Boolean status;

	public void setCatLevel(Long catLevel) {
		this.catLevel = catLevel;
	}
	public Long getCatLevel( ) {
		return this.catLevel;
	}

	public void setCategoryErrorCode(String categoryErrorCode) {
		this.categoryErrorCode = categoryErrorCode;
	}
	public String getCategoryErrorCode( ) {
		return this.categoryErrorCode;
	}

	public void setCategoryErrorDesc(String categoryErrorDesc) {
		this.categoryErrorDesc = categoryErrorDesc;
	}
	public String getCategoryErrorDesc( ) {
		return this.categoryErrorDesc;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryName( ) {
		return this.categoryName;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
