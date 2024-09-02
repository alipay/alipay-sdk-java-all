package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * advanced open search数据同步接口
 *
 * @author auto create
 * @since 1.0, 2024-01-30 20:31:49
 */
public class AlipayOpenMiniCloudAosdataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8438264959684145961L;

	/**
	 * 内容数据的列表（商品列表，内容列表，本地零售商品列表，通用物品列表，店铺数据列表，五个模型只能选一个传，且单次列表数量不要超过100）
	 */
	@ApiListField("content_list")
	@ApiField("content_item")
	private List<ContentItem> contentList;

	/**
	 * 数据类型，可选值：GOODS（商品类数据），CONTENT（内容类数据），RETAIL（本地生活类数据），GENERIC（通用物品数据），SHOP（店铺类数据）
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 通用物品列表（商品列表，内容列表，本地零售商品列表，通用物品列表，店铺数据列表，五个模型只能选一个传，且单次列表数量不要超过100)
	 */
	@ApiListField("generic_item_list")
	@ApiField("generic_item")
	private List<GenericItem> genericItemList;

	/**
	 * 商品数据的列表（商品列表，内容列表，本地零售商品列表，通用物品列表，店铺数据列表，五个列表类型只能选一个传，且单次列表数量不要超过100
	 */
	@ApiListField("goods_list")
	@ApiField("good_item")
	private List<GoodItem> goodsList;

	/**
	 * 商家在小程序智能搜索引擎创建的项目id，调用前需要找蚂蚁技术获取。 当前字段已废弃(系统上下文获取，不在由调用方传递，避免越权)
	 */
	@ApiField("project_id")
	@Deprecated
	private Long projectId;

	/**
	 * 本地零售商品列表（商品列表，内容列表，本地零售商品列表，通用物品列表，店铺数据列表，五个模型只能选一个传，且单次列表数量不要超过100）
	 */
	@ApiListField("retail_item_list")
	@ApiField("retail_item")
	private List<RetailItem> retailItemList;

	/**
	 * 店铺数据列表（商品列表，内容列表，本地零售商品列表，通用物品列表，店铺数据列表，五个模型只能选一个传，且单次列表数量不要超过100)
	 */
	@ApiListField("shop_list")
	@ApiField("shop_item_info")
	private List<ShopItemInfo> shopList;

	public List<ContentItem> getContentList() {
		return this.contentList;
	}
	public void setContentList(List<ContentItem> contentList) {
		this.contentList = contentList;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public List<GenericItem> getGenericItemList() {
		return this.genericItemList;
	}
	public void setGenericItemList(List<GenericItem> genericItemList) {
		this.genericItemList = genericItemList;
	}

	public List<GoodItem> getGoodsList() {
		return this.goodsList;
	}
	public void setGoodsList(List<GoodItem> goodsList) {
		this.goodsList = goodsList;
	}

	public Long getProjectId() {
		return this.projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public List<RetailItem> getRetailItemList() {
		return this.retailItemList;
	}
	public void setRetailItemList(List<RetailItem> retailItemList) {
		this.retailItemList = retailItemList;
	}

	public List<ShopItemInfo> getShopList() {
		return this.shopList;
	}
	public void setShopList(List<ShopItemInfo> shopList) {
		this.shopList = shopList;
	}

}
