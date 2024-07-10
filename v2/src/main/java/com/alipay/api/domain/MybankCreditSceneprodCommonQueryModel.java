package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融通用查询
 *
 * @author auto create
 * @since 1.0, 2021-06-01 16:40:28
 */
public class MybankCreditSceneprodCommonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1715926554748747217L;

	/**
	 * 网商申请号
	 */
	@ApiField("app_seq_no")
	private String appSeqNo;

	/**
	 * 代偿数据查询，不同查询场景示例数据不同，可同时包含多个场景查询。
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 代偿数据查询场景
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 机构编码，机构接入场景金融平台时分配，固定值
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 产品编码，场景金融平台给机构提供的产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 本次请求流水号，全局唯一
	 */
	@ApiField("seq_no")
	private String seqNo;

	public String getAppSeqNo() {
		return this.appSeqNo;
	}
	public void setAppSeqNo(String appSeqNo) {
		this.appSeqNo = appSeqNo;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSeqNo() {
		return this.seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

}
