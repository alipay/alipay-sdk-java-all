package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * voyager营销核销接口
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:41:00
 */
public class AlipayVoyagerMarketingRedeemModel extends AlipayObject {

	private static final long serialVersionUID = 7264671793845645793L;

	/**
	 * null
	 */
	@ApiListField("benefit_use_infos")
	@ApiField("benefit_use_v_o")
	private List<BenefitUseVO> benefitUseInfos;

	/**
	 * 下单时间
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 业务单号（原冻结时的 bizNo）
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 冻结单号，来自 applyAndFreeze 返回值
	 */
	@ApiField("freeze_order_id")
	private String freezeOrderId;

	/**
	 * 行业标识
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户userId
	 */
	@ApiField("user_id")
	private String userId;

	public List<BenefitUseVO> getBenefitUseInfos() {
		return this.benefitUseInfos;
	}
	public void setBenefitUseInfos(List<BenefitUseVO> benefitUseInfos) {
		this.benefitUseInfos = benefitUseInfos;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getFreezeOrderId() {
		return this.freezeOrderId;
	}
	public void setFreezeOrderId(String freezeOrderId) {
		this.freezeOrderId = freezeOrderId;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
