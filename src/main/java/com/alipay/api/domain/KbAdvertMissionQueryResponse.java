package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑客分佣任务批量查询结果
 *
 * @author auto create
 * @since 1.0, 2017-01-13 11:53:39
 */
public class KbAdvertMissionQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 7362332729235564711L;

	/**
	 * 任务结束时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 任务开始时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 分佣任务ID
	 */
	@ApiField("mission_id")
	private String missionId;

	/**
	 * 推广状态
EFFECTIVE-有效
INVALID-无效
	 */
	@ApiField("promote_status")
	private String promoteStatus;

	/**
	 * 分佣标的信息
	 */
	@ApiListField("subjects")
	@ApiField("kb_advert_mission_subject")
	private List<KbAdvertMissionSubject> subjects;

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getMissionId() {
		return this.missionId;
	}
	public void setMissionId(String missionId) {
		this.missionId = missionId;
	}

	public String getPromoteStatus() {
		return this.promoteStatus;
	}
	public void setPromoteStatus(String promoteStatus) {
		this.promoteStatus = promoteStatus;
	}

	public List<KbAdvertMissionSubject> getSubjects() {
		return this.subjects;
	}
	public void setSubjects(List<KbAdvertMissionSubject> subjects) {
		this.subjects = subjects;
	}

}
