package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ItemAttrGroupVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-24 14:56:53
 */
public class AlipayOpenAppItemTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4765891641397436917L;

	/** 
	 * 属性分组
	 */
	@ApiField("attr")
	private ItemAttrGroupVO attr;

	/** 
	 * 商品类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 商品类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	public void setAttr(ItemAttrGroupVO attr) {
		this.attr = attr;
	}
	public ItemAttrGroupVO getAttr( ) {
		return this.attr;
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

}
