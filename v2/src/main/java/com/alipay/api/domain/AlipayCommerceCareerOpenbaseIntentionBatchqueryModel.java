package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 意向雷达-明细信息批量查询
 *
 * @author auto create
 * @since 1.0, 2026-10-08 17:17:54
 */
public class AlipayCommerceCareerOpenbaseIntentionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3399984131122161877L;

	/**
	 * 平台批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 外部批次号
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	/**
	 * 调用方提供的外部业务号，长度为1至64位，仅支持英文字母和数字。
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
