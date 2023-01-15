package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cash.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:34:33
 */
public class AlipayMarketingCampaignCashDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7879318384638833162L;

	/** 
	 * 活动状态，CREATED: 已创建未打款
PAID:已打款
READY:活动已开始
PAUSE:活动已暂停
CLOSED:活动已结束
SETTLED:活动已清算
	 */
	@ApiField("camp_status")
	private String campStatus;

	/** 
	 * 红包名称
	 */
	@ApiField("coupon_name")
	private String couponName;

	/** 
	 * 活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 原始活动号,商户排查问题时提供的活动依据
	 */
	@ApiField("origin_crowd_no")
	private String originCrowdNo;

	/** 
	 * 活动文案,用户在账单中看到的红包描述
	 */
	@ApiField("prize_msg")
	private String prizeMsg;

	/** 
	 * 现金红包的发放形式, fixed为固定金额,random为随机金额
	 */
	@ApiField("prize_type")
	private String prizeType;

	/** 
	 * 活动已发放金额
	 */
	@ApiField("send_amount")
	private String sendAmount;

	/** 
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/** 
	 * 活动总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 红包总个数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 红包总个数(废弃)
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}
	public String getCampStatus( ) {
		return this.campStatus;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public String getCouponName( ) {
		return this.couponName;
	}

	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}
	public String getCrowdNo( ) {
		return this.crowdNo;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setOriginCrowdNo(String originCrowdNo) {
		this.originCrowdNo = originCrowdNo;
	}
	public String getOriginCrowdNo( ) {
		return this.originCrowdNo;
	}

	public void setPrizeMsg(String prizeMsg) {
		this.prizeMsg = prizeMsg;
	}
	public String getPrizeMsg( ) {
		return this.prizeMsg;
	}

	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}
	public String getPrizeType( ) {
		return this.prizeType;
	}

	public void setSendAmount(String sendAmount) {
		this.sendAmount = sendAmount;
	}
	public String getSendAmount( ) {
		return this.sendAmount;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime( ) {
		return this.startTime;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
