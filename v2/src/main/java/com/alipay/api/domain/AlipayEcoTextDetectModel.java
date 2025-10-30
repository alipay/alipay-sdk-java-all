package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文本检测对外接口服务
 *
 * @author auto create
 * @since 1.0, 2019-09-06 17:57:49
 */
public class AlipayEcoTextDetectModel extends AlipayObject {

	private static final long serialVersionUID = 5831412672214281769L;

	/**
	 * 检测任务列表
	 */
	@ApiListField("task")
	@ApiField("spi_detection_task")
	private List<SpiDetectionTask> task;

	public List<SpiDetectionTask> getTask() {
		return this.task;
	}
	public void setTask(List<SpiDetectionTask> task) {
		this.task = task;
	}

}
