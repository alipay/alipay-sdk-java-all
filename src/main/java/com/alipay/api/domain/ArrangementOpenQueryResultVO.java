package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约查询结果bean
 *
 * @author auto create
 * @since 1.0, 2017-03-10 17:03:54
 */
public class ArrangementOpenQueryResultVO extends AlipayObject {

	private static final long serialVersionUID = 4117522788618235463L;

	/**
	 * 合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 合约状态
未生效：UN_INVALID
已取消：CANCEL
已生效：VALID
已失效：INVALID
	 */
	@ApiField("ar_status")
	private String arStatus;

	/**
	 * JSON结构的扩展字段，备用字段
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 有效期截止时间
	 */
	@ApiField("invalid_date")
	private Date invalidDate;

	/**
	 * 签约时间
	 */
	@ApiField("sign_date")
	private Date signDate;

	/**
	 * 有效期起始时间
	 */
	@ApiField("valid_date")
	private Date validDate;

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public String getArStatus() {
		return this.arStatus;
	}
	public void setArStatus(String arStatus) {
		this.arStatus = arStatus;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public Date getInvalidDate() {
		return this.invalidDate;
	}
	public void setInvalidDate(Date invalidDate) {
		this.invalidDate = invalidDate;
	}

	public Date getSignDate() {
		return this.signDate;
	}
	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	public Date getValidDate() {
		return this.validDate;
	}
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

}
