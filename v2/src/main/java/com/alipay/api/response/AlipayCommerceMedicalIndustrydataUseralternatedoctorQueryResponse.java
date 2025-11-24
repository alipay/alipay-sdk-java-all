package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserAlternateDoctor;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.useralternatedoctor.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 19:21:56
 */
public class AlipayCommerceMedicalIndustrydataUseralternatedoctorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2292792335536858392L;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 已备选医生list<好大夫Id、医生内部Id、备选操作时间>
	 */
	@ApiListField("alternate_doctor_list")
	@ApiField("user_alternate_doctor")
	private List<UserAlternateDoctor> alternateDoctorList;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id_open_id")
	private String userIdOpenId;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setAlternateDoctorList(List<UserAlternateDoctor> alternateDoctorList) {
		this.alternateDoctorList = alternateDoctorList;
	}
	public List<UserAlternateDoctor> getAlternateDoctorList( ) {
		return this.alternateDoctorList;
	}

	public void setUserIdOpenId(String userIdOpenId) {
		this.userIdOpenId = userIdOpenId;
	}
	public String getUserIdOpenId( ) {
		return this.userIdOpenId;
	}

}
