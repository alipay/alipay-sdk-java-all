package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风险内容信息
 *
 * @author auto create
 * @since 1.0, 2022-10-13 10:23:15
 */
public class ContentRiskInfo extends AlipayObject {

	private static final long serialVersionUID = 6255675188642253514L;

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
	 * ocr详细信息，
url方式传输
	 */
	@ApiField("ocr_info")
	private String ocrInfo;

	/**
	 * 外部素材id,代表外部唯一素材
	 */
	@ApiField("out_content_id")
	private String outContentId;

	/**
	 * 素材风险信息列表
	 */
	@ApiListField("risk_info_list")
	@ApiField("risk_info")
	private List<RiskInfo> riskInfoList;

	/**
	 * 子素材风险信息列表
	 */
	@ApiListField("sub_content_risk_info_list")
	@ApiField("sub_content_risk_info")
	private List<SubContentRiskInfo> subContentRiskInfoList;

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

	public List<SubContentRiskInfo> getSubContentRiskInfoList() {
		return this.subContentRiskInfoList;
	}
	public void setSubContentRiskInfoList(List<SubContentRiskInfo> subContentRiskInfoList) {
		this.subContentRiskInfoList = subContentRiskInfoList;
	}

}
