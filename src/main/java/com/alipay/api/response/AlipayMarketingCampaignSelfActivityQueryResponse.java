package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherTemplate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.self.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-11 22:07:55
 */
public class AlipayMarketingCampaignSelfActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4557675244682459136L;

	/** 
	 * b.alipay.com 自营销活动的活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/** 
	 * 当前状态，同商家自运营后台显示活动状态，已创建、已发布、已暂停、已结束
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * 券模板列表
	 */
	@ApiListField("voucher_template_list")
	@ApiField("voucher_template")
	private List<VoucherTemplate> voucherTemplateList;

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityName( ) {
		return this.activityName;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setVoucherTemplateList(List<VoucherTemplate> voucherTemplateList) {
		this.voucherTemplateList = voucherTemplateList;
	}
	public List<VoucherTemplate> getVoucherTemplateList( ) {
		return this.voucherTemplateList;
	}

}
