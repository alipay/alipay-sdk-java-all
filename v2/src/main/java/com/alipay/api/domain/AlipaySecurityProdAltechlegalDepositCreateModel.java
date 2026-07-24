package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新建文件存证
 *
 * @author auto create
 * @since 1.0, 2026-03-26 18:07:44
 */
public class AlipaySecurityProdAltechlegalDepositCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6434492379463284776L;

	/**
	 * 文件类型标识
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 企业的社会信用代码
	 */
	@ApiField("corp_code")
	private String corpCode;

	/**
	 * 存证动作名称
	 */
	@ApiField("deposit_name")
	private String depositName;

	/**
	 * 发起存证的设备信息
	 */
	@ApiField("device_info")
	private String deviceInfo;

	/**
	 * null
	 */
	@ApiListField("file_list")
	@ApiField("file_list")
	private List<FileList> fileList;

	/**
	 * 取证的地址
	 */
	@ApiField("record_address")
	private String recordAddress;

	/**
	 * 来源系统标识，需要与技术对齐，不可随意修改
	 */
	@ApiField("source")
	private String source;

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCorpCode() {
		return this.corpCode;
	}
	public void setCorpCode(String corpCode) {
		this.corpCode = corpCode;
	}

	public String getDepositName() {
		return this.depositName;
	}
	public void setDepositName(String depositName) {
		this.depositName = depositName;
	}

	public String getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public List<FileList> getFileList() {
		return this.fileList;
	}
	public void setFileList(List<FileList> fileList) {
		this.fileList = fileList;
	}

	public String getRecordAddress() {
		return this.recordAddress;
	}
	public void setRecordAddress(String recordAddress) {
		this.recordAddress = recordAddress;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
