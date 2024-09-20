package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟电厂户号上报结果确认
 *
 * @author auto create
 * @since 1.0, 2024-09-12 14:17:22
 */
public class AlipayEbppEbppBillkeySubscribeNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8361171679164951447L;

	/**
	 * 支付宝户号上报流水，户号订阅表的数据库id
	 */
	@ApiField("alipay_join_no")
	private String alipayJoinNo;

	/**
	 * 户号
	 */
	@ApiField("billkey")
	private String billkey;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 户号上报机构确认流水
	 */
	@ApiField("inst_join_no")
	private String instJoinNo;

	/**
	 * 户号不能参与的原因
	 */
	@ApiField("join_fail_reason")
	private String joinFailReason;

	/**
	 * 0-不可参与
1-可参与
	 */
	@ApiField("join_result")
	private String joinResult;

	/**
	 * 省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getAlipayJoinNo() {
		return this.alipayJoinNo;
	}
	public void setAlipayJoinNo(String alipayJoinNo) {
		this.alipayJoinNo = alipayJoinNo;
	}

	public String getBillkey() {
		return this.billkey;
	}
	public void setBillkey(String billkey) {
		this.billkey = billkey;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getInstJoinNo() {
		return this.instJoinNo;
	}
	public void setInstJoinNo(String instJoinNo) {
		this.instJoinNo = instJoinNo;
	}

	public String getJoinFailReason() {
		return this.joinFailReason;
	}
	public void setJoinFailReason(String joinFailReason) {
		this.joinFailReason = joinFailReason;
	}

	public String getJoinResult() {
		return this.joinResult;
	}
	public void setJoinResult(String joinResult) {
		this.joinResult = joinResult;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
