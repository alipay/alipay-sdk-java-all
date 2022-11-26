package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 手动上传文件至法务平台OSS服务器
 *
 * @author auto create
 * @since 1.0, 2022-01-04 20:45:21
 */
public class AlipayBossProdAntlawManualfileUploadModel extends AlipayObject {

	private static final long serialVersionUID = 6453846646145953666L;

	/**
	 * 业务编号
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 文件列表
	 */
	@ApiListField("file_list")
	@ApiField("contract_file_v_o")
	private List<ContractFileVO> fileList;

	/**
	 * 鉴权token
	 */
	@ApiField("request_token")
	private String requestToken;

	/**
	 * 来源系统
	 */
	@ApiField("source_sys")
	private String sourceSys;

	/**
	 * 请求时间戳
	 */
	@ApiField("time_stamp")
	private String timeStamp;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<ContractFileVO> getFileList() {
		return this.fileList;
	}
	public void setFileList(List<ContractFileVO> fileList) {
		this.fileList = fileList;
	}

	public String getRequestToken() {
		return this.requestToken;
	}
	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}

	public String getSourceSys() {
		return this.sourceSys;
	}
	public void setSourceSys(String sourceSys) {
		this.sourceSys = sourceSys;
	}

	public String getTimeStamp() {
		return this.timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
