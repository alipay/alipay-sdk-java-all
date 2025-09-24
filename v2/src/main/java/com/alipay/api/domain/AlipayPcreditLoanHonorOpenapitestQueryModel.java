package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀openApi测试接口
 *
 * @author auto create
 * @since 1.0, 2025-09-01 16:43:16
 */
public class AlipayPcreditLoanHonorOpenapitestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1531866668419884648L;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 优惠券发放结果
	 */
	@ApiField("coupon_send_result")
	private HonorCouponSendResultDTO couponSendResult;

	/**
	 * 授信申请单号
	 */
	@ApiField("credit_apply_no")
	private String creditApplyNo;

	/**
	 * 授信申请结果
	 */
	@ApiField("credit_apply_result")
	private HonorCreditApplyResultDTO creditApplyResult;

	/**
	 * 借款申请结果
	 */
	@ApiField("lend_result")
	private HonorLendApplyResultDTO lendResult;

	/**
	 * 注销结果通知
	 */
	@ApiField("logoff_result")
	private HonorLogoffResultDTO logoffResult;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 还款结果
	 */
	@ApiField("repay_result")
	private HonorRepayApplyResultDTO repayResult;

	/**
	 * unifygw结果
	 */
	@ApiField("unifygw_result")
	private HonorUnifygwCommonResult unifygwResult;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public HonorCouponSendResultDTO getCouponSendResult() {
		return this.couponSendResult;
	}
	public void setCouponSendResult(HonorCouponSendResultDTO couponSendResult) {
		this.couponSendResult = couponSendResult;
	}

	public String getCreditApplyNo() {
		return this.creditApplyNo;
	}
	public void setCreditApplyNo(String creditApplyNo) {
		this.creditApplyNo = creditApplyNo;
	}

	public HonorCreditApplyResultDTO getCreditApplyResult() {
		return this.creditApplyResult;
	}
	public void setCreditApplyResult(HonorCreditApplyResultDTO creditApplyResult) {
		this.creditApplyResult = creditApplyResult;
	}

	public HonorLendApplyResultDTO getLendResult() {
		return this.lendResult;
	}
	public void setLendResult(HonorLendApplyResultDTO lendResult) {
		this.lendResult = lendResult;
	}

	public HonorLogoffResultDTO getLogoffResult() {
		return this.logoffResult;
	}
	public void setLogoffResult(HonorLogoffResultDTO logoffResult) {
		this.logoffResult = logoffResult;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public HonorRepayApplyResultDTO getRepayResult() {
		return this.repayResult;
	}
	public void setRepayResult(HonorRepayApplyResultDTO repayResult) {
		this.repayResult = repayResult;
	}

	public HonorUnifygwCommonResult getUnifygwResult() {
		return this.unifygwResult;
	}
	public void setUnifygwResult(HonorUnifygwCommonResult unifygwResult) {
		this.unifygwResult = unifygwResult;
	}

}
