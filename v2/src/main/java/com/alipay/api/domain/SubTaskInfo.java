package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约授权一体化子任务状态信息
 *
 * @author auto create
 * @since 1.0, 2021-11-08 11:00:14
 */
public class SubTaskInfo extends AlipayObject {

	private static final long serialVersionUID = 2133734862613839896L;

	/**
	 * 子任务执行结果；执行成功为成功，失败则填充失败结果
	 */
	@ApiField("execute_result")
	private String executeResult;

	/**
	 * 子任务状态
状态 INIT:初始化 FAILURE:失败 SUCCESS:成功
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子任务类型
SIGN_TASK：签约子任务
OPE_TASK：代运营授权子任务
APP_TASK：应用授权子任务
	 */
	@ApiField("type")
	private String type;

	/**
	 * 子任务类型描述
	 */
	@ApiField("type_desc")
	private String typeDesc;

	public String getExecuteResult() {
		return this.executeResult;
	}
	public void setExecuteResult(String executeResult) {
		this.executeResult = executeResult;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getTypeDesc() {
		return this.typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

}
