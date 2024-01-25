package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步大赛提测任务成绩
 *
 * @author auto create
 * @since 1.0, 2021-11-29 14:29:48
 */
public class AnttechOceanbaseMegagameTaskSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6279895574146444837L;

	/**
	 * 提测任务失败时需要错误信息状态码   当task_status=2时，fail_msg=0 或不填 （默认0）, 当task_status=3时，fail_msg必填且为正整数
	 */
	@ApiField("fail_msg")
	private Long failMsg;

	/**
	 * 任务id，由数据库自增生成。在获取任务时给出。同步任务时作为唯一id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 提测成绩
	 */
	@ApiField("machine_score")
	private String machineScore;

	/**
	 * 任务状态码  2执行成功（默认）  3执行失败        非2  3 报错
	 */
	@ApiField("task_status")
	private Long taskStatus;

	public Long getFailMsg() {
		return this.failMsg;
	}
	public void setFailMsg(Long failMsg) {
		this.failMsg = failMsg;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMachineScore() {
		return this.machineScore;
	}
	public void setMachineScore(String machineScore) {
		this.machineScore = machineScore;
	}

	public Long getTaskStatus() {
		return this.taskStatus;
	}
	public void setTaskStatus(Long taskStatus) {
		this.taskStatus = taskStatus;
	}

}
