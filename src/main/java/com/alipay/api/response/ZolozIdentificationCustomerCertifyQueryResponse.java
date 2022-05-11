package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.certify.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-13 10:46:37
 */
public class ZolozIdentificationCustomerCertifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7876153241715783832L;

	/** 
	 * 是否为攻击
	 */
	@ApiField("attack")
	private Boolean attack;

	/** 
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 图片字节数组进行Base64编码后的字符串
	 */
	@ApiField("img_str")
	private String imgStr;

	/** 
	 * 比对结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setAttack(Boolean attack) {
		this.attack = attack;
	}
	public Boolean getAttack( ) {
		return this.attack;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setImgStr(String imgStr) {
		this.imgStr = imgStr;
	}
	public String getImgStr( ) {
		return this.imgStr;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
