package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻承诺消费-用户参加活动模型
 *
 * @author auto create
 * @since 1.0, 2019-04-30 10:22:32
 */
public class ActivityParticipation extends AlipayObject {

	private static final long serialVersionUID = 5467533862726688977L;

	/**
	 * 承诺消费活动模型
	 */
	@ApiField("activity")
	private Activity activity;

	/**
	 * 商户是否可以免除用户退回优惠
	 */
	@ApiField("can_dispense")
	private Boolean canDispense;

	/**
	 * 合约已支付金额，只支持两位小数点的正数
	 */
	@ApiField("consumed_amount")
	private String consumedAmount;

	/**
	 * 合约已消费次数，单位次
	 */
	@ApiField("consumed_times")
	private Long consumedTimes;

	/**
	 * 承诺合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 合约状态，在下列值中：
ACT_EFFECTIVE - 生效中
ACT_PENDING_PAY - 到期未完成待支付
ACT_CANCELLED_PENDING_PAY - 用户取消合约等待支付
ACT_FINISH_NOT_EXPIRE - 已守约未到期
ACT_OVERDUE - 到期未完成已逾期
E_UNFINISH_PAID - 到期未完成已支付
E_FINISHED - 已守约
E_CANCELLED - 未到期取消
	 */
	@ApiField("contract_status")
	private String contractStatus;

	/**
	 * 合约状态描述
生效中 - ACT_EFFECTIVE
到期未完成待支付 - ACT_PENDING_PAY
用户取消合约等待支付 - ACT_CANCELLED_PENDING_PAY
已守约未到期 - ACT_FINISH_NOT_EXPIRE
到期未完成已逾期 - ACT_OVERDUE
到期未完成已支付 - E_UNFINISH_PAID
已守约 - E_FINISHED
未到期取消 - E_CANCELLED
	 */
	@ApiField("contract_status_desc")
	private String contractStatusDesc;

	/**
	 * 合约状态标签，用于展示
	 */
	@ApiField("contract_status_tag")
	private ContractStatusTag contractStatusTag;

	/**
	 * 合约已优惠总金额,只支持两位小数点的正数
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 用户参加活动，即合约生效时间，标准格式：2018-12-12 00:00:00
	 */
	@ApiField("effective_time")
	private Date effectiveTime;

	/**
	 * 用户参加活动逾期时间, 标准格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 用户是否参加活动
	 */
	@ApiField("participated")
	private Boolean participated;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 合约违约金额
	 */
	@ApiField("violation_amount")
	private String violationAmount;

	/**
	 * 内部资产平台券是否可用
	 */
	@ApiField("voucher_available")
	private Boolean voucherAvailable;

	public Activity getActivity() {
		return this.activity;
	}
	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Boolean getCanDispense() {
		return this.canDispense;
	}
	public void setCanDispense(Boolean canDispense) {
		this.canDispense = canDispense;
	}

	public String getConsumedAmount() {
		return this.consumedAmount;
	}
	public void setConsumedAmount(String consumedAmount) {
		this.consumedAmount = consumedAmount;
	}

	public Long getConsumedTimes() {
		return this.consumedTimes;
	}
	public void setConsumedTimes(Long consumedTimes) {
		this.consumedTimes = consumedTimes;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractStatus() {
		return this.contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getContractStatusDesc() {
		return this.contractStatusDesc;
	}
	public void setContractStatusDesc(String contractStatusDesc) {
		this.contractStatusDesc = contractStatusDesc;
	}

	public ContractStatusTag getContractStatusTag() {
		return this.contractStatusTag;
	}
	public void setContractStatusTag(ContractStatusTag contractStatusTag) {
		this.contractStatusTag = contractStatusTag;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Date getEffectiveTime() {
		return this.effectiveTime;
	}
	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Boolean getParticipated() {
		return this.participated;
	}
	public void setParticipated(Boolean participated) {
		this.participated = participated;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getViolationAmount() {
		return this.violationAmount;
	}
	public void setViolationAmount(String violationAmount) {
		this.violationAmount = violationAmount;
	}

	public Boolean getVoucherAvailable() {
		return this.voucherAvailable;
	}
	public void setVoucherAvailable(Boolean voucherAvailable) {
		this.voucherAvailable = voucherAvailable;
	}

}
