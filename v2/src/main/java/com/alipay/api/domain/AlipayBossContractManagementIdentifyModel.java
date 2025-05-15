package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁关联方识别
 *
 * @author auto create
 * @since 1.0, 2024-04-16 15:36:49
 */
public class AlipayBossContractManagementIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 8129222156822439483L;

	/**
	 * 访问接口的来源（如：采购系统-ALI_PURCHASE_SYSTEM）
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 合约批次列表
	 */
	@ApiListField("contracts")
	@ApiField("batch_info")
	private List<BatchInfo> contracts;

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public List<BatchInfo> getContracts() {
		return this.contracts;
	}
	public void setContracts(List<BatchInfo> contracts) {
		this.contracts = contracts;
	}

}
