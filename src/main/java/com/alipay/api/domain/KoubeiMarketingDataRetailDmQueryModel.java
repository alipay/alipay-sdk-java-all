package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 快消店铺DM浏览数据查询接口
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:09:42
 */
public class KoubeiMarketingDataRetailDmQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7355572254232355984L;

	/**
	 * 内容ID，调用koubei.marketing.campaign.retail.dm.create创建内容时返回的内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 门店ID
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
