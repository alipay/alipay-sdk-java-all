package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.enrollcertify.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:00:09
 */
public class ZolozIdentificationCustomerEnrollcertifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2388929748151639239L;

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

}
