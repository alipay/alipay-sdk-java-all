package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动资格查询接口
 *
 * @author auto create
 * @since 1.0, 2017-10-17 14:58:59
 */
public class AlipayInsSceneCampaignQualificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7899645328996151959L;

	/**
	 * 保险保障期限结束日期，保险止期
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/**
	 * 保险生效日期，时间戳类型
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 保险产品的机构产品，由蚂蚁保险分配
	 */
	@ApiField("prod_no")
	private String prodNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getEffectEndTime() {
		return this.effectEndTime;
	}
	public void setEffectEndTime(Date effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	public Date getEffectStartTime() {
		return this.effectStartTime;
	}
	public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	public String getProdNo() {
		return this.prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
