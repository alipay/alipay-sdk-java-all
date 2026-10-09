package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定向邀约-明细信息批量查询
 *
 * @author auto create
 * @since 1.0, 2026-10-08 09:47:54
 */
public class AlipayCommerceCareerOpenbaseInvitationBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3851537242684971984L;

	/**
	 * 平台生成的批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 外部客户生成的批次号
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	/**
	 * 外部某个批次明细的业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getOutBatchNo() {
		return this.outBatchNo;
	}
	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
