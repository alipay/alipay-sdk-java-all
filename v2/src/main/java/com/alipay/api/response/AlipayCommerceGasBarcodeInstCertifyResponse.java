package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.barcode.inst.certify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-20 11:12:20
 */
public class AlipayCommerceGasBarcodeInstCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2496317531557568445L;

	/** 
	 * 机构支付验证动态码
	 */
	@ApiField("barcode")
	private String barcode;

	/** 
	 * 支付过程中，保存在支付宝系统的机构会员ID，用于机构二次核验，如核验失败，将返回该member_no,成功则不返回
	 */
	@ApiField("member_no")
	private String memberNo;

	/** 
	 * 碰一碰设备sn编号
	 */
	@ApiField("sn")
	private String sn;

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getBarcode( ) {
		return this.barcode;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberNo( ) {
		return this.memberNo;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getSn( ) {
		return this.sn;
	}

}
