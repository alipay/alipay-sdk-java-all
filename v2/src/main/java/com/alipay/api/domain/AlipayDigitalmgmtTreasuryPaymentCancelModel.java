package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财资TMS对外付款撤销
 *
 * @author auto create
 * @since 1.0, 2026-01-09 19:05:04
 */
public class AlipayDigitalmgmtTreasuryPaymentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5779127288349467348L;

	/**
	 * 操作人员，取消主动付款需要传
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 业务参考号，必填
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 来源，一般为系统名称
	 */
	@ApiField("source")
	private String source;

	/**
	 * 租户id，必传
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
