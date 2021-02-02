package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通学校结算信息查询
 *
 * @author auto create
 * @since 1.0, 2020-12-22 16:05:42
 */
public class AlipayEcoEduKtSettleinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7622965113426347797L;

	/**
	 * 结算日期：格式为yyyy-MM-dd
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * ISV的支付宝唯一标识PID
	 */
	@ApiField("partner_pid")
	private String partnerPid;

	/**
	 * 支付宝中小学教育缴费分配给学校的编码，学校在支付宝的标识
	 */
	@ApiField("school_no")
	private String schoolNo;

	/**
	 * 直付通二级商户id，商户进件审核通过后会有smid,查询结算信息必须有此信息
	 */
	@ApiField("smid")
	private String smid;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getPartnerPid() {
		return this.partnerPid;
	}
	public void setPartnerPid(String partnerPid) {
		this.partnerPid = partnerPid;
	}

	public String getSchoolNo() {
		return this.schoolNo;
	}
	public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
