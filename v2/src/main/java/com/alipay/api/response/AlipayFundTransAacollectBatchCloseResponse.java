package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.aacollect.batch.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:58
 */
public class AlipayFundTransAacollectBatchCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5224441754863794575L;

	/** 
	 * * 批次状态
     * <p>
     *      <b>一阶段模式:</b>
     *      <pre>
     *                                 ----> SUCCESS
     *                              /
     *                             /
     *          INIT ----------> FIRST_STAGE---> PART_SUCCESS
     *                             \
     *                              \
     *                               -----> FAIL
     *      </pre>
     * </p>
	 */
	@ApiField("batch_status")
	private String batchStatus;

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}
	public String getBatchStatus( ) {
		return this.batchStatus;
	}

}
