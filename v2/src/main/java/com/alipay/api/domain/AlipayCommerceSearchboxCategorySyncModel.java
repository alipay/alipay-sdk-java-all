package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业搜索BOX商品类目同步
 *
 * @author auto create
 * @since 1.0, 2024-07-23 15:30:15
 */
public class AlipayCommerceSearchboxCategorySyncModel extends AlipayObject {

	private static final long serialVersionUID = 1881319953921122247L;

	/**
	 * 品牌box业务类型，业务约定值
	 */
	@ApiField("box_biz_type")
	private String boxBizType;

	/**
	 * 商户侧类目唯一键，支持字母数字及下划线，提报后不允许修改，类目变更可通过下线旧类目并新增新类目实现
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * logo图片素材ID，通过图片上传接口获取，不允许使用外部url
	 */
	@ApiField("category_logo")
	private String categoryLogo;

	/**
	 * 运营管理后台使用，不对客展示
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 正序排列，不传默认为最低优先级；默认排序仅在其他排序规则不生效时使用，规则参考业务接入文档
	 */
	@ApiField("category_order")
	private Long categoryOrder;

	/**
	 * 对客展示用，传参规则见业务对接文档
	 */
	@ApiField("category_title")
	private String categoryTitle;

	public String getBoxBizType() {
		return this.boxBizType;
	}
	public void setBoxBizType(String boxBizType) {
		this.boxBizType = boxBizType;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryLogo() {
		return this.categoryLogo;
	}
	public void setCategoryLogo(String categoryLogo) {
		this.categoryLogo = categoryLogo;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Long getCategoryOrder() {
		return this.categoryOrder;
	}
	public void setCategoryOrder(Long categoryOrder) {
		this.categoryOrder = categoryOrder;
	}

	public String getCategoryTitle() {
		return this.categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

}
