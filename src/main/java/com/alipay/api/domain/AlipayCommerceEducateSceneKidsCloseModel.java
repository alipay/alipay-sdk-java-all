package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * K12业务关闭接口
 *
 * @author auto create
 * @since 1.0, 2019-11-21 16:02:52
 */
public class AlipayCommerceEducateSceneKidsCloseModel extends AlipayObject {

	private static final long serialVersionUID = 7694648741117231885L;

	/**
	 * 业务场景码，SCHOOL_PAYMENT：校园支付，STUDENT_CARD：电子学生卡
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 扩展参数
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
	 * 家长uid
	 */
	@ApiField("parent_uid")
	private String parentUid;

	/**
	 * 学校外标
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * 子业务码，SCHOOL_PAYMENT_ENTRANCE：核身，SCHOOL_PAYMENT_FACEPAY：刷脸支付
	 */
	@ApiField("sub_biz_code")
	private String subBizCode;

	/**
	 * 蚂蚁统一会员ID
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
