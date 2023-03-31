package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建充值方案
 *
 * @author auto create
 * @since 1.0, 2021-08-18 10:15:50
 */
public class AlipayMerchantPayforprivilegePromotionplanCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1461921763422863369L;

	/**
	 * 充值方案权益金部分，最小为0，权益金不超过5000元
	 */
	@ApiField("benefit")
	private String benefit;

	/**
	 * 方案的失效时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 外部业务号，外部商户自行生成，用于幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 充值方案有偿券部分，消费者充值成功后自动发放，如果不需要有偿券，指定空列表；有偿券的总金额不得超过10000元，且不得超过本金的2倍
	 */
	@ApiListField("paid_voucher_list")
	@ApiField("pay_for_privilege_paid_voucher_config")
	private List<PayForPrivilegePaidVoucherConfig> paidVoucherList;

	/**
	 * 充值方案本金部分，单位元，必须大于0，本金不超过5000元
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 方案开始生效时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 创建方案后该方案的状态，ENABLED(启用), DISABLED(停用)
	 */
	@ApiField("status")
	private String status;

	public String getBenefit() {
		return this.benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<PayForPrivilegePaidVoucherConfig> getPaidVoucherList() {
		return this.paidVoucherList;
	}
	public void setPaidVoucherList(List<PayForPrivilegePaidVoucherConfig> paidVoucherList) {
		this.paidVoucherList = paidVoucherList;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
