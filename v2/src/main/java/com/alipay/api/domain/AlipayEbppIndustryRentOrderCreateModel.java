package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公积金租房提取余额直付房租的账单详情同步
 *
 * @author auto create
 * @since 1.0, 2024-12-19 22:32:17
 */
public class AlipayEbppIndustryRentOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1432577378234517551L;

	/**
	 * 中心编号
	 */
	@ApiField("accfund_center_no")
	private String accfundCenterNo;

	/**
	 * 租房账单明细详情
	 */
	@ApiField("bill_detail")
	private RentPayBillDetail billDetail;

	/**
	 * 租房平台调用预创单接口后在该时间后业务超时(单位分钟)
	 */
	@ApiField("biz_time_out")
	private Long bizTimeOut;

	/**
	 * 身份证件号码md5加密后的字符串
	 */
	@ApiField("cert_num")
	private String certNum;

	/**
	 * 租房平台简称
	 */
	@ApiField("housing_name")
	private String housingName;

	/**
	 * 租房平台订单房源地址
	 */
	@ApiField("housing_url")
	private String housingUrl;

	/**
	 * 公积金机构所属城市编码
	 */
	@ApiField("org_city")
	private String orgCity;

	/**
	 * 公积金中心机构编码
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付完成后的跳转回租房平台的地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 租房直付银行信息
	 */
	@ApiField("rent_bank_info")
	private RentPayBankInfo rentBankInfo;

	/**
	 * 用户租房合同信息
	 */
	@ApiField("rent_contract_info")
	private RentPayContractInfo rentContractInfo;

	public String getAccfundCenterNo() {
		return this.accfundCenterNo;
	}
	public void setAccfundCenterNo(String accfundCenterNo) {
		this.accfundCenterNo = accfundCenterNo;
	}

	public RentPayBillDetail getBillDetail() {
		return this.billDetail;
	}
	public void setBillDetail(RentPayBillDetail billDetail) {
		this.billDetail = billDetail;
	}

	public Long getBizTimeOut() {
		return this.bizTimeOut;
	}
	public void setBizTimeOut(Long bizTimeOut) {
		this.bizTimeOut = bizTimeOut;
	}

	public String getCertNum() {
		return this.certNum;
	}
	public void setCertNum(String certNum) {
		this.certNum = certNum;
	}

	public String getHousingName() {
		return this.housingName;
	}
	public void setHousingName(String housingName) {
		this.housingName = housingName;
	}

	public String getHousingUrl() {
		return this.housingUrl;
	}
	public void setHousingUrl(String housingUrl) {
		this.housingUrl = housingUrl;
	}

	public String getOrgCity() {
		return this.orgCity;
	}
	public void setOrgCity(String orgCity) {
		this.orgCity = orgCity;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public RentPayBankInfo getRentBankInfo() {
		return this.rentBankInfo;
	}
	public void setRentBankInfo(RentPayBankInfo rentBankInfo) {
		this.rentBankInfo = rentBankInfo;
	}

	public RentPayContractInfo getRentContractInfo() {
		return this.rentContractInfo;
	}
	public void setRentContractInfo(RentPayContractInfo rentContractInfo) {
		this.rentContractInfo = rentContractInfo;
	}

}
