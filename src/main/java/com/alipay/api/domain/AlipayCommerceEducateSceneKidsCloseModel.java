package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * K12业务关闭接口
 *
 * @author auto create
 * @since 1.0, 2022-04-27 22:33:42
 */
public class AlipayCommerceEducateSceneKidsCloseModel extends AlipayObject {

	private static final long serialVersionUID = 6237896166524714211L;

	/**
	 * 业务场景码。SCHOOL_PAYMENT：校园支付，STUDENT_CARD：电子学生卡
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 扩展参数。（1.当bizCode是SCHOOL_PAYMENT，cert_type,cert_no必传；2.当sub_biz_code是SCHOOL_PAYMENT_FACEPAY，agreement_no必传）
（cert_type枚举：1.身份证(IDENTITY_CARD)；2.护照(PASSPORT)；3.学工号(STUDENT_NUMBER)）
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 接口调用id，需保证唯一做幂等
	 */
	@ApiField("invoke_id")
	private String invokeId;

	/**
	 * 备注，可注明业务场景或特殊说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 家长uid。（如果是关闭家长代开通，当前参数必选）
	 */
	@ApiField("parent_uid")
	private String parentUid;

	/**
	 * 学校外标，即学校的统一信用编码。（当biz_code为SCHOOL_PAYMENT时，当前参数必选）
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * 子业务码（当biz_code为SCHOOL_PAYMENT时，当前参数必选）。
{SCHOOL_PAYMENT_ENTRANCE：核身，SCHOOL_PAYMENT_FACEPAY：刷脸支付_代扣，
SCHOOL_PAYMENT_FACEPAY_BANK：刷脸支付_ftoken}
	 */
	@ApiField("sub_biz_code")
	private String subBizCode;

	/**
	 * 蚂蚁统一会员ID
（当biz_code为SCHOOL_PAYMENT时，当前参数必选）
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getInvokeId() {
		return this.invokeId;
	}
	public void setInvokeId(String invokeId) {
		this.invokeId = invokeId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getParentUid() {
		return this.parentUid;
	}
	public void setParentUid(String parentUid) {
		this.parentUid = parentUid;
	}

	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

	public String getSubBizCode() {
		return this.subBizCode;
	}
	public void setSubBizCode(String subBizCode) {
		this.subBizCode = subBizCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
