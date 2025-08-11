package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 评估单条数据项
 *
 * @author auto create
 * @since 1.0, 2024-03-08 09:25:30
 */
public class EvalueateItem extends AlipayObject {

	private static final long serialVersionUID = 6171755765936975439L;

	/**
	 * 评估指标列表
	 */
	@ApiListField("evaluate_indicates")
	@ApiField("evaluate_indicate")
	private List<EvaluateIndicate> evaluateIndicates;

	/**
	 * 评测标准
	 */
	@ApiField("evaluate_standard")
	private String evaluateStandard;

	/**
	 * 评估类型
	 */
	@ApiField("evaluate_type")
	private String evaluateType;

	/**
	 * 评估车型图片
	 */
	@ApiField("evalueate_model_img")
	private String evalueateModelImg;

	/**
	 * 评估报告图片
	 */
	@ApiField("evalueate_report_img")
	private String evalueateReportImg;

	/**
	 * 商户车型id
	 */
	@ApiField("isv_model_id")
	private String isvModelId;

	/**
	 * 商户车型名称
	 */
	@ApiField("isv_model_name")
	private String isvModelName;

	/**
	 * 商户车系id
	 */
	@ApiField("isv_series_id")
	private String isvSeriesId;

	/**
	 * 商户车系名称
	 */
	@ApiField("isv_series_name")
	private String isvSeriesName;

	public List<EvaluateIndicate> getEvaluateIndicates() {
		return this.evaluateIndicates;
	}
	public void setEvaluateIndicates(List<EvaluateIndicate> evaluateIndicates) {
		this.evaluateIndicates = evaluateIndicates;
	}

	public String getEvaluateStandard() {
		return this.evaluateStandard;
	}
	public void setEvaluateStandard(String evaluateStandard) {
		this.evaluateStandard = evaluateStandard;
	}

	public String getEvaluateType() {
		return this.evaluateType;
	}
	public void setEvaluateType(String evaluateType) {
		this.evaluateType = evaluateType;
	}

	public String getEvalueateModelImg() {
		return this.evalueateModelImg;
	}
	public void setEvalueateModelImg(String evalueateModelImg) {
		this.evalueateModelImg = evalueateModelImg;
	}

	public String getEvalueateReportImg() {
		return this.evalueateReportImg;
	}
	public void setEvalueateReportImg(String evalueateReportImg) {
		this.evalueateReportImg = evalueateReportImg;
	}

	public String getIsvModelId() {
		return this.isvModelId;
	}
	public void setIsvModelId(String isvModelId) {
		this.isvModelId = isvModelId;
	}

	public String getIsvModelName() {
		return this.isvModelName;
	}
	public void setIsvModelName(String isvModelName) {
		this.isvModelName = isvModelName;
	}

	public String getIsvSeriesId() {
		return this.isvSeriesId;
	}
	public void setIsvSeriesId(String isvSeriesId) {
		this.isvSeriesId = isvSeriesId;
	}

	public String getIsvSeriesName() {
		return this.isvSeriesName;
	}
	public void setIsvSeriesName(String isvSeriesName) {
		this.isvSeriesName = isvSeriesName;
	}

}
