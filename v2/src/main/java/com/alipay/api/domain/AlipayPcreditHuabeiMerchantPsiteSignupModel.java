package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 花呗分期间连服务商活动报名
 *
 * @author auto create
 * @since 1.0, 2025-07-25 09:43:37
 */
public class AlipayPcreditHuabeiMerchantPsiteSignupModel extends AlipayObject {

	private static final long serialVersionUID = 1714595237971911547L;

	/**
	 * 期数维度贴息比例
	 */
	@ApiListField("fq_num_charge_info")
	@ApiField("fq_num_charge_info")
	private List<FqNumChargeInfo> fqNumChargeInfo;

	/**
	 * 订单金额上限（分）要求为100整数倍
	 */
	@ApiField("max_apply_amt")
	private Long maxApplyAmt;

	/**
	 * 报名商家列表
	 */
	@ApiListField("merchant_ids")
	@ApiField("string")
	private List<String> merchantIds;

	/**
	 * 订单金额下限（分）要求为100整数倍
	 */
	@ApiField("min_apply_amt")
	private Long minApplyAmt;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 方案id
	 */
	@ApiField("plan_id")
	private String planId;

	public List<FqNumChargeInfo> getFqNumChargeInfo() {
		return this.fqNumChargeInfo;
	}
	public void setFqNumChargeInfo(List<FqNumChargeInfo> fqNumChargeInfo) {
		this.fqNumChargeInfo = fqNumChargeInfo;
	}

	public Long getMaxApplyAmt() {
		return this.maxApplyAmt;
	}
	public void setMaxApplyAmt(Long maxApplyAmt) {
		this.maxApplyAmt = maxApplyAmt;
	}

	public List<String> getMerchantIds() {
		return this.merchantIds;
	}
	public void setMerchantIds(List<String> merchantIds) {
		this.merchantIds = merchantIds;
	}

	public Long getMinApplyAmt() {
		return this.minApplyAmt;
	}
	public void setMinApplyAmt(Long minApplyAmt) {
		this.minApplyAmt = minApplyAmt;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
