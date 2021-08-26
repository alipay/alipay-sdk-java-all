package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统任务
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:12
 */
public class KbAdvertMissionResponse extends AlipayObject {

	private static final long serialVersionUID = 5675327952947163364L;

	/**
	 * 任务领取时间
	 */
	@ApiField("gmt_claimed")
	private String gmtClaimed;

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
	 * 任务ID
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
	 * 任务标的列表
	 */
	@ApiListField("subjects")
	@ApiField("kb_advert_subject_response")
	private List<KbAdvertSubjectResponse> subjects;

	public String getGmtClaimed() {
		return this.gmtClaimed;
	}
	public void setGmtClaimed(String gmtClaimed) {
		this.gmtClaimed = gmtClaimed;
	}

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

	public List<KbAdvertSubjectResponse> getSubjects() {
		return this.subjects;
	}
	public void setSubjects(List<KbAdvertSubjectResponse> subjects) {
		this.subjects = subjects;
	}

}
