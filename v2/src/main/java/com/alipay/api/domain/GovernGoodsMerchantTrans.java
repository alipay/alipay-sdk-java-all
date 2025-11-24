package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户维度的交易信息
 *
 * @author auto create
 * @since 1.0, 2025-04-02 09:51:40
 */
public class GovernGoodsMerchantTrans extends AlipayObject {

	private static final long serialVersionUID = 5157158436182914181L;

	/**
	 * 异常交易ID
	 */
	@ApiListField("error_transaction_id")
	@ApiField("string")
	private List<String> errorTransactionId;

	/**
	 * 人工单笔数，单位笔
	 */
	@ApiField("manual_trans_count")
	private Long manualTransCount;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 二级商户ID
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 1:商户+商品，2:二级商户+商品
	 */
	@ApiField("task_type")
	private Long taskType;

	/**
	 * 交易笔数，单位笔
	 */
	@ApiField("trans_count")
	private Long transCount;

	public List<String> getErrorTransactionId() {
		return this.errorTransactionId;
	}
	public void setErrorTransactionId(List<String> errorTransactionId) {
		this.errorTransactionId = errorTransactionId;
	}

	public Long getManualTransCount() {
		return this.manualTransCount;
	}
	public void setManualTransCount(Long manualTransCount) {
		this.manualTransCount = manualTransCount;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public Long getTaskType() {
		return this.taskType;
	}
	public void setTaskType(Long taskType) {
		this.taskType = taskType;
	}

	public Long getTransCount() {
		return this.transCount;
	}
	public void setTransCount(Long transCount) {
		this.transCount = transCount;
	}

}
