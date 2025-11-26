package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 互医签约审核结果同步接口
 *
 * @author auto create
 * @since 1.0, 2025-03-31 19:54:54
 */
public class AlipayCommerceMedicalIndustrydataSigningresultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5514148388351322753L;

	/**
	 * 合作医院code，由支付宝侧分配
	 */
	@ApiField("hospital_code")
	private String hospitalCode;

	/**
	 * 签约合同ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 驳回原因
	 */
	@ApiField("rejection_reason")
	private String rejectionReason;

	/**
	 * 商家ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 状态
EFFECTIVE：已生效
REJECTED：已驳回
	 */
	@ApiField("status")
	private String status;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

	public String getHospitalCode() {
		return this.hospitalCode;
	}
	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getRejectionReason() {
		return this.rejectionReason;
	}
	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
