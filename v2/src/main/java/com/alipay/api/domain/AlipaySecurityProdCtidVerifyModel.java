package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网证验证接口
 *
 * @author auto create
 * @since 1.0, 2022-07-18 14:43:40
 */
public class AlipaySecurityProdCtidVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 2324542815217133883L;

	/**
	 * 身份证号码
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 认证模式
	 */
	@ApiField("identify_model")
	private String identifyModel;

	/**
	 * 图片的base64编码
	 */
	@ApiField("picture")
	private String picture;

	/**
	 * 个人用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getIdentifyModel() {
		return this.identifyModel;
	}
	public void setIdentifyModel(String identifyModel) {
		this.identifyModel = identifyModel;
	}

	public String getPicture() {
		return this.picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
