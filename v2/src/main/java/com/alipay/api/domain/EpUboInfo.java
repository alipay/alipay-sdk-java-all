package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受益所有人列表
 *
 * @author auto create
 * @since 1.0, 2026-10-28 11:05:00
 */
public class EpUboInfo extends AlipayObject {

	private static final long serialVersionUID = 5179468842438779725L;

	/**
	 * 受益比例
	 */
	@ApiField("bene_share_ratio")
	private String beneShareRatio;

	/**
	 * 控制形式
	 */
	@ApiField("control_way")
	private String controlWay;

	/**
	 * 识别标准
	 */
	@ApiField("identify_criteria")
	private String identifyCriteria;

	/**
	 * 识别方式
	 */
	@ApiField("identify_way")
	private String identifyWay;

	/**
	 * 穿透层级
	 */
	@ApiField("layer")
	private String layer;

	/**
	 * 任职类型
	 */
	@ApiField("position_type")
	private String positionType;

	/**
	 * 备案类型
	 */
	@ApiField("record_type")
	private String recordType;

	/**
	 * 受益所有权终止日期
	 */
	@ApiField("ubo_end_date")
	private String uboEndDate;

	/**
	 * 扩展信息（name  名称、ratio 持股比例、crn 统代）
	 */
	@ApiField("ubo_ext")
	private String uboExt;

	/**
	 * 受益所有权形成日期
	 */
	@ApiField("ubo_form_date")
	private String uboFormDate;

	/**
	 * 受益所有人名称
	 */
	@ApiField("ubo_name")
	private String uboName;

	/**
	 * 表决权比例
	 */
	@ApiField("vote_right_ratio")
	private String voteRightRatio;

	public String getBeneShareRatio() {
		return this.beneShareRatio;
	}
	public void setBeneShareRatio(String beneShareRatio) {
		this.beneShareRatio = beneShareRatio;
	}

	public String getControlWay() {
		return this.controlWay;
	}
	public void setControlWay(String controlWay) {
		this.controlWay = controlWay;
	}

	public String getIdentifyCriteria() {
		return this.identifyCriteria;
	}
	public void setIdentifyCriteria(String identifyCriteria) {
		this.identifyCriteria = identifyCriteria;
	}

	public String getIdentifyWay() {
		return this.identifyWay;
	}
	public void setIdentifyWay(String identifyWay) {
		this.identifyWay = identifyWay;
	}

	public String getLayer() {
		return this.layer;
	}
	public void setLayer(String layer) {
		this.layer = layer;
	}

	public String getPositionType() {
		return this.positionType;
	}
	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	public String getRecordType() {
		return this.recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getUboEndDate() {
		return this.uboEndDate;
	}
	public void setUboEndDate(String uboEndDate) {
		this.uboEndDate = uboEndDate;
	}

	public String getUboExt() {
		return this.uboExt;
	}
	public void setUboExt(String uboExt) {
		this.uboExt = uboExt;
	}

	public String getUboFormDate() {
		return this.uboFormDate;
	}
	public void setUboFormDate(String uboFormDate) {
		this.uboFormDate = uboFormDate;
	}

	public String getUboName() {
		return this.uboName;
	}
	public void setUboName(String uboName) {
		this.uboName = uboName;
	}

	public String getVoteRightRatio() {
		return this.voteRightRatio;
	}
	public void setVoteRightRatio(String voteRightRatio) {
		this.voteRightRatio = voteRightRatio;
	}

}
