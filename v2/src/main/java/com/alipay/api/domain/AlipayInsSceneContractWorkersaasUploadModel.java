package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物险-灵工协议上传
 *
 * @author auto create
 * @since 1.0, 2024-07-23 22:08:14
 */
public class AlipayInsSceneContractWorkersaasUploadModel extends AlipayObject {

	private static final long serialVersionUID = 6194653191745498171L;

	/**
	 * 灵工协议文件列表。
	 */
	@ApiField("files")
	private String files;

	/**
	 * 签约人身份证号。取签约人的身份证号。
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 业务透传参数。原值传递。
	 */
	@ApiField("payload")
	private String payload;

	/**
	 * 签约人手机号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 签约人真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 灵工协议签约订单号。取值为灵工签约订单号。
	 */
	@ApiField("sign_order_no")
	private String signOrderNo;

	/**
	 * 签约时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	public String getFiles() {
		return this.files;
	}
	public void setFiles(String files) {
		this.files = files;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPayload() {
		return this.payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getSignOrderNo() {
		return this.signOrderNo;
	}
	public void setSignOrderNo(String signOrderNo) {
		this.signOrderNo = signOrderNo;
	}

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

}
