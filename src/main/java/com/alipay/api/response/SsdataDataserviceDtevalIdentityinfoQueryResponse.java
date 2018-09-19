package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.dteval.identityinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-14 11:33:40
 */
public class SsdataDataserviceDtevalIdentityinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1228619875887115813L;

	/** 
	 * 返回消息描述(description)，代表查询的信息，如果status=false时候，该值会对没有查询到的情况进行解释
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 身份证号码(id_card_no)，代表查询到的用户身份证号码，该值由dteval实现的处理器处理后返回，但是前提是status=true
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/** 
	 * 手机号(phone)，代表用户传入的值，系统不做处理，直接原样返回，代表该笔业务的一个凭证信息
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 状态(status)，代表匹配结果，如果是true，代表通过手机号查询到了身份信息，即三要素(姓名，身份证号码，手机号)信息，如果是false，代表没有查询到
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 用户姓名(user_name)，代表查询到的用户姓名，该值由dteval实现的处理器处理后返回，但是前提是status=true
	 */
	@ApiField("user_name")
	private String userName;

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public String getIdCardNo( ) {
		return this.idCardNo;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
