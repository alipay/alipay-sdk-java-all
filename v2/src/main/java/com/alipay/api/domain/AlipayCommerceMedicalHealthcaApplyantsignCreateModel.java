package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多方签任务创建
 *
 * @author auto create
 * @since 1.0, 2026-03-09 15:02:43
 */
public class AlipayCommerceMedicalHealthcaApplyantsignCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1224355116651327521L;

	/**
	 * null
	 */
	@ApiListField("ant_sign_file_list")
	@ApiField("ant_sign_file")
	private List<AntSignFile> antSignFileList;

	/**
	 * null
	 */
	@ApiListField("ant_sign_user_info_list")
	@ApiField("ant_sign_user_info")
	private List<AntSignUserInfo> antSignUserInfoList;

	/**
	 * 业务标识
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 请求唯一标识
	 */
	@ApiField("request_id")
	private String requestId;

	public List<AntSignFile> getAntSignFileList() {
		return this.antSignFileList;
	}
	public void setAntSignFileList(List<AntSignFile> antSignFileList) {
		this.antSignFileList = antSignFileList;
	}

	public List<AntSignUserInfo> getAntSignUserInfoList() {
		return this.antSignUserInfoList;
	}
	public void setAntSignUserInfoList(List<AntSignUserInfo> antSignUserInfoList) {
		this.antSignUserInfoList = antSignUserInfoList;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
