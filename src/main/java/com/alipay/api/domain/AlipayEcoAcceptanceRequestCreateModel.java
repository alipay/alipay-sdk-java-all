package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * &#160;云验收进行数据提交
 *
 * @author auto create
 * @since 1.0, 2018-11-14 21:02:15
 */
public class AlipayEcoAcceptanceRequestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2858261321267742547L;

	/**
	 * 用户ID
	 */
	@ApiField("accetor_id")
	private String accetorId;

	/**
	 * 用户名字、称呼等
	 */
	@ApiField("accetor_nick")
	private String accetorNick;

	/**
	 * 用户类型，淘宝账户
	 */
	@ApiField("accetor_user_type")
	private String accetorUserType;

	/**
	 * 用例ID
	 */
	@ApiField("case_id")
	private String caseId;

	/**
	 * 用例需要的参数，可以采用这种结构
	 */
	@ApiField("params")
	private String params;

	/**
	 * 任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public String getAccetorId() {
		return this.accetorId;
	}
	public void setAccetorId(String accetorId) {
		this.accetorId = accetorId;
	}

	public String getAccetorNick() {
		return this.accetorNick;
	}
	public void setAccetorNick(String accetorNick) {
		this.accetorNick = accetorNick;
	}

	public String getAccetorUserType() {
		return this.accetorUserType;
	}
	public void setAccetorUserType(String accetorUserType) {
		this.accetorUserType = accetorUserType;
	}

	public String getCaseId() {
		return this.caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
