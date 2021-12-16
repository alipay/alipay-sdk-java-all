package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取大赛提测任务
 *
 * @author auto create
 * @since 1.0, 2021-11-30 21:29:11
 */
public class AnttechOceanbaseMegagameTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3318555929298395644L;

	/**
	 * 获取任务时先获取超时任务，这里传入的是超时的分钟数。默认30分钟。
	 */
	@ApiField("run_task_time_out_minutes")
	private Long runTaskTimeOutMinutes;

	public Long getRunTaskTimeOutMinutes() {
		return this.runTaskTimeOutMinutes;
	}
	public void setRunTaskTimeOutMinutes(Long runTaskTimeOutMinutes) {
		this.runTaskTimeOutMinutes = runTaskTimeOutMinutes;
	}

}
