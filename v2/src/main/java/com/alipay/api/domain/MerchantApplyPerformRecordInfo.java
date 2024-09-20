package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付开通进度查询——履约明细
 *
 * @author auto create
 * @since 1.0, 2024-08-20 18:01:36
 */
public class MerchantApplyPerformRecordInfo extends AlipayObject {

	private static final long serialVersionUID = 7319835864132242594L;

	/**
	 * 申请单
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	/**
	 * 主键id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 如果失败则是失败原因
	 */
	@ApiField("result")
	private String result;

	/**
	 * 履约状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 履约类型
	 */
	@ApiField("type")
	private String type;

	public String getApplyOrderId() {
		return this.applyOrderId;
	}
	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
