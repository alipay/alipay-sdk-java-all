package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务操作日志
 *
 * @author auto create
 * @since 1.0, 2020-09-07 10:24:31
 */
public class TaskOperationLog extends AlipayObject {

	private static final long serialVersionUID = 4298139882164212814L;

	/**
	 * 操作时间，yyyy-MM-dd HH:mm:ss格式字符串
	 */
	@ApiField("gmt_opration")
	private String gmtOpration;

	/**
	 * 操作详情描述
	 */
	@ApiField("operation_desc")
	private String operationDesc;

	/**
	 * 操作备注
	 */
	@ApiField("operation_memo")
	private String operationMemo;

	/**
	 * 操作类型:
CREATE：任务创建,
MANUAL:手工添加动态,
TRANSFER：任务转派,
URGE：任务催办,
RESPONSE：任务响应,
DEAL：任务处理,
EXP_RESUME：异常恢复
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 操作人id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人名称
	 */
	@ApiField("operator_nick")
	private String operatorNick;

	public String getGmtOpration() {
		return this.gmtOpration;
	}
	public void setGmtOpration(String gmtOpration) {
		this.gmtOpration = gmtOpration;
	}

	public String getOperationDesc() {
		return this.operationDesc;
	}
	public void setOperationDesc(String operationDesc) {
		this.operationDesc = operationDesc;
	}

	public String getOperationMemo() {
		return this.operationMemo;
	}
	public void setOperationMemo(String operationMemo) {
		this.operationMemo = operationMemo;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorNick() {
		return this.operatorNick;
	}
	public void setOperatorNick(String operatorNick) {
		this.operatorNick = operatorNick;
	}

}
