package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子签约任务
 *
 * @author auto create
 * @since 1.0, 2017-10-18 17:38:21
 */
public class TaskBizInfo extends AlipayObject {

	private static final long serialVersionUID = 8778191495358161886L;

	/**
	 * 接口版本信息，目前默认3，由服务提供方指定。
	 */
	@ApiField("service_version")
	private String serviceVersion;

	/**
	 * 查询的签约任务编号列表，JSONArray格式。参考alipay.security.prod.signature.task.apply返回的task_list对象中的task_id属性。支持查询1到多个任务结果，如果列表为空，则默认查询所有任务结果，如果与当前订单下的任务没有匹配，则不返回任何签约任务。
	 */
	@ApiField("task_id_list")
	private String taskIdList;

	public String getServiceVersion() {
		return this.serviceVersion;
	}
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

	public String getTaskIdList() {
		return this.taskIdList;
	}
	public void setTaskIdList(String taskIdList) {
		this.taskIdList = taskIdList;
	}

}
