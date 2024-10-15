package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拓展字段
 *
 * @author auto create
 * @since 1.0, 2024-07-01 20:17:50
 */
public class BillSendExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5292698835525125853L;

	/**
	 * 学校外标编号
	 */
	@ApiField("ext_school_id")
	private String extSchoolId;

	/**
	 * 账单唤起收银台的方式：
1-手机wap;2-当面付。默认值为1（不传值或传非数字值）
	 */
	@ApiField("order_pay_type")
	private String orderPayType;

	/**
	 * 分账金额，单位：元
	 */
	@ApiField("royalty_amount")
	private String royaltyAmount;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 分账收入户PID
	 */
	@ApiField("trans_in_pid")
	private String transInPid;

	public String getExtSchoolId() {
		return this.extSchoolId;
	}
	public void setExtSchoolId(String extSchoolId) {
		this.extSchoolId = extSchoolId;
	}

	public String getOrderPayType() {
		return this.orderPayType;
	}
	public void setOrderPayType(String orderPayType) {
		this.orderPayType = orderPayType;
	}

	public String getRoyaltyAmount() {
		return this.royaltyAmount;
	}
	public void setRoyaltyAmount(String royaltyAmount) {
		this.royaltyAmount = royaltyAmount;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getTransInPid() {
		return this.transInPid;
	}
	public void setTransInPid(String transInPid) {
		this.transInPid = transInPid;
	}

}
