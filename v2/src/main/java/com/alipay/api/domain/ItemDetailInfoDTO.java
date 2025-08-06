package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店商品详情（包含单规格/多规格）
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:35
 */
public class ItemDetailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8424139953136167165L;

	/**
	 * 商品的创建时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 是否为医保商品, 0不是, 1是, 默认1
	 */
	@ApiField("insurance")
	private String insurance;

	/**
	 * OMS厂商商品编码, 用于标识门店范围唯一一个商品, 厂商自行维护
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 平台商品的唯一键，由支付宝返回
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 门店商品的名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 门店商品关联的售卖规格列表
	 */
	@ApiListField("sku_info_list")
	@ApiField("item_sku_info_d_t_o")
	private List<ItemSkuInfoDTO> skuInfoList;

	/**
	 * 商品上下架状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品店内分类编码, 标准分类参照文档
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 商品店内分类末级分类的id
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 商品店内分类名称, 标准分类参照文档
	 */
	@ApiField("tag_name")
	private String tagName;

	/**
	 * 商品的最后一次修改时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("update_time")
	private Date updateTime;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getInsurance() {
		return this.insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<ItemSkuInfoDTO> getSkuInfoList() {
		return this.skuInfoList;
	}
	public void setSkuInfoList(List<ItemSkuInfoDTO> skuInfoList) {
		this.skuInfoList = skuInfoList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
