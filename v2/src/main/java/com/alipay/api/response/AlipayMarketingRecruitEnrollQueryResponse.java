package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RecruitEnrollInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.recruit.enroll.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:16
 */
public class AlipayMarketingRecruitEnrollQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2157474598835928794L;

	/** 
	 * 报名ID
	 */
	@ApiField("enroll_id")
	private String enrollId;

	/** 
	 * 报名信息
	 */
	@ApiField("enroll_info")
	private RecruitEnrollInfo enrollInfo;

	/** 
	 * 报名所属的活动报名场景。
枚举值： VOUCHER：属于券报名场景；
MINI_APP：属于小程序报名场景；
	 */
	@ApiField("enroll_scene_type")
	private String enrollSceneType;

	/** 
	 * 报名时间
	 */
	@ApiField("enroll_time")
	private Date enrollTime;

	/** 
	 * 备注字段
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 外部操作流水号。由商家/ISV 自定义，仅支持字母、数字、下划线且需保证每次操作唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 招商方案ID
	 */
	@ApiField("plan_id")
	private String planId;

	/** 
	 * 报名状态： AUDITING 审核中； ENABLED 通过 ； REJECTED 不通过 ； CLOSING 下线审核中 ； CLOSED 已下线；
	 */
	@ApiField("status")
	private String status;

	public void setEnrollId(String enrollId) {
		this.enrollId = enrollId;
	}
	public String getEnrollId( ) {
		return this.enrollId;
	}

	public void setEnrollInfo(RecruitEnrollInfo enrollInfo) {
		this.enrollInfo = enrollInfo;
	}
	public RecruitEnrollInfo getEnrollInfo( ) {
		return this.enrollInfo;
	}

	public void setEnrollSceneType(String enrollSceneType) {
		this.enrollSceneType = enrollSceneType;
	}
	public String getEnrollSceneType( ) {
		return this.enrollSceneType;
	}

	public void setEnrollTime(Date enrollTime) {
		this.enrollTime = enrollTime;
	}
	public Date getEnrollTime( ) {
		return this.enrollTime;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanId( ) {
		return this.planId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
