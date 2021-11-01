package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消行业口碑码查询信息
 *
 * @author auto create
 * @since 1.0, 2017-09-13 10:34:04
 */
public class RetailKbcodeQueryVo extends AlipayObject {

	private static final long serialVersionUID = 3847323252334183646L;

	/**
	 * 创建口碑码的批次号
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 码的物料模板
	 */
	@ApiField("code_template")
	private String codeTemplate;

	/**
	 * 商户名称，生成码的时候码图片上的提示文案
	 */
	@ApiField("code_tip")
	private String codeTip;

	/**
	 * 口碑码(不带背景)
	 */
	@ApiField("code_url")
	private String codeUrl;

	/**
	 * 口碑码创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 口碑码id
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 口碑码（带背景）
	 */
	@ApiField("resource_url")
	private String resourceUrl;

	/**
	 * 促销员信息
	 */
	@ApiField("salesman")
	private String salesman;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getCodeTemplate() {
		return this.codeTemplate;
	}
	public void setCodeTemplate(String codeTemplate) {
		this.codeTemplate = codeTemplate;
	}

	public String getCodeTip() {
		return this.codeTip;
	}
	public void setCodeTip(String codeTip) {
		this.codeTip = codeTip;
	}

	public String getCodeUrl() {
		return this.codeUrl;
	}
	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getResourceUrl() {
		return this.resourceUrl;
	}
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public String getSalesman() {
		return this.salesman;
	}
	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}

}
