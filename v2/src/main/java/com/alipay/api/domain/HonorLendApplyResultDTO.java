package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀支用放款结果
 *
 * @author auto create
 * @since 1.0, 2025-09-01 16:43:16
 */
public class HonorLendApplyResultDTO extends AlipayObject {

	private static final long serialVersionUID = 4654789331946574488L;

	/**
	 * 渠道侧借款单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 借款申请状态，枚举值：
2-成功，
3-失败，
4-风控拒绝，
5-取消
	 */
	@ApiField("apply_status")
	private Long applyStatus;

	/**
	 * 借款申请时间，时间戳毫秒
	 */
	@ApiField("apply_time")
	private Long applyTime;

	/**
	 * 渠道侧用户id
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 机构名称
	 */
	@ApiField("institution_names")
	private String institutionNames;

	/**
	 * 借款信息 (成功时必传)
	 */
	@ApiField("loan_info")
	private HonorLoanInfoDTO loanInfo;

	/**
	 * 借款来源, appId（渠道侧提供）
	 */
	@ApiField("loan_source")
	private String loanSource;

	/**
	 * 随身贷借款受理单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 拒绝原因，失败或拒绝是必传
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/**
	 * 拒绝具体原因，失败或拒绝是必传
	 */
	@ApiField("refuse_msg_data")
	private String refuseMsgData;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public Long getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(Long applyStatus) {
		this.applyStatus = applyStatus;
	}

	public Long getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Long applyTime) {
		this.applyTime = applyTime;
	}

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getInstitutionNames() {
		return this.institutionNames;
	}
	public void setInstitutionNames(String institutionNames) {
		this.institutionNames = institutionNames;
	}

	public HonorLoanInfoDTO getLoanInfo() {
		return this.loanInfo;
	}
	public void setLoanInfo(HonorLoanInfoDTO loanInfo) {
		this.loanInfo = loanInfo;
	}

	public String getLoanSource() {
		return this.loanSource;
	}
	public void setLoanSource(String loanSource) {
		this.loanSource = loanSource;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRefuseMsg() {
		return this.refuseMsg;
	}
	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}

	public String getRefuseMsgData() {
		return this.refuseMsgData;
	}
	public void setRefuseMsgData(String refuseMsgData) {
		this.refuseMsgData = refuseMsgData;
	}

}
