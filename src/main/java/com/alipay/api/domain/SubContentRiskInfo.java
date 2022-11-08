package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 解语花子素材信息
 *
 * @author auto create
 * @since 1.0, 2022-10-13 10:10:58
 */
public class SubContentRiskInfo extends AlipayObject {

	private static final long serialVersionUID = 3454895822149585179L;

	/**
	 * 文件类型
	 */
	@ApiField("content_file_type")
	private String contentFileType;

	/**
	 * 扩展字段
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 预处理生成到子素材可访问url,
	 */
	@ApiField("generated_url")
	private String generatedUrl;

	/**
	 * ocr详细信息，url方式传输
	 */
	@ApiField("ocr_info")
	private String ocrInfo;

	/**
	 * 外部素材id,代表外部唯一素材
	 */
	@ApiField("out_content_id")
	private String outContentId;

	/**
	 * 素材风险信息列表	否
	 */
	@ApiListField("risk_info_list")
	@ApiField("risk_info")
	private List<RiskInfo> riskInfoList;

	public String getContentFileType() {
		return this.contentFileType;
	}
	public void setContentFileType(String contentFileType) {
		this.contentFileType = contentFileType;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getGeneratedUrl() {
		return this.generatedUrl;
	}
	public void setGeneratedUrl(String generatedUrl) {
		this.generatedUrl = generatedUrl;
	}

	public String getOcrInfo() {
		return this.ocrInfo;
	}
	public void setOcrInfo(String ocrInfo) {
		this.ocrInfo = ocrInfo;
	}

	public String getOutContentId() {
		return this.outContentId;
	}
	public void setOutContentId(String outContentId) {
		this.outContentId = outContentId;
	}

	public List<RiskInfo> getRiskInfoList() {
		return this.riskInfoList;
	}
	public void setRiskInfoList(List<RiskInfo> riskInfoList) {
		this.riskInfoList = riskInfoList;
	}

}
