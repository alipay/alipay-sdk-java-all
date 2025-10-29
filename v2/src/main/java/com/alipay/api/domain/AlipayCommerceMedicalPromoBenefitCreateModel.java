package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阿里云商品新增同步接口
 *
 * @author auto create
 * @since 1.0, 2025-04-11 18:05:54
 */
public class AlipayCommerceMedicalPromoBenefitCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2143426357811967512L;

	/**
	 * 类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 淘宝商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品标题
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 主图地址
	 */
	@ApiField("main_pic_url")
	private String mainPicUrl;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * sku信息
	 */
	@ApiListField("sku_list")
	@ApiField("linked_mall_item_base_sku")
	private List<LinkedMallItemBaseSku> skuList;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getMainPicUrl() {
		return this.mainPicUrl;
	}
	public void setMainPicUrl(String mainPicUrl) {
		this.mainPicUrl = mainPicUrl;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<LinkedMallItemBaseSku> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<LinkedMallItemBaseSku> skuList) {
		this.skuList = skuList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
