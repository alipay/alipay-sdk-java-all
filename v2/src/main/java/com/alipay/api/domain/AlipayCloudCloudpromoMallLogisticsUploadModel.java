package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回填运单信息
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:13:54
 */
public class AlipayCloudCloudpromoMallLogisticsUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3225442689766183112L;

	/**
	 * 公司代码
	 */
	@ApiField("cp_code")
	private String cpCode;

	/**
	 * 纠纷id
	 */
	@ApiField("dispute_id")
	private String disputeId;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	public String getCpCode() {
		return this.cpCode;
	}
	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}

	public String getDisputeId() {
		return this.disputeId;
	}
	public void setDisputeId(String disputeId) {
		this.disputeId = disputeId;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

}
