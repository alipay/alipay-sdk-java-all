package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道针对分期的子期数模型
 *
 * @author auto create
 * @since 1.0, 2023-12-25 16:43:21
 */
public class InstallmentInfo extends AlipayObject {

	private static final long serialVersionUID = 1342852322351268612L;

	/**
	 * 分期数
	 */
	@ApiField("install_count")
	private String installCount;

	/**
	 * 子期数对应的营销模型
	 */
	@ApiField("operation_list")
	private PrePayOperationInfo operationList;

	public String getInstallCount() {
		return this.installCount;
	}
	public void setInstallCount(String installCount) {
		this.installCount = installCount;
	}

	public PrePayOperationInfo getOperationList() {
		return this.operationList;
	}
	public void setOperationList(PrePayOperationInfo operationList) {
		this.operationList = operationList;
	}

}
