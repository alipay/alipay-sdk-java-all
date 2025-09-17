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
 * @since 1.0, 2025-08-13 14:52:41
 */
public class AlipayMarketingCampaignSelfActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4189685827399864846L;

	/** 
	 * 活动结束时间，即券可领取结束时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("activity_end_time")
	private String activityEndTime;

	/** 
	 * b.alipay.com 自营销活动的活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/** 
	 * 活动开始时间，即券可领取开始时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("activity_start_time")
	private String activityStartTime;

	/** 
	 * 当前状态，同商家自运营后台显示活动状态，已创建、已发布、已暂停、已结束
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * 商户logo
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/** 
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 券模板列表
	 */
	@ApiListField("voucher_template_list")
	@ApiField("voucher_template")
	private List<VoucherTemplate> voucherTemplateList;

	public void setActivityEndTime(String activityEndTime) {
		this.activityEndTime = activityEndTime;
	}
	public String getActivityEndTime( ) {
		return this.activityEndTime;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityName( ) {
		return this.activityName;
	}

	public void setActivityStartTime(String activityStartTime) {
		this.activityStartTime = activityStartTime;
	}
	public String getActivityStartTime( ) {
		return this.activityStartTime;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}
	public String getMerchantLogo( ) {
		return this.merchantLogo;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setVoucherTemplateList(List<VoucherTemplate> voucherTemplateList) {
		this.voucherTemplateList = voucherTemplateList;
	}
	public List<VoucherTemplate> getVoucherTemplateList( ) {
		return this.voucherTemplateList;
	}

}
