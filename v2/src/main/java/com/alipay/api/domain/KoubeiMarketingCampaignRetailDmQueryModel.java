package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消店铺展位内容查询接口
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:17:24
 */
public class KoubeiMarketingCampaignRetailDmQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3171679572116433489L;

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
