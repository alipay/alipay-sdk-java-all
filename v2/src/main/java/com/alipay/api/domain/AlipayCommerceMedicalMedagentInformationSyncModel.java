package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信息同步接口
 *
 * @author auto create
 * @since 1.0, 2025-03-31 09:33:17
 */
public class AlipayCommerceMedicalMedagentInformationSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2251448484221475932L;

	/**
	 * 支付宝2088id
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * String	合作方dataId，重复调用dataId已存在会更新数据
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 数据类型，枚举基于双方业务约定
USER_INFO（用户信息），病程概要,SCALE（量表）,PIC（图片），治疗计划，
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 蚂蚁侧医生id，线下提供映射即可
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
