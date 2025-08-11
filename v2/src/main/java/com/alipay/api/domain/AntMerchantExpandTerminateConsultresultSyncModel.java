package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消咨询回调接口
 *
 * @author auto create
 * @since 1.0, 2025-05-22 16:09:00
 */
public class AntMerchantExpandTerminateConsultresultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2434524845855121763L;

	/**
	 * 消息体中batchNO
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 消息体中bizNo
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 咨询类型
	 */
	@ApiField("consult_type")
	private String consultType;

	/**
	 * 撤销状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 供应商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getConsultType() {
		return this.consultType;
	}
	public void setConsultType(String consultType) {
		this.consultType = consultType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
