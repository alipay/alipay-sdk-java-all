package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜谱模型
 *
 * @author auto create
 * @since 1.0, 2018-12-20 11:37:02
 */
public class PosDishCookModel extends AlipayObject {

	private static final long serialVersionUID = 3763737465565652373L;

	/**
	 * 渠道    eatin堂食，takeout外卖,paipai 扫码,kbb2c 口碑点餐
	 */
	@ApiField("cook_channel")
	private String cookChannel;

	/**
	 * 菜谱ID
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜谱名称
	 */
	@ApiField("cook_name")
	private String cookName;

	/**
	 * 操作员
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 数据的创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 数据的修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 菜谱描述
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * yazuo,meituan,ele
	 */
	@ApiField("source_from")
	private String sourceFrom;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	public String getCookChannel() {
		return this.cookChannel;
	}
	public void setCookChannel(String cookChannel) {
		this.cookChannel = cookChannel;
	}

	public String getCookId() {
		return this.cookId;
	}
	public void setCookId(String cookId) {
		this.cookId = cookId;
	}

	public String getCookName() {
		return this.cookName;
	}
	public void setCookName(String cookName) {
		this.cookName = cookName;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSourceFrom() {
		return this.sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
