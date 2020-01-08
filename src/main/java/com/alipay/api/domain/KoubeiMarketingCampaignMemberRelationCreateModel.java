package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通口碑商户会员
 *
 * @author auto create
 * @since 1.0, 2019-03-06 15:53:48
 */
public class KoubeiMarketingCampaignMemberRelationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5737791938266821761L;

	/**
	 * 会员开通时间
	 */
	@ApiField("activate_time")
	private Date activateTime;

	/**
	 * token
	 */
	@ApiField("auth_token")
	private String authToken;

	/**
	 * 余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 生日
	 */
	@ApiField("birth")
	private String birth;

	/**
	 * 手机号
	 */
	@ApiField("cell")
	private String cell;

	/**
	 * 会员过期时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 会员等级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 会员模版id
	 */
	@ApiField("member_template_id")
	private String memberTemplateId;

	/**
	 * 商户外部会员号
	 */
	@ApiField("out_member_no")
	private String outMemberNo;

	/**
	 * 积分
	 */
	@ApiField("point")
	private String point;

	/**
	 * 外部请求幂等号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 会员开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public Date getActivateTime() {
		return this.activateTime;
	}
	public void setActivateTime(Date activateTime) {
		this.activateTime = activateTime;
	}

	public String getAuthToken() {
		return this.authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBirth() {
		return this.birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getCell() {
		return this.cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public String getMemberTemplateId() {
		return this.memberTemplateId;
	}
	public void setMemberTemplateId(String memberTemplateId) {
		this.memberTemplateId = memberTemplateId;
	}

	public String getOutMemberNo() {
		return this.outMemberNo;
	}
	public void setOutMemberNo(String outMemberNo) {
		this.outMemberNo = outMemberNo;
	}

	public String getPoint() {
		return this.point;
	}
	public void setPoint(String point) {
		this.point = point;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
