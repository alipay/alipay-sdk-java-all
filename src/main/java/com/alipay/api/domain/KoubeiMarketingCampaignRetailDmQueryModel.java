package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消店铺展位内容查询接口
 *
 * @author auto create
 * @since 1.0, 2017-07-19 22:12:39
 */
public class KoubeiMarketingCampaignRetailDmQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8541752285564498277L;

	/**
	 * 内容id，通过调用koubei.marketing.campaign.retail.dm.create接口创建内容时返回的内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

}
