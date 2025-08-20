package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.scene.token.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 15:37:29
 */
public class AlipayCommerceEducateSceneTokenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5433825991111891116L;

	/** 
	 * 资产信息，生成token时候，上传查询资产字段才会返回
	 */
	@ApiField("asset")
	private String asset;

	/** 
	 * 业务场景类型标识
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 刷脸用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 用户外部ID。（服务商内部唯一ID，唯一关联一位学生/教职工)
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/** 
	 * 家长支付宝账户的脱敏信息（特例：特殊标识"ALREADY_RELEASED"，须通过技术支持反馈来关闭开通记录）
	 */
	@ApiField("parent_logon_id")
	private String parentLogonId;

	/** 
	 * 如果是父母为孩子开通，则为父母支付宝openid；如果是用户为本人开通，则为本人支付宝openid。
	 */
	@ApiField("parent_open_id")
	private String parentOpenId;

	/** 
	 * 如果是父母为孩子开通，则为父母支付宝uid；如果是用户为本人开通，则为本人支付宝uid。
	 */
	@ApiField("parent_user_id")
	private String parentUserId;

	/** 
	 * 支付账户uid
	 */
	@ApiField("pay_open_id")
	private String payOpenId;

	/** 
	 * 支付账户uid
	 */
	@ApiField("pay_uid")
	private String payUid;

	/** 
	 * 用户已签约的 PID 列表
	 */
	@ApiListField("payment_pid_list")
	@ApiField("string")
	private List<String> paymentPidList;

	/** 
	 * 学校内标
	 */
	@ApiField("school_code")
	private String schoolCode;

	/** 
	 * 校园一脸通行开通状态
	 */
	@ApiField("school_face_pass_status")
	private String schoolFacePassStatus;

	/** 
	 * 校园一脸通行刷脸支付开通状态
	 */
	@ApiField("school_face_payment_status")
	private String schoolFacePaymentStatus;

	/** 
	 * 学校外标
	 */
	@ApiField("school_std_code")
	private String schoolStdCode;

	/** 
	 * 刷脸用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setAsset(String asset) {
		this.asset = asset;
	}
	public String getAsset( ) {
		return this.asset;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}
	public String getOutUserId( ) {
		return this.outUserId;
	}

	public void setParentLogonId(String parentLogonId) {
		this.parentLogonId = parentLogonId;
	}
	public String getParentLogonId( ) {
		return this.parentLogonId;
	}

	public void setParentOpenId(String parentOpenId) {
		this.parentOpenId = parentOpenId;
	}
	public String getParentOpenId( ) {
		return this.parentOpenId;
	}

	public void setParentUserId(String parentUserId) {
		this.parentUserId = parentUserId;
	}
	public String getParentUserId( ) {
		return this.parentUserId;
	}

	public void setPayOpenId(String payOpenId) {
		this.payOpenId = payOpenId;
	}
	public String getPayOpenId( ) {
		return this.payOpenId;
	}

	public void setPayUid(String payUid) {
		this.payUid = payUid;
	}
	public String getPayUid( ) {
		return this.payUid;
	}

	public void setPaymentPidList(List<String> paymentPidList) {
		this.paymentPidList = paymentPidList;
	}
	public List<String> getPaymentPidList( ) {
		return this.paymentPidList;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getSchoolCode( ) {
		return this.schoolCode;
	}

	public void setSchoolFacePassStatus(String schoolFacePassStatus) {
		this.schoolFacePassStatus = schoolFacePassStatus;
	}
	public String getSchoolFacePassStatus( ) {
		return this.schoolFacePassStatus;
	}

	public void setSchoolFacePaymentStatus(String schoolFacePaymentStatus) {
		this.schoolFacePaymentStatus = schoolFacePaymentStatus;
	}
	public String getSchoolFacePaymentStatus( ) {
		return this.schoolFacePaymentStatus;
	}

	public void setSchoolStdCode(String schoolStdCode) {
		this.schoolStdCode = schoolStdCode;
	}
	public String getSchoolStdCode( ) {
		return this.schoolStdCode;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
