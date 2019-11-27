package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑客分佣任务批量查询结果
 *
 * @author auto create
 * @since 1.0, 2017-03-29 17:41:03
 */
public class KbAdvertMissionQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 3648322657658213159L;

	/**
	 * 是否可设置二级分佣任务
只有推广者可见该字段，商户不可见
	 */
	@ApiField("can_cascade_mission")
	private Boolean canCascadeMission;

	/**
	 * 二级分佣配置信息
1、只对mission任务推广者可见
2、只有当任务认领人配置二级分佣，才存在该配置
	 */
	@ApiListField("cascade_commission_infos")
	@ApiField("kb_advert_cascade_commission_info")
	private List<KbAdvertCascadeCommissionInfo> cascadeCommissionInfos;

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
	 * 分佣任务归属人支付宝账号
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 推广状态
EFFECTIVE-有效
INVALID-无效
	 */
	@ApiField("promote_status")
	private String promoteStatus;

	/**
	 * 智能营销信息
	 */
	@ApiField("smart_promo")
	private KbadvertSmartPromoResponse smartPromo;

	/**
	 * 分佣标的信息
	 */
	@ApiListField("subjects")
	@ApiField("kb_advert_mission_subject")
	private List<KbAdvertMissionSubject> subjects;

	public Boolean getCanCascadeMission() {
		return this.canCascadeMission;
	}
	public void setCanCascadeMission(Boolean canCascadeMission) {
		this.canCascadeMission = canCascadeMission;
	}

	public List<KbAdvertCascadeCommissionInfo> getCascadeCommissionInfos() {
		return this.cascadeCommissionInfos;
	}
	public void setCascadeCommissionInfos(List<KbAdvertCascadeCommissionInfo> cascadeCommissionInfos) {
		this.cascadeCommissionInfos = cascadeCommissionInfos;
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

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPromoteStatus() {
		return this.promoteStatus;
	}
	public void setPromoteStatus(String promoteStatus) {
		this.promoteStatus = promoteStatus;
	}

	public KbadvertSmartPromoResponse getSmartPromo() {
		return this.smartPromo;
	}
	public void setSmartPromo(KbadvertSmartPromoResponse smartPromo) {
		this.smartPromo = smartPromo;
	}

	public List<KbAdvertMissionSubject> getSubjects() {
		return this.subjects;
	}
	public void setSubjects(List<KbAdvertMissionSubject> subjects) {
		this.subjects = subjects;
	}

}
