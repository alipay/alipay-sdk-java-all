package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行机票低价查询接口
 *
 * @author auto create
 * @since 1.0, 2025-02-14 10:42:10
 */
public class AlipayCommerceTransportAirticketTobpriceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4516498415275575256L;

	/**
	 * 到达城市三字码
	 */
	@ApiField("arr_city_code")
	private String arrCityCode;

	/**
	 * 出发城市三字码
	 */
	@ApiField("dep_city_code")
	private String depCityCode;

	/**
	 * 出发日期
	 */
	@ApiField("dep_date")
	private String depDate;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getArrCityCode() {
		return this.arrCityCode;
	}
	public void setArrCityCode(String arrCityCode) {
		this.arrCityCode = arrCityCode;
	}

	public String getDepCityCode() {
		return this.depCityCode;
	}
	public void setDepCityCode(String depCityCode) {
		this.depCityCode = depCityCode;
	}

	public String getDepDate() {
		return this.depDate;
	}
	public void setDepDate(String depDate) {
		this.depDate = depDate;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
