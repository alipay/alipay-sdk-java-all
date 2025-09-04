package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 产品下各计费项用量详情
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:22:33
 */
public class ProductUsageInfo extends AlipayObject {

	private static final long serialVersionUID = 5198381931346316119L;

	/**
	 * 展示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 计费项详情列表
	 */
	@ApiListField("fee_item_infos")
	@ApiField("fee_item_info")
	private List<FeeItemInfo> feeItemInfos;

	/**
	 * 图标
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 产品名称
	 */
	@ApiField("name")
	private String name;

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public List<FeeItemInfo> getFeeItemInfos() {
		return this.feeItemInfos;
	}
	public void setFeeItemInfos(List<FeeItemInfo> feeItemInfos) {
		this.feeItemInfos = feeItemInfos;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
