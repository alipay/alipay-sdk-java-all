package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.mpoint.authbase.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:54
 */
public class AlipayUserMpointAuthbaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4679454667132912736L;

	/** 
	 * 支付宝用户的蚂蚁会员积分余额
	 */
	@ApiField("balance")
	private Long balance;

	/** 
	 * 支付宝用户的蚂蚁会员等级
	 */
	@ApiField("grade")
	private String grade;

	/** 
	 * 会员的联名身份
	 */
	@ApiListField("joint_info")
	@ApiField("string")
	private List<String> jointInfo;

	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public Long getBalance( ) {
		return this.balance;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade( ) {
		return this.grade;
	}

	public void setJointInfo(List<String> jointInfo) {
		this.jointInfo = jointInfo;
	}
	public List<String> getJointInfo( ) {
		return this.jointInfo;
	}

}
