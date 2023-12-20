package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.retail.dm.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-02 11:14:36
 */
public class KoubeiMarketingCampaignRetailDmCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8496599521395874941L;

	/** 
	 * 内容id：该活动/商品入库成功之后，会将该活动/商品的id返回，作为商品/活动的内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 扩展信息：活动返回的额外的信息，如果创建活动的时候有传入扩展备用信息，返回就存在，如果创建没有填该字段，返回也不会有该字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

}
