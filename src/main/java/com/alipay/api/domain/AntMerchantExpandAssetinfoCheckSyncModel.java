package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 检验信息同步接口
 *
 * @author auto create
 * @since 1.0, 2022-05-31 10:05:24
 */
public class AntMerchantExpandAssetinfoCheckSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8352171978548383916L;

	/**
	 * 批次号，标示这一批次
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 检测明细
	 */
	@ApiListField("check_details")
	@ApiField("check_details")
	private List<CheckDetails> checkDetails;

	/**
	 * 检测阶段代码
	 */
	@ApiField("check_phase")
	private String checkPhase;

	/**
	 * 检测阶段的状态
	 */
	@ApiField("check_status")
	private String checkStatus;

	/**
	 * 和机器绑定的供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 校验类型
	 */
	@ApiField("type")
	private String type;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public List<CheckDetails> getCheckDetails() {
		return this.checkDetails;
	}
	public void setCheckDetails(List<CheckDetails> checkDetails) {
		this.checkDetails = checkDetails;
	}

	public String getCheckPhase() {
		return this.checkPhase;
	}
	public void setCheckPhase(String checkPhase) {
		this.checkPhase = checkPhase;
	}

	public String getCheckStatus() {
		return this.checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
