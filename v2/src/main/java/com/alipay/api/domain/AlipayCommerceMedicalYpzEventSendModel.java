package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康管家云陪诊开放接口
 *
 * @author auto create
 * @since 1.0, 2025-06-06 10:48:47
 */
public class AlipayCommerceMedicalYpzEventSendModel extends AlipayObject {

	private static final long serialVersionUID = 7288643345133963618L;

	/**
	 * 服务端根据功能需要传过来
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 业务类型：
预约记录:YYJL
挂号记录(预约+当日):GHJL
门诊就诊记录:MZJZJL
停诊通知:TZTZ
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 医院id
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 用来判断业务执行哪个流程
数据上传:UPLOAD
数据更新:UPDATE
	 */
	@ApiField("op_code")
	private String opCode;

	/**
	 * 机构id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 区域平台归属单位的18位统一社会信用代码。（单家医疗机构接入时不可传值），通过区域平台接入方式请求时必传。
	 */
	@ApiField("platform_code")
	private String platformCode;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getOpCode() {
		return this.opCode;
	}
	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

}
