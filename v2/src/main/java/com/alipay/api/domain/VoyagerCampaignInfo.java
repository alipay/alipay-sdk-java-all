package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:47:54
 */
public class VoyagerCampaignInfo extends AlipayObject {

	private static final long serialVersionUID = 2227912158336445166L;

	/**
	 * 用户是否可领（活动非进行中或券已用完时为 false）
	 */
	@ApiField("available")
	private Boolean available;

	/**
	 * 按钮文案
	 */
	@ApiField("btn_text")
	private String btnText;

	/**
	 * 按钮跳转地址
	 */
	@ApiField("btn_url")
	private String btnUrl;

	/**
	 * 活动ID
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 活动状态：CAMP_GOING（进行中）/ CAMP_END（已结束）等
	 */
	@ApiField("campaign_status")
	private String campaignStatus;

	/**
	 * 活动描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 扩展信息,json的字符串
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 活动展示图 URL
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 活动副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 活动标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * null
	 */
	@ApiListField("voucher_infos")
	@ApiField("voyager_voucher_info")
	private List<VoyagerVoucherInfo> voucherInfos;

	public Boolean getAvailable() {
		return this.available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public String getBtnText() {
		return this.btnText;
	}
	public void setBtnText(String btnText) {
		this.btnText = btnText;
	}

	public String getBtnUrl() {
		return this.btnUrl;
	}
	public void setBtnUrl(String btnUrl) {
		this.btnUrl = btnUrl;
	}

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignStatus() {
		return this.campaignStatus;
	}
	public void setCampaignStatus(String campaignStatus) {
		this.campaignStatus = campaignStatus;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public List<VoyagerVoucherInfo> getVoucherInfos() {
		return this.voucherInfos;
	}
	public void setVoucherInfos(List<VoyagerVoucherInfo> voucherInfos) {
		this.voucherInfos = voucherInfos;
	}

}
