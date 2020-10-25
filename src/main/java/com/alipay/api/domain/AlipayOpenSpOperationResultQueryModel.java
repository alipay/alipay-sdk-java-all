package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询服务商代运营操作结果
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:22:03
 */
public class AlipayOpenSpOperationResultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3156945738332232319L;

	/**
	 * 支付宝操作批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 代运营操作类型。取值如下 ACCOUNT_BIND：账号绑定； OPERATION_AUTH：代运营授权。
	 */
	@ApiField("operate_type")
	private String operateType;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
