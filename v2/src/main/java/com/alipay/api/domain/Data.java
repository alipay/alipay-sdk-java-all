package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用于查询用户数据
 *
 * @author auto create
 * @since 1.0, 2022-11-28 12:09:27
 */
public class Data extends AlipayObject {

	private static final long serialVersionUID = 3831744383897478586L;

	/**
	 * 支付宝用户唯一标识列表
	 */
	@ApiListField("alipay_open_id_list")
	@ApiField("string")
	private List<String> alipayOpenIdList;

	/**
	 * 对应userIdList，标准Alipay UserId列表
	 */
	@ApiListField("alipay_user_id_list")
	@ApiField("string")
	private List<String> alipayUserIdList;

	/**
	 * 支付宝用户唯一标识列表
	 */
	@ApiListField("open_id_list")
	@ApiField("string")
	private List<String> openIdList;

	/**
	 * 用户id列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public List<String> getAlipayOpenIdList() {
		return this.alipayOpenIdList;
	}
	public void setAlipayOpenIdList(List<String> alipayOpenIdList) {
		this.alipayOpenIdList = alipayOpenIdList;
	}

	public List<String> getAlipayUserIdList() {
		return this.alipayUserIdList;
	}
	public void setAlipayUserIdList(List<String> alipayUserIdList) {
		this.alipayUserIdList = alipayUserIdList;
	}

	public List<String> getOpenIdList() {
		return this.openIdList;
	}
	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
	}

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
