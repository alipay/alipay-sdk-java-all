package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大出行智能平台-排班任务-班型
 *
 * @author auto create
 * @since 1.0, 2020-08-18 21:32:50
 */
public class WorkPattern extends AlipayObject {

	private static final long serialVersionUID = 5574662692542421581L;

	/**
	 * 线路方向
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 最大工作时长，单位：小时
	 */
	@ApiField("max_work_time")
	private String maxWorkTime;

	/**
	 * 使用该班型的班次数量
	 */
	@ApiField("work_count")
	private Long workCount;

	/**
	 * 班型明细列表
	 */
	@ApiListField("work_pattern_detail_list")
	@ApiField("work_pattern_detail")
	private List<WorkPatternDetail> workPatternDetailList;

	/**
	 * 班型编号
	 */
	@ApiField("work_pattern_id")
	private String workPatternId;

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getMaxWorkTime() {
		return this.maxWorkTime;
	}
	public void setMaxWorkTime(String maxWorkTime) {
		this.maxWorkTime = maxWorkTime;
	}

	public Long getWorkCount() {
		return this.workCount;
	}
	public void setWorkCount(Long workCount) {
		this.workCount = workCount;
	}

	public List<WorkPatternDetail> getWorkPatternDetailList() {
		return this.workPatternDetailList;
	}
	public void setWorkPatternDetailList(List<WorkPatternDetail> workPatternDetailList) {
		this.workPatternDetailList = workPatternDetailList;
	}

	public String getWorkPatternId() {
		return this.workPatternId;
	}
	public void setWorkPatternId(String workPatternId) {
		this.workPatternId = workPatternId;
	}

}
