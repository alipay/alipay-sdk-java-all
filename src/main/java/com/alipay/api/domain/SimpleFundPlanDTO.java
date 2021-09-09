package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 简化的资金计划
 *
 * @author auto create
 * @since 1.0, 2021-09-01 14:50:52
 */
public class SimpleFundPlanDTO extends AlipayObject {

	private static final long serialVersionUID = 2227161478723498218L;

	/**
	 * 合花群ID（与当前请求参数中传入值保持一致）
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * （创建人）支付宝侧用户唯一标识<br>
- 补充说明：该字段与alipay.fund.jointaccount.fundplan.create请求参数中传入值保持一致
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 当前合花群中的自动攒计划唯一标识（支付宝侧生成）
	 */
	@ApiField("fund_plan_id")
	private String fundPlanId;

	/**
	 * 计划状态<br>
- VALIDATE：正常生效中<br>
- PAUSE 暂停中<br>
- CLOSED 已删除
	 */
	@ApiField("status")
	private String status;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getFundPlanId() {
		return this.fundPlanId;
	}
	public void setFundPlanId(String fundPlanId) {
		this.fundPlanId = fundPlanId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
