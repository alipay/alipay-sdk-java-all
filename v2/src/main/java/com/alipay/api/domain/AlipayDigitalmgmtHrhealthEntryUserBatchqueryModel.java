package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询未被初始化的候选人列表
 *
 * @author auto create
 * @since 1.0, 2024-07-25 14:57:16
 */
public class AlipayDigitalmgmtHrhealthEntryUserBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3481526583149538957L;

	/**
	 * data_key用于校验供应商的权限，每一个接入系统的供应商会有唯一的该参数，供应商来对接时蚂蚁生成唯一参数线下给到供应商侧，供应商需要传入来校验身份
	 */
	@ApiField("data_key")
	private String dataKey;

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

}
