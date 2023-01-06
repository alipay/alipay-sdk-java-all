package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当面付二阶段
 *
 * @author auto create
 * @since 1.0, 2022-11-22 20:10:15
 */
public class AlipayMarketingFacetofaceTwostageUseModel extends AlipayObject {

	private static final long serialVersionUID = 7546158897531315388L;

	/**
	 * 业务场景码，外部商户在接入时需要进行分配
	 */
	@ApiField("biz_sence")
	private String bizSence;

	/**
	 * 付钱码码值
	 */
	@ApiField("dynamic_id")
	private String dynamicId;

	/**
	 * 业务扩展参数
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 业务场景唯一编号，用于标识这笔请求，每次调用请勿使用相同的sence_no，每笔请求的sence_no必须不一样，支付时传递的DYNAMIC_TOKEN_OUT_BIZ_NO必须与调用开放平台传递的sence_no保持一致
	 */
	@ApiField("sence_no")
	private String senceNo;

	public String getBizSence() {
		return this.bizSence;
	}
	public void setBizSence(String bizSence) {
		this.bizSence = bizSence;
	}

	public String getDynamicId() {
		return this.dynamicId;
	}
	public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getSenceNo() {
		return this.senceNo;
	}
	public void setSenceNo(String senceNo) {
		this.senceNo = senceNo;
	}

}
