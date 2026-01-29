package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品详情
 *
 * @author auto create
 * @since 1.0, 2025-02-06 19:35:19
 */
public class ItemInfoDetail extends AlipayObject {

	private static final long serialVersionUID = 5585521796944398227L;

	/**
	 * 创建药品的时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 是否医保标记；0不是 1是
	 */
	@ApiField("insurance_status")
	private String insuranceStatus;

	/**
	 * 由商家自定义
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 平台药品的编码，由支付宝返回
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 0上架 -1下架 -2冻结
	 */
	@ApiField("item_status")
	private String itemStatus;

	/**
	 * 商家自定义店内父code
	 */
	@ApiField("parent_tag_code")
	private String parentTagCode;

	/**
	 * 平台商家店内父分类id
	 */
	@ApiField("parent_tag_id")
	private String parentTagId;

	/**
	 * 商家自定义店内父name
	 */
	@ApiField("parent_tag_name")
	private String parentTagName;

	/**
	 * sku信息
	 */
	@ApiField("sku_info_list")
	private SkuInfoVO skuInfoList;

	/**
	 * sku信息
	 */
	@ApiListField("sku_list")
	@ApiField("sku_info_v_o")
	private List<SkuInfoVO> skuList;

	/**
	 * 商家自定义店内code
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 平台商家店内分类id
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 平台商家店内分类id名称
	 */
	@ApiField("tag_name")
	private String tagName;

	/**
	 * 最近一次更新药品的时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("update_time")
	private Date updateTime;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getInsuranceStatus() {
		return this.insuranceStatus;
	}
	public void setInsuranceStatus(String insuranceStatus) {
		this.insuranceStatus = insuranceStatus;
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

	public String getItemStatus() {
		return this.itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getParentTagCode() {
		return this.parentTagCode;
	}
	public void setParentTagCode(String parentTagCode) {
		this.parentTagCode = parentTagCode;
	}

	public String getParentTagId() {
		return this.parentTagId;
	}
	public void setParentTagId(String parentTagId) {
		this.parentTagId = parentTagId;
	}

	public String getParentTagName() {
		return this.parentTagName;
	}
	public void setParentTagName(String parentTagName) {
		this.parentTagName = parentTagName;
	}

	public SkuInfoVO getSkuInfoList() {
		return this.skuInfoList;
	}
	public void setSkuInfoList(SkuInfoVO skuInfoList) {
		this.skuInfoList = skuInfoList;
	}

	public List<SkuInfoVO> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<SkuInfoVO> skuList) {
		this.skuList = skuList;
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
