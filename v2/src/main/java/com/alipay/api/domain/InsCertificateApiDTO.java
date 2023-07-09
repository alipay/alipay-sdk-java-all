package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险凭证DTO对象
 *
 * @author auto create
 * @since 1.0, 2016-10-11 21:28:27
 */
public class InsCertificateApiDTO extends AlipayObject {

	private static final long serialVersionUID = 3766531628295672825L;

	/**
	 * 扩展字段
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 保险凭证号
	 */
	@ApiField("certificate_no")
	private String certificateNo;

	/**
	 * 保险凭证类型
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 生效时间
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 失效时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 面值
	 */
	@ApiField("face_value")
	private String faceValue;

	/**
	 * 机构保单号
	 */
	@ApiField("ins_policy_no")
	private String insPolicyNo;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单来源
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 拥有人uid
	 */
	@ApiField("owner_uid")
	private String ownerUid;

	/**
	 * 保险凭证状态
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 使用时间
	 */
	@ApiField("use_time")
	private Date useTime;

	/**
	 * 使用人uid
	 */
	@ApiField("user_uid")
	private String userUid;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getCertificateNo() {
		return this.certificateNo;
	}
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public String getCertificateType() {
		return this.certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public Date getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getFaceValue() {
		return this.faceValue;
	}
	public void setFaceValue(String faceValue) {
		this.faceValue = faceValue;
	}

	public String getInsPolicyNo() {
		return this.insPolicyNo;
	}
	public void setInsPolicyNo(String insPolicyNo) {
		this.insPolicyNo = insPolicyNo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOwnerUid() {
		return this.ownerUid;
	}
	public void setOwnerUid(String ownerUid) {
		this.ownerUid = ownerUid;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Date getUseTime() {
		return this.useTime;
	}
	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	public String getUserUid() {
		return this.userUid;
	}
	public void setUserUid(String userUid) {
		this.userUid = userUid;
	}

}
