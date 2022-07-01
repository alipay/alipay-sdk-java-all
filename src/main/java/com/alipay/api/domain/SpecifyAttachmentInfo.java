package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 指定签署人需要上传的附件
 *
 * @author auto create
 * @since 1.0, 2020-08-19 20:42:03
 */
public class SpecifyAttachmentInfo extends AlipayObject {

	private static final long serialVersionUID = 6657856627146127155L;

	/**
	 * 是否允许上传更多附件，默认值为false。开启后，除了“collect_common_codes”中指定的附件，签署人可自由上传至多10张图片。
	 */
	@ApiField("allow_more_uploads")
	private Boolean allowMoreUploads;

	/**
	 * 允许上传更多附件时，可上传的最大附件数，一次流程中累计的上传附件数至多30（含“附件列表”数量）
	 */
	@ApiField("allow_more_uploads_max_count")
	private Long allowMoreUploadsMaxCount;

	/**
	 * 需要签署人上传的证件照片，可进行ORC识别，目前仅支持IDCARD
	 */
	@ApiListField("collect_cert_types")
	@ApiField("string")
	private List<String> collectCertTypes;

	/**
	 * 需要签署人上传的其他附件列表，即attachment_explain.details中定义的code列表
	 */
	@ApiListField("collect_common_codes")
	@ApiField("string")
	private List<String> collectCommonCodes;

	/**
	 * 个人唯一标识，对应签署区中指定的签署人
	 */
	@ApiField("third_party_user_id")
	private String thirdPartyUserId;

	public Boolean getAllowMoreUploads() {
		return this.allowMoreUploads;
	}
	public void setAllowMoreUploads(Boolean allowMoreUploads) {
		this.allowMoreUploads = allowMoreUploads;
	}

	public Long getAllowMoreUploadsMaxCount() {
		return this.allowMoreUploadsMaxCount;
	}
	public void setAllowMoreUploadsMaxCount(Long allowMoreUploadsMaxCount) {
		this.allowMoreUploadsMaxCount = allowMoreUploadsMaxCount;
	}

	public List<String> getCollectCertTypes() {
		return this.collectCertTypes;
	}
	public void setCollectCertTypes(List<String> collectCertTypes) {
		this.collectCertTypes = collectCertTypes;
	}

	public List<String> getCollectCommonCodes() {
		return this.collectCommonCodes;
	}
	public void setCollectCommonCodes(List<String> collectCommonCodes) {
		this.collectCommonCodes = collectCommonCodes;
	}

	public String getThirdPartyUserId() {
		return this.thirdPartyUserId;
	}
	public void setThirdPartyUserId(String thirdPartyUserId) {
		this.thirdPartyUserId = thirdPartyUserId;
	}

}
