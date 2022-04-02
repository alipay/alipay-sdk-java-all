package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁关联交易合约审批信息查询
 *
 * @author auto create
 * @since 1.0, 2019-12-23 13:59:28
 */
public class AlipayBossContractManagementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5828244681213511763L;

	/**
	 * 来源（如：采购系统-ALI_PURCHASE_SYSTEM）
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
