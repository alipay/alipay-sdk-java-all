package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大出行智能平台-轮班任务-轮班参数
 *
 * @author auto create
 * @since 1.0, 2020-09-04 15:17:32
 */
public class WorkShiftParam extends AlipayObject {

	private static final long serialVersionUID = 6838152261655715672L;

	/**
	 * 扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 排班优化类型
	 */
	@ApiField("optimize_type")
	private Long optimizeType;

	/**
	 * 该日期使用的排班服务任务ID
	 */
	@ApiField("work_schedule_service_task_id")
	private String workScheduleServiceTaskId;

	/**
	 * 待轮班的日期（yyyyMMdd）
	 */
	@ApiField("work_shift_date")
	private String workShiftDate;

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public Long getOptimizeType() {
		return this.optimizeType;
	}
	public void setOptimizeType(Long optimizeType) {
		this.optimizeType = optimizeType;
	}

	public String getWorkScheduleServiceTaskId() {
		return this.workScheduleServiceTaskId;
	}
	public void setWorkScheduleServiceTaskId(String workScheduleServiceTaskId) {
		this.workScheduleServiceTaskId = workScheduleServiceTaskId;
	}

	public String getWorkShiftDate() {
		return this.workShiftDate;
	}
	public void setWorkShiftDate(String workShiftDate) {
		this.workShiftDate = workShiftDate;
	}

}
