package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用例步骤
 *
 * @author auto create
 * @since 1.0, 2022-09-19 16:37:22
 */
public class UseCaseStepInfo extends AlipayObject {

	private static final long serialVersionUID = 1348887316314171442L;

	/**
	 * 方法描述
	 */
	@ApiField("method_desc")
	private String methodDesc;

	/**
	 * 功能方法名(固定的那几种)
	 */
	@ApiField("method_name")
	private String methodName;

	/**
	 * 操作动作或业务分类,(固定的12种)
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 参数列表
	 */
	@ApiListField("param_info_list")
	@ApiField("serve_param_info")
	private List<ServeParamInfo> paramInfoList;

	/**
	 * 步骤前置条件
	 */
	@ApiListField("precondition_list")
	@ApiField("precondition")
	private List<Precondition> preconditionList;

	/**
	 * 结果返回值
	 */
	@ApiField("response_data")
	private String responseData;

	/**
	 * 操作步骤备注
	 */
	@ApiField("step_note")
	private String stepNote;

	/**
	 * 服务类
	 */
	@ApiField("type")
	private String type;

	public String getMethodDesc() {
		return this.methodDesc;
	}
	public void setMethodDesc(String methodDesc) {
		this.methodDesc = methodDesc;
	}

	public String getMethodName() {
		return this.methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public List<ServeParamInfo> getParamInfoList() {
		return this.paramInfoList;
	}
	public void setParamInfoList(List<ServeParamInfo> paramInfoList) {
		this.paramInfoList = paramInfoList;
	}

	public List<Precondition> getPreconditionList() {
		return this.preconditionList;
	}
	public void setPreconditionList(List<Precondition> preconditionList) {
		this.preconditionList = preconditionList;
	}

	public String getResponseData() {
		return this.responseData;
	}
	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}

	public String getStepNote() {
		return this.stepNote;
	}
	public void setStepNote(String stepNote) {
		this.stepNote = stepNote;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
