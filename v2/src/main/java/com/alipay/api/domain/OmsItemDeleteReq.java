package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于被删除商品信息
 *
 * @author auto create
 * @since 1.0, 2025-02-13 20:09:58
 */
public class OmsItemDeleteReq extends AlipayObject {

	private static final long serialVersionUID = 7389425223591753195L;

	/**
	 * 系统注册账号名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 创建药品的时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 删除药品的时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("delete_time")
	private Date deleteTime;

	/**
	 * 商家中台系统里药品的编码，由商家自定义
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
	 * 商品店内分类编码, 标准分类码值参照标准分类文档, 自定义分类码值由创建分类时厂商自定指定
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 展示当前商品所在末级分类的分类名称
	 */
	@ApiField("tag_name")
	private String tagName;

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

	public Date getDeleteTime() {
		return this.deleteTime;
	}
	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
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

}
