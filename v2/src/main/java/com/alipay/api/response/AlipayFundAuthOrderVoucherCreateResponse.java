package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.auth.order.voucher.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-26 10:39:32
 */
public class AlipayFundAuthOrderVoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4331496163133864941L;

	/** 
	 * 码类型，分为  barCode：条形码 (一维码) 和 qrCode:二维码(qrCode) ；
目前发码只支持 qrCode
	 */
	@ApiField("code_type")
	private String codeType;

	/** 
	 * 生成的带有支付宝logo的二维码地址，如：http://mobilecodec.alipay.com/show.htm?code=aeparsv2dknkqf3018556a；商户端通过在末尾追加picSize来指定要显示的图片大小，如
显示1280大小的URL:http://mobilecodec.alipay.com/show.htm?code=aeparsv2dknkqf3018556a&picSize=1280；目前支持的大小有：256, 227, 270, 344, 430, 512, 570, 860, 1280, 1546；
	 */
	@ApiField("code_url")
	private String codeUrl;

	/** 
	 * 当前发码请求生成的二维码码串，商户端可以利用二维码生成工具根据该码串值生成对应的二维码
	 */
	@ApiField("code_value")
	private String codeValue;

	/** 
	 * 商户的授权资金订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户本次资金操作的请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}
	public String getCodeType( ) {
		return this.codeType;
	}

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}
	public String getCodeUrl( ) {
		return this.codeUrl;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}
	public String getCodeValue( ) {
		return this.codeValue;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
