package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款解冻信息
 *
 * @author auto create
 * @since 1.0, 2018-09-25 17:13:11
 */
public class RefundUnfreezeResult extends AlipayObject {

	private static final long serialVersionUID = 6395118214751676921L;

	/**
	 * 冻结单号
	 */
	@ApiField("freeze_no")
	private String freezeNo;

	/**
	 * 解冻结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 解冻状态。S成功，F失败。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 解冻金额
	 */
	@ApiField("unfreeze_amount")
	private String unfreezeAmount;

	/**
	 * 解冻单号
	 */
	@ApiField("unfreeze_no")
	private String unfreezeNo;

	/**
	 * 解冻时间
	 */
	@ApiField("unfreeze_time")
	private String unfreezeTime;

	public String getFreezeNo() {
		return this.freezeNo;
	}
	public void setFreezeNo(String freezeNo) {
		this.freezeNo = freezeNo;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUnfreezeAmount() {
		return this.unfreezeAmount;
	}
	public void setUnfreezeAmount(String unfreezeAmount) {
		this.unfreezeAmount = unfreezeAmount;
	}

	public String getUnfreezeNo() {
		return this.unfreezeNo;
	}
	public void setUnfreezeNo(String unfreezeNo) {
		this.unfreezeNo = unfreezeNo;
	}

	public String getUnfreezeTime() {
		return this.unfreezeTime;
	}
	public void setUnfreezeTime(String unfreezeTime) {
		this.unfreezeTime = unfreezeTime;
	}

}
