package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请款结算
 *
 * @author auto create
 * @since 1.0, 2022-07-12 21:04:38
 */
public class AlipayEbppIndustryClearApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7888616978942888256L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务日期
	 */
	@ApiField("business_date")
	private String businessDate;

	/**
	 * 机构请款的备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 机构代码
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 请款编号
	 */
	@ApiField("passive_no")
	private String passiveNo;

	/**
	 * 子机构编码
	 */
	@ApiField("sub_org_code")
	private String subOrgCode;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBusinessDate() {
		return this.businessDate;
	}
	public void setBusinessDate(String businessDate) {
		this.businessDate = businessDate;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getPassiveNo() {
		return this.passiveNo;
	}
	public void setPassiveNo(String passiveNo) {
		this.passiveNo = passiveNo;
	}

	public String getSubOrgCode() {
		return this.subOrgCode;
	}
	public void setSubOrgCode(String subOrgCode) {
		this.subOrgCode = subOrgCode;
	}

}
