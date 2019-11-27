package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 方案信息数据
 *
 * @author auto create
 * @since 1.0, 2017-10-16 15:38:25
 */
public class InitSignTaskInfo extends AlipayObject {

	private static final long serialVersionUID = 6738558937952456693L;

	/**
	 * 电子签约类型
1:电子合同
	 */
	@ApiField("order_type")
	private Long orderType;

	/**
	 * 签约文件列表。具体见signDatInfo定义
	 */
	@ApiListField("sign_data_list")
	@ApiField("sign_data_info")
	private List<SignDataInfo> signDataList;

	/**
	 * 电子签约任务编排类型
1:顺序签约
2:并行签约
	 */
	@ApiField("sign_task_type")
	private Long signTaskType;

	/**
	 * 签约子任务，每个任务对象一个签约主体
	 */
	@ApiListField("sing_task_list")
	@ApiField("sign_task")
	private List<SignTask> singTaskList;

	public Long getOrderType() {
		return this.orderType;
	}
	public void setOrderType(Long orderType) {
		this.orderType = orderType;
	}

	public List<SignDataInfo> getSignDataList() {
		return this.signDataList;
	}
	public void setSignDataList(List<SignDataInfo> signDataList) {
		this.signDataList = signDataList;
	}

	public Long getSignTaskType() {
		return this.signTaskType;
	}
	public void setSignTaskType(Long signTaskType) {
		this.signTaskType = signTaskType;
	}

	public List<SignTask> getSingTaskList() {
		return this.singTaskList;
	}
	public void setSingTaskList(List<SignTask> singTaskList) {
		this.singTaskList = singTaskList;
	}

}
