package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付开通进度查询——申请明细
 *
 * @author auto create
 * @since 1.0, 2024-11-06 11:42:15
 */
public class MerchantApplyItemInfo extends AlipayObject {

	private static final long serialVersionUID = 3135413866296437467L;

	/**
	 * 申请单编号
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	/**
	 * 编号
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 申请结果
	 */
	@ApiField("result")
	private String result;

	/**
	 * 申请类型
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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
