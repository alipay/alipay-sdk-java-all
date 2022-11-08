package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 步骤单元
 *
 * @author auto create
 * @since 1.0, 2022-03-15 09:57:52
 */
public class StepUnit extends AlipayObject {

	private static final long serialVersionUID = 6666352177123147323L;

	/**
	 * 处理时间
	 */
	@ApiField("deal_date")
	private String dealDate;

	/**
	 * memo
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作意见
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 用户名称
	 */
	@ApiField("user")
	private String user;

	/**
	 * 用户工号
	 */
	@ApiField("work_no")
	private String workNo;

	public String getDealDate() {
		return this.dealDate;
	}
	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getUser() {
		return this.user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
