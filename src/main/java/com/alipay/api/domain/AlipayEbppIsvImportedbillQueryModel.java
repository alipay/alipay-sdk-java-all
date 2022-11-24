package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询账单导入信息
 *
 * @author auto create
 * @since 1.0, 2020-06-24 10:07:49
 */
public class AlipayEbppIsvImportedbillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8683764991964629584L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 账单导入截止日期
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 机构代码
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 账单导入起始日期
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 子业务类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
