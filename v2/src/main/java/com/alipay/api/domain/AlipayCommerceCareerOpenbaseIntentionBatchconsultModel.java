package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 意向雷达-批量咨询
 *
 * @author auto create
 * @since 1.0, 2026-10-08 19:12:57
 */
public class AlipayCommerceCareerOpenbaseIntentionBatchconsultModel extends AlipayObject {

	private static final long serialVersionUID = 7299736765278784965L;

	/**
	 * null
	 */
	@ApiListField("batch_details")
	@ApiField("career_open_base_intention_ladar_batch_detail")
	private List<CareerOpenBaseIntentionLadarBatchDetail> batchDetails;

	/**
	 * 外部批次号，需要保证全局唯一，相同 out_batch_no 重复提交批次会被拒绝。
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	public List<CareerOpenBaseIntentionLadarBatchDetail> getBatchDetails() {
		return this.batchDetails;
	}
	public void setBatchDetails(List<CareerOpenBaseIntentionLadarBatchDetail> batchDetails) {
		this.batchDetails = batchDetails;
	}

	public String getOutBatchNo() {
		return this.outBatchNo;
	}
	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}

}
