package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请放贷接口
 *
 * @author auto create
 * @since 1.0, 2026-07-17 13:46:52
 */
public class XingheLendassistCarfinauctionApplyloanNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1225329298265445648L;

	/**
	 * 星河申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 尾款首付款支付证明文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 尾款首付款支付金额，单位为分
	 */
	@ApiField("final_down_payment_amount")
	private Long finalDownPaymentAmount;

	/**
	 * 尾款首付款支付时间
	 */
	@ApiField("final_down_payment_time")
	private Date finalDownPaymentTime;

	/**
	 * 外部订单号（阿里拍卖申请单号）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public Long getFinalDownPaymentAmount() {
		return this.finalDownPaymentAmount;
	}
	public void setFinalDownPaymentAmount(Long finalDownPaymentAmount) {
		this.finalDownPaymentAmount = finalDownPaymentAmount;
	}

	public Date getFinalDownPaymentTime() {
		return this.finalDownPaymentTime;
	}
	public void setFinalDownPaymentTime(Date finalDownPaymentTime) {
		this.finalDownPaymentTime = finalDownPaymentTime;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
