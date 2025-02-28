package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI秤设备激活码操作记录对象
 *
 * @author auto create
 * @since 1.0, 2024-10-15 13:40:14
 */
public class ScalesActivationCodeDeviceRelationInfo extends AlipayObject {

	private static final long serialVersionUID = 2375414448216911169L;

	/**
	 * 蚂蚁激活码
	 */
	@ApiField("activation_code")
	private String activationCode;

	/**
	 * 激活码绑定类型（绑定/解绑）
	 */
	@ApiField("bind_type")
	private String bindType;

	/**
	 * 蚂蚁IOT机具设备号
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 服务商设备号，mac地址
	 */
	@ApiField("isv_tid")
	private String isvTid;

	/**
	 * 操作时间
	 */
	@ApiField("operate_time")
	private Date operateTime;

	/**
	 * 记录操作类型(激活码/设备白名单)
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * 设备白名单操作类型(创建/删除)
	 */
	@ApiField("white_operate_type")
	private String whiteOperateType;

	public String getActivationCode() {
		return this.activationCode;
	}
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public String getBindType() {
		return this.bindType;
	}
	public void setBindType(String bindType) {
		this.bindType = bindType;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getIsvTid() {
		return this.isvTid;
	}
	public void setIsvTid(String isvTid) {
		this.isvTid = isvTid;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getWhiteOperateType() {
		return this.whiteOperateType;
	}
	public void setWhiteOperateType(String whiteOperateType) {
		this.whiteOperateType = whiteOperateType;
	}

}
