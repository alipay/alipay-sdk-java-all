package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户分析数据
 *
 * @author auto create
 * @since 1.0, 2020-09-28 10:42:22
 */
public class UserAnalysisData extends AlipayObject {

	private static final long serialVersionUID = 5553552948328954737L;

	/**
	 * 取消关注人数
	 */
	@ApiField("cancel_user_cnt")
	private String cancelUserCnt;

	/**
	 * 累积关注人数
	 */
	@ApiField("cumulate_user_cnt")
	private String cumulateUserCnt;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 净增关注人数
	 */
	@ApiField("grow_user_cnt")
	private String growUserCnt;

	/**
	 * 新关注人数
	 */
	@ApiField("new_user_cnt")
	private String newUserCnt;

	public String getCancelUserCnt() {
		return this.cancelUserCnt;
	}
	public void setCancelUserCnt(String cancelUserCnt) {
		this.cancelUserCnt = cancelUserCnt;
	}

	public String getCumulateUserCnt() {
		return this.cumulateUserCnt;
	}
	public void setCumulateUserCnt(String cumulateUserCnt) {
		this.cumulateUserCnt = cumulateUserCnt;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getGrowUserCnt() {
		return this.growUserCnt;
	}
	public void setGrowUserCnt(String growUserCnt) {
		this.growUserCnt = growUserCnt;
	}

	public String getNewUserCnt() {
		return this.newUserCnt;
	}
	public void setNewUserCnt(String newUserCnt) {
		this.newUserCnt = newUserCnt;
	}

}
