package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工卡查询的用户识别信息
 *
 * @author auto create
 * @since 1.0, 2024-03-01 13:44:46
 */
public class UserIdentificationDTO extends AlipayObject {

	private static final long serialVersionUID = 8847762189454522196L;

	/**
	 * 工卡状态 ON：启用，OFF：禁用
	 */
	@ApiField("card_status")
	private String cardStatus;

	/**
	 * 公司ID
	 */
	@ApiField("company_id")
	private Long companyId;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 工号
	 */
	@ApiField("work_no")
	private String workNo;

	public String getCardStatus() {
		return this.cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public Long getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
