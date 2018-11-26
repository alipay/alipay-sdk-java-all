package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放接口用户参加活动模型
 *
 * @author auto create
 * @since 1.0, 2018-11-16 11:01:41
 */
public class ActivityParticipation extends AlipayObject {

	private static final long serialVersionUID = 6179724723272299167L;

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
	 * 对外透出的合约状态，在下列值中：
PROMISING - 待守约
VIOLATED - 已逾期
LOSE_EFFICACY - 已失效
FINISHED - 已完成
	 */
	@ApiField("contract_status")
	private String contractStatus;

	/**
	 * 合约已优惠总金额,只支持两位小数点的正数
	 */
	@ApiField("discount_amount")
	private String discountAmount;

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

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
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

}
