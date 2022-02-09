package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险营销活动DTO对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class InsMktCampaignDTO extends AlipayObject {

	private static final long serialVersionUID = 4276347999368157283L;

	/**
	 * 保险营销活动id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 活动奖品发行量
	 */
	@ApiField("circulation")
	private Long circulation;

	/**
	 * 活动权益配置
	 */
	@ApiField("coupon_config")
	private InsMktCouponConfigDTO couponConfig;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 活动备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 活动标的列表
	 */
	@ApiListField("mkt_objects")
	@ApiField("ins_mkt_object_d_t_o")
	private List<InsMktObjectDTO> mktObjects;

	/**
	 * 保险营销活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 发奖金额算法
	 */
	@ApiField("send_algorithm")
	private String sendAlgorithm;

	/**
	 * 发奖规则类型：
1. 基于账户做发奖控制
2. 基于身份证做发奖控制
3. 基于业务单号做发奖控制
	 */
	@ApiField("send_frqnc_type")
	private Long sendFrqncType;

	/**
	 * 发奖规则值，频次为3
	 */
	@ApiField("send_frqnc_value")
	private Long sendFrqncValue;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 活动状态：
5：活动已发布，待生效
6：活动已生效
7：活动已失效
8：活动已下线
	 */
	@ApiField("status")
	private Long status;

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public Long getCirculation() {
		return this.circulation;
	}
	public void setCirculation(Long circulation) {
		this.circulation = circulation;
	}

	public InsMktCouponConfigDTO getCouponConfig() {
		return this.couponConfig;
	}
	public void setCouponConfig(InsMktCouponConfigDTO couponConfig) {
		this.couponConfig = couponConfig;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<InsMktObjectDTO> getMktObjects() {
		return this.mktObjects;
	}
	public void setMktObjects(List<InsMktObjectDTO> mktObjects) {
		this.mktObjects = mktObjects;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSendAlgorithm() {
		return this.sendAlgorithm;
	}
	public void setSendAlgorithm(String sendAlgorithm) {
		this.sendAlgorithm = sendAlgorithm;
	}

	public Long getSendFrqncType() {
		return this.sendFrqncType;
	}
	public void setSendFrqncType(Long sendFrqncType) {
		this.sendFrqncType = sendFrqncType;
	}

	public Long getSendFrqncValue() {
		return this.sendFrqncValue;
	}
	public void setSendFrqncValue(Long sendFrqncValue) {
		this.sendFrqncValue = sendFrqncValue;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
