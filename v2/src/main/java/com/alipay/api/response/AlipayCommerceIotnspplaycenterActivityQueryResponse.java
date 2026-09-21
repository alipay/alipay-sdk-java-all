package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IotnspplaycenterActivityVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iotnspplaycenter.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-28 13:52:52
 */
public class AlipayCommerceIotnspplaycenterActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3576127577124743423L;

	/** 
	 * 活动状态
	 */
	@ApiField("act_status")
	private String actStatus;

	/** 
	 * 活动类型
	 */
	@ApiField("act_type")
	private String actType;

	/** 
	 * 活动规则详情
	 */
	@ApiField("activity_rule_detail")
	private String activityRuleDetail;

	/** 
	 * 卡片logo
	 */
	@ApiField("card_logo")
	private String cardLogo;

	/** 
	 * 卡片文案
	 */
	@ApiField("card_text")
	private String cardText;

	/** 
	 * 卡片标题
	 */
	@ApiField("card_title")
	private String cardTitle;

	/** 
	 * 当前活动进度，单位由progress_unit字段指定。
	 */
	@ApiField("current_progress")
	private String currentProgress;

	/** 
	 * 任务截止时间戳，单位为毫秒。
	 */
	@ApiField("gmt_expired")
	private Long gmtExpired;

	/** 
	 * 任务开始时间戳，单位为毫秒。
	 */
	@ApiField("gmt_start")
	private Long gmtStart;

	/** 
	 * 主奖品图片
	 */
	@ApiField("main_prize_image")
	private String mainPrizeImage;

	/** 
	 * 主标题
	 */
	@ApiField("main_title")
	private String mainTitle;

	/** 
	 * 进度单位
	 */
	@ApiField("progress_unit")
	private String progressUnit;

	/** 
	 * 活动总进度，单位由progress_unit字段指定。
	 */
	@ApiField("total_progress")
	private String totalProgress;

	/** 
	 * null
	 */
	@ApiListField("voucher_list")
	@ApiField("iotnspplaycenter_activity_voucher_info")
	private List<IotnspplaycenterActivityVoucherInfo> voucherList;

	public void setActStatus(String actStatus) {
		this.actStatus = actStatus;
	}
	public String getActStatus( ) {
		return this.actStatus;
	}

	public void setActType(String actType) {
		this.actType = actType;
	}
	public String getActType( ) {
		return this.actType;
	}

	public void setActivityRuleDetail(String activityRuleDetail) {
		this.activityRuleDetail = activityRuleDetail;
	}
	public String getActivityRuleDetail( ) {
		return this.activityRuleDetail;
	}

	public void setCardLogo(String cardLogo) {
		this.cardLogo = cardLogo;
	}
	public String getCardLogo( ) {
		return this.cardLogo;
	}

	public void setCardText(String cardText) {
		this.cardText = cardText;
	}
	public String getCardText( ) {
		return this.cardText;
	}

	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
	}
	public String getCardTitle( ) {
		return this.cardTitle;
	}

	public void setCurrentProgress(String currentProgress) {
		this.currentProgress = currentProgress;
	}
	public String getCurrentProgress( ) {
		return this.currentProgress;
	}

	public void setGmtExpired(Long gmtExpired) {
		this.gmtExpired = gmtExpired;
	}
	public Long getGmtExpired( ) {
		return this.gmtExpired;
	}

	public void setGmtStart(Long gmtStart) {
		this.gmtStart = gmtStart;
	}
	public Long getGmtStart( ) {
		return this.gmtStart;
	}

	public void setMainPrizeImage(String mainPrizeImage) {
		this.mainPrizeImage = mainPrizeImage;
	}
	public String getMainPrizeImage( ) {
		return this.mainPrizeImage;
	}

	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}
	public String getMainTitle( ) {
		return this.mainTitle;
	}

	public void setProgressUnit(String progressUnit) {
		this.progressUnit = progressUnit;
	}
	public String getProgressUnit( ) {
		return this.progressUnit;
	}

	public void setTotalProgress(String totalProgress) {
		this.totalProgress = totalProgress;
	}
	public String getTotalProgress( ) {
		return this.totalProgress;
	}

	public void setVoucherList(List<IotnspplaycenterActivityVoucherInfo> voucherList) {
		this.voucherList = voucherList;
	}
	public List<IotnspplaycenterActivityVoucherInfo> getVoucherList( ) {
		return this.voucherList;
	}

}
