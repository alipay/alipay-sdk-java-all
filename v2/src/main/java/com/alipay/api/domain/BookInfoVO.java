package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预约信息
 *
 * @author auto create
 * @since 1.0, 2025-09-19 18:00:49
 */
public class BookInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5486722759936925786L;

	/**
	 * 疫苗预约接种时间
	 */
	@ApiField("book_time")
	private Date bookTime;

	/**
	 * 外部疫苗id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 外部交易号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 接种人id
	 */
	@ApiField("patient_id")
	private String patientId;

	/**
	 * 接种人姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 支付方式: 0 线下，1 线上
	 */
	@ApiField("pay_method")
	private Long payMethod;

	/**
	 * 针次信息：第一针、第二针、第三针等
	 */
	@ApiField("vaccine_dose")
	private String vaccineDose;

	public Date getBookTime() {
		return this.bookTime;
	}
	public void setBookTime(Date bookTime) {
		this.bookTime = bookTime;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPatientId() {
		return this.patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Long getPayMethod() {
		return this.payMethod;
	}
	public void setPayMethod(Long payMethod) {
		this.payMethod = payMethod;
	}

	public String getVaccineDose() {
		return this.vaccineDose;
	}
	public void setVaccineDose(String vaccineDose) {
		this.vaccineDose = vaccineDose;
	}

}
