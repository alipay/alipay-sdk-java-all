package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作人信息
 *
 * @author auto create
 * @since 1.0, 2022-01-07 10:43:35
 */
public class People extends AlipayObject {

	private static final long serialVersionUID = 8275461462834735979L;

	/**
	 * 花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 真名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 唯一流水号，有则更新，无则保存
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 工号
	 */
	@ApiField("work_no")
	private String workNo;

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

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
