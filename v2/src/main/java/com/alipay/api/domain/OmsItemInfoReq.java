package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 非接口新增商品通知厂商的商品信息实体
 *
 * @author auto create
 * @since 1.0, 2025-05-15 19:16:25
 */
public class OmsItemInfoReq extends AlipayObject {

	private static final long serialVersionUID = 5444122382287165148L;

	/**
	 * 修改人
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 创建药品的时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 是否为医保商品, 0不是, 1是, 默认0
	 */
	@ApiField("insurance")
	private String insurance;

	/**
	 * OMS厂商商品编码, 用于标识门店范围唯一一个商品, 厂商自行维护
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 平台药品的编码，由支付宝返回
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 门店商品的名称，例如：[地奥]银黄含片 0.65g*12片*2板
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 用于区分商品的修改端，枚举值：0 PC端 1 openapi
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 商品的售卖信息列表 当前字段已废弃(使用新字段替换老字段结构)
	 */
	@ApiField("sku_info_list")
	@Deprecated
	private OmsItemSkuInfoReq skuInfoList;

	/**
	 * 商品信息中sku售卖相关信息
	 */
	@ApiListField("sku_list_v_2")
	@ApiField("oms_item_sku_info_req")
	private List<OmsItemSkuInfoReq> skuListV2;

	/**
	 * 枚举值：0-上架，-1-下架
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品店内分类编码, 标准分类参照文档
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 商品店内分类名称, 标准分类参照文档
	 */
	@ApiField("tag_name")
	private String tagName;

	/**
	 * 最近一次更新药品的时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("update_time")
	private Date updateTime;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

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

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public OmsItemSkuInfoReq getSkuInfoList() {
		return this.skuInfoList;
	}
	public void setSkuInfoList(OmsItemSkuInfoReq skuInfoList) {
		this.skuInfoList = skuInfoList;
	}

	public List<OmsItemSkuInfoReq> getSkuListV2() {
		return this.skuListV2;
	}
	public void setSkuListV2(List<OmsItemSkuInfoReq> skuListV2) {
		this.skuListV2 = skuListV2;
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
