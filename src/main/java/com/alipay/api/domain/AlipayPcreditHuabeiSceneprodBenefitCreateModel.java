package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建花呗金权益
 *
 * @author auto create
 * @since 1.0, 2021-12-20 20:46:05
 */
public class AlipayPcreditHuabeiSceneprodBenefitCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8285731271235945732L;

	/**
	 * 权益渠道，用于控制投放场景
帮还会场入会 member_huabei
店铺页面入会 member_tmall
帮还会场直播 live_huabei
	 */
	@ApiField("benefit_channel")
	private String benefitChannel;

	/**
	 * 权益名称，有商户创建
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 标识权益类型，花呗金：HB_POINT
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 业务场景，后续更多新增请联系相关同学，入淘：HB_POINT_TAOBAO
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 花呗金发放预算
	 */
	@ApiField("budget")
	private Long budget;

	/**
	 * 权益结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 外部业务号，上游唯一单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 创建权益的支付宝商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 淘宝商家sellerId
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 面值，单次发放数量
	 */
	@ApiField("send_count")
	private Long sendCount;

	/**
	 * 权益开始时间，如不传递则创建时生效
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getBenefitChannel() {
		return this.benefitChannel;
	}
	public void setBenefitChannel(String benefitChannel) {
		this.benefitChannel = benefitChannel;
	}

	public String getBenefitName() {
		return this.benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	public String getBenefitType() {
		return this.benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public Long getBudget() {
		return this.budget;
	}
	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public Long getSendCount() {
		return this.sendCount;
	}
	public void setSendCount(Long sendCount) {
		this.sendCount = sendCount;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
