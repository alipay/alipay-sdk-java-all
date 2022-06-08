package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecruitItemApplyData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.recruit.apply.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignRecruitApplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7469878227914247244L;

	/** 
	 * 活动开始购买时间
	 */
	@ApiField("bought_time")
	private Date boughtTime;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 招商报名数据总数
	 */
	@ApiField("item_count")
	private String itemCount;

	/** 
	 * 招商报名数据
	 */
	@ApiListField("item_info")
	@ApiField("recruit_item_apply_data")
	private List<RecruitItemApplyData> itemInfo;

	/** 
	 * 活动名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 预热开始时间 2016-12-12 10:10:10
	 */
	@ApiField("prehot_time")
	private Date prehotTime;

	public void setBoughtTime(Date boughtTime) {
		this.boughtTime = boughtTime;
	}
	public Date getBoughtTime( ) {
		return this.boughtTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setItemCount(String itemCount) {
		this.itemCount = itemCount;
	}
	public String getItemCount( ) {
		return this.itemCount;
	}

	public void setItemInfo(List<RecruitItemApplyData> itemInfo) {
		this.itemInfo = itemInfo;
	}
	public List<RecruitItemApplyData> getItemInfo( ) {
		return this.itemInfo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPrehotTime(Date prehotTime) {
		this.prehotTime = prehotTime;
	}
	public Date getPrehotTime( ) {
		return this.prehotTime;
	}

}
