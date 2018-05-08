package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商渠道类型
 *
 * @author auto create
 * @since 1.0, 2017-10-27 09:36:37
 */
public class OperatorChannelInfo extends AlipayObject {

	private static final long serialVersionUID = 8341823242524675744L;

	/**
	 * 渠道编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 渠道描述
	 */
	@ApiField("item_desc")
	private String itemDesc;

	/**
	 * 渠道名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 渠道是否可用
	 */
	@ApiField("item_status")
	private String itemStatus;

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDesc() {
		return this.itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
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

}
