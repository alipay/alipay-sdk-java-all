package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 地铁方向信息
 *
 * @author auto create
 * @since 1.0, 2026-07-31 21:12:13
 */
public class DirectionVO extends AlipayObject {

	private static final long serialVersionUID = 2565467626874132872L;

	/**
	 * 运行方向。枚举：UP=上行，DOWN=下行。
	 */
	@ApiField("dir")
	private String dir;

	/**
	 * 终点站方向名称，用于对客展示「往 XXX 方向」。
	 */
	@ApiField("dir_name")
	private String dirName;

	/**
	 * 当前站点前后各 1 站（含当前站）的实时时刻。直线型通常 3 个元素（首/末站 2 个）；Y 型 4 个。
	 */
	@ApiListField("schedules")
	@ApiField("schedule_station_v_o")
	private List<ScheduleStationVO> schedules;

	/**
	 * 该方向的终点站编码。
	 */
	@ApiField("target_station_code")
	private String targetStationCode;

	/**
	 * 该方向的终点站名称。
	 */
	@ApiField("target_station_name")
	private String targetStationName;

	public String getDir() {
		return this.dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getDirName() {
		return this.dirName;
	}
	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	public List<ScheduleStationVO> getSchedules() {
		return this.schedules;
	}
	public void setSchedules(List<ScheduleStationVO> schedules) {
		this.schedules = schedules;
	}

	public String getTargetStationCode() {
		return this.targetStationCode;
	}
	public void setTargetStationCode(String targetStationCode) {
		this.targetStationCode = targetStationCode;
	}

	public String getTargetStationName() {
		return this.targetStationName;
	}
	public void setTargetStationName(String targetStationName) {
		this.targetStationName = targetStationName;
	}

}
