package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消店铺展位内容上下架接口
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:16:42
 */
public class KoubeiMarketingCampaignRetailDmSetModel extends AlipayObject {

	private static final long serialVersionUID = 4342279758199249576L;

	/**
	 * 下架时间，仅上架操作时使用，必须晚于当前时间
	 */
	@ApiField("campaign_end_time")
	private Date campaignEndTime;

	/**
	 * 内容ID，调用koubei.marketing.campaign.retail.dm.create创建内容时返回的内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 上下架操作类型，上架：ONLINE，下架：OFFLINE，注意：请先调用创建内容接口再进行上架操作，下架内容不得再上架。
	 */
	@ApiField("operate_type")
	private String operateType;

	public Date getCampaignEndTime() {
		return this.campaignEndTime;
	}
	public void setCampaignEndTime(Date campaignEndTime) {
		this.campaignEndTime = campaignEndTime;
	}

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
