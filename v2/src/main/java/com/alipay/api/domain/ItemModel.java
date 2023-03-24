package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品查询模型
 *
 * @author auto create
 * @since 1.0, 2018-11-28 19:27:29
 */
public class ItemModel extends AlipayObject {

	private static final long serialVersionUID = 3566394664148121487L;

	/**
	 * 创建者id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 创建者类型
	 */
	@ApiField("creator_type")
	private String creatorType;

	/**
	 * 商品扩展信息：可以解析成 Map<String, String> 的 json string
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 前台类目id
	 */
	@ApiField("front_category_id")
	private String frontCategoryId;

	/**
	 * 商品创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 商品更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商品sku列表
	 */
	@ApiListField("sku_list")
	@ApiField("item_sku_info")
	private List<ItemSkuInfo> skuList;

	/**
	 * 商品排序
	 */
	@ApiField("sort")
	private Long sort;

	/**
	 * 商品状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商户归属主体id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 商品归属主体类型：5(商铺)
	 */
	@ApiField("target_type")
	private String targetType;

	/**
	 * 商品类型
	 */
	@ApiField("type")
	private String type;

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorType() {
		return this.creatorType;
	}
	public void setCreatorType(String creatorType) {
		this.creatorType = creatorType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFrontCategoryId() {
		return this.frontCategoryId;
	}
	public void setFrontCategoryId(String frontCategoryId) {
		this.frontCategoryId = frontCategoryId;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<ItemSkuInfo> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<ItemSkuInfo> skuList) {
		this.skuList = skuList;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
