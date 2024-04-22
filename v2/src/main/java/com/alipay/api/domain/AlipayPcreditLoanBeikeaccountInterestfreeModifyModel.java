package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 借呗呗壳免息额度查询扣减发放接口
 *
 * @author auto create
 * @since 1.0, 2019-12-04 14:08:30
 */
public class AlipayPcreditLoanBeikeaccountInterestfreeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6585337984538873594L;

	/**
	 * 扣减和发放的时候需要用到的金额，无小数，必须为正整数
	 */
	@ApiField("operation_amount")
	private Long operationAmount;

	/**
	 * 操作类型（额度查询，额度扣减，额度发放）
	 */
	@ApiField("operation_type")
	private Long operationType;

	/**
	 * 扣减和发放的业务id，用于幂等防重
	 */
	@ApiField("outer_biz_no")
	private String outerBizNo;

	/**
	 * 操作场景（XXX小游戏），具体传入值，询问接口开发人员
	 */
	@ApiField("scenes")
	private String scenes;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getOperationAmount() {
		return this.operationAmount;
	}
	public void setOperationAmount(Long operationAmount) {
		this.operationAmount = operationAmount;
	}

	public Long getOperationType() {
		return this.operationType;
	}
	public void setOperationType(Long operationType) {
		this.operationType = operationType;
	}

	public String getOuterBizNo() {
		return this.outerBizNo;
	}
	public void setOuterBizNo(String outerBizNo) {
		this.outerBizNo = outerBizNo;
	}

	public String getScenes() {
		return this.scenes;
	}
	public void setScenes(String scenes) {
		this.scenes = scenes;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
