package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * voyager营销退款接口
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:47:54
 */
public class AlipayVoyagerMarketingRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1574415334281437973L;

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
	 * 行业标识
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 正向业务单号（原 bizNo）
	 */
	@ApiField("original_biz_no")
	private String originalBizNo;

	/**
	 * 退款金额。全款退传全额，部分退传差额
	 */
	@ApiField("refund_amount")
	private MultiCurrencyMoneyDTO refundAmount;

	/**
	 * 幂等键，三方生成唯一值
	 */
	@ApiField("refund_request_id")
	private String refundRequestId;

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

	public String getOriginalBizNo() {
		return this.originalBizNo;
	}
	public void setOriginalBizNo(String originalBizNo) {
		this.originalBizNo = originalBizNo;
	}

	public MultiCurrencyMoneyDTO getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(MultiCurrencyMoneyDTO refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundRequestId() {
		return this.refundRequestId;
	}
	public void setRefundRequestId(String refundRequestId) {
		this.refundRequestId = refundRequestId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
