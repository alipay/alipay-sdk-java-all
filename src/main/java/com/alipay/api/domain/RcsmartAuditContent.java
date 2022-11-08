package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解语花审核内容类
 *
 * @author auto create
 * @since 1.0, 2022-10-13 10:11:05
 */
public class RcsmartAuditContent extends AlipayObject {

	private static final long serialVersionUID = 7675792792159432825L;

	/**
	 * 素材业务类型，默认default。特殊场景需根据规则约定勿随意填写，随意填写会导致审核异常。
	 */
	@ApiField("content_biz_type")
	private String contentBizType;

	/**
	 * 素材内容（WORDS传入审核文字信息限制为10000个字节,
PICTURE传外部url，图片文件建议不超过4M,单张传入图像最短边不少于15px,最长边不大于8192px，否则可能影响审核效果或造成审核异常）
若素材来源非蚂蚁域内可能受到域名访问限制，需要开通域名访问，仅支持域名不支持ip访问
大小校验
	 */
	@ApiField("content_data")
	private String contentData;

	/**
	 * 素材传输方式,枚举
目前支持
文字-WORDS/图片-PICTURE/音频-VOICE/文件-FILE
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 预留参数，K-V格式的string
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 文件接口返回的fileId，也就是oss的objectKey
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 外部素材id,代表外部唯一素材
	 */
	@ApiField("out_content_id")
	private String outContentId;

	public String getContentBizType() {
		return this.contentBizType;
	}
	public void setContentBizType(String contentBizType) {
		this.contentBizType = contentBizType;
	}

	public String getContentData() {
		return this.contentData;
	}
	public void setContentData(String contentData) {
		this.contentData = contentData;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getOutContentId() {
		return this.outContentId;
	}
	public void setOutContentId(String outContentId) {
		this.outContentId = outContentId;
	}

}
