package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建AA收款、江湖救急、活动收款等，调用此接口获取收款详情
 *
 * @author auto create
 * @since 1.0, 2024-07-04 17:00:46
 */
public class AlipayFundTransBatchQuerybatchModel extends AlipayObject {

	private static final long serialVersionUID = 4874895369364544996L;

	/**
	 * 批次编号，创建批次时返回的批次编号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * token，创建批次时和批次编号一起返回。注：在使用批次号查询批次信息时需要带上
	 */
	@ApiField("token")
	private String token;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getToken() {
		return this.token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
