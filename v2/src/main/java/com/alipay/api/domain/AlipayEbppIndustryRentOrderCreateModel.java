package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公积金租房提取余额直付房租的账单详情同步
 *
 * @author auto create
 * @since 1.0, 2024-08-26 16:26:26
 */
public class AlipayEbppIndustryRentOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3765996218661834786L;

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

}
