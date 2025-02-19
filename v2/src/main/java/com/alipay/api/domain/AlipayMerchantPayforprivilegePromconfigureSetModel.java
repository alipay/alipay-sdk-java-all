package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家设置营销配置
 *
 * @author auto create
 * @since 1.0, 2021-07-26 10:11:10
 */
public class AlipayMerchantPayforprivilegePromconfigureSetModel extends AlipayObject {

	private static final long serialVersionUID = 5269879529149188842L;

	/**
	 * 支持的可核销门店列表
	 */
	@ApiListField("enabled_shop_list")
	@ApiField("string")
	private List<String> enabledShopList;

	/**
	 * 需要剔除的单品id列表，不可同时与（support_item_ids）生效
	 */
	@ApiListField("exclude_item_ids")
	@ApiField("string")
	private List<String> excludeItemIds;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支持的核销单品id列表，不可同时与剔除的列表（exclude_item_ids）生效
	 */
	@ApiListField("support_item_ids")
	@ApiField("string")
	private List<String> supportItemIds;

	public List<String> getEnabledShopList() {
		return this.enabledShopList;
	}
	public void setEnabledShopList(List<String> enabledShopList) {
		this.enabledShopList = enabledShopList;
	}

	public List<String> getExcludeItemIds() {
		return this.excludeItemIds;
	}
	public void setExcludeItemIds(List<String> excludeItemIds) {
		this.excludeItemIds = excludeItemIds;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<String> getSupportItemIds() {
		return this.supportItemIds;
	}
	public void setSupportItemIds(List<String> supportItemIds) {
		this.supportItemIds = supportItemIds;
	}

}
