package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ItemAttrGroupVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.localitem.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-15 16:12:01
 */
public class AlipayOpenAppLocalitemTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4274528754436552815L;

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

	/** 
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

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

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemType( ) {
		return this.itemType;
	}

}
