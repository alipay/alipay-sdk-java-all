package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * voyager营销冻结接口
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:40:28
 */
public class AlipayVoyagerMarketingFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 7482761965576628975L;

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
	 * 业务单号（三方交易订单号），作为幂等键和 XTS 分布式事务业务活动 ID
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 行业标识
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 用户 openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户 2088 UID
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
