package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取大赛提测任务
 *
 * @author auto create
 * @since 1.0, 2021-12-17 19:23:19
 */
public class AnttechOceanbaseMegagameTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2642739872595868196L;

	/**
	 * 获取任务时先获取超时任务，这里传入的是超时的分钟数。默认30分钟。
	 */
	@ApiField("run_task_time_out_minutes")
	private Long runTaskTimeOutMinutes;

	/**
	 * 参赛团队Id ，支持指定团队获取任务
	 */
	@ApiField("team_id")
	private String teamId;

	public Long getRunTaskTimeOutMinutes() {
		return this.runTaskTimeOutMinutes;
	}
	public void setRunTaskTimeOutMinutes(Long runTaskTimeOutMinutes) {
		this.runTaskTimeOutMinutes = runTaskTimeOutMinutes;
	}

	public String getTeamId() {
		return this.teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

}
