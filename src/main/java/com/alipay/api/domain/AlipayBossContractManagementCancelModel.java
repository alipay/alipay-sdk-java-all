package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 撤销关联方合约审批
 *
 * @author auto create
 * @since 1.0, 2019-12-23 13:59:41
 */
public class AlipayBossContractManagementCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1486528979372246322L;

	/**
	 * 访问接口的来源（如：采购系统-ALI_PURCHASE_SYSTEM）
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 合约批次号
	 */
	@ApiField("contract_batch_no")
	private String contractBatchNo;

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public String getContractBatchNo() {
		return this.contractBatchNo;
	}
	public void setContractBatchNo(String contractBatchNo) {
		this.contractBatchNo = contractBatchNo;
	}

}
