package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审批单操作记录
 *
 * @author auto create
 * @since 1.0, 2020-12-24 20:46:36
 */
public class InterTradeApprovalWorkflowOperateLogVO extends AlipayObject {

	private static final long serialVersionUID = 8316294139325271189L;

	/**
	 * 节点业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 操作备注
	 */
	@ApiField("operate_memo")
	private String operateMemo;

	/**
	 * 操作类型
	 */
	@ApiField("operate_type_name")
	private String operateTypeName;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 操作时间
	 */
	@ApiField("operator_time")
	private Date operatorTime;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOperateMemo() {
		return this.operateMemo;
	}
	public void setOperateMemo(String operateMemo) {
		this.operateMemo = operateMemo;
	}

	public String getOperateTypeName() {
		return this.operateTypeName;
	}
	public void setOperateTypeName(String operateTypeName) {
		this.operateTypeName = operateTypeName;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getOperatorTime() {
		return this.operatorTime;
	}
	public void setOperatorTime(Date operatorTime) {
		this.operatorTime = operatorTime;
	}

}
