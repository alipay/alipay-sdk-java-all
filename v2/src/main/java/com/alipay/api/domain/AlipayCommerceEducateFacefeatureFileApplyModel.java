package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸特征文件申请
 *
 * @author auto create
 * @since 1.0, 2021-07-23 15:20:25
 */
public class AlipayCommerceEducateFacefeatureFileApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1316975916369332191L;

	/**
	 * SCHOOL_PAYMENT
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 需要请求的特征版本
	 */
	@ApiField("feature_version")
	private String featureVersion;

	/**
	 * 需要请求的文件日期
	 */
	@ApiField("file_date")
	private String fileDate;

	/**
	 * 需要请求的文件类型,ALL:全量,INCREASE:增量,REALTIME:实时
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 国家统一分配的学校社会信用代码(institution_id)
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 必须是由支付宝业务方分配的英文简称(例如:yikeshi),不能是中文
	 */
	@ApiField("isv_name")
	private String isvName;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getFeatureVersion() {
		return this.featureVersion;
	}
	public void setFeatureVersion(String featureVersion) {
		this.featureVersion = featureVersion;
	}

	public String getFileDate() {
		return this.fileDate;
	}
	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

}
