package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InteOpSubOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.inteop.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 10:17:42
 */
public class AlipayOpenSpInteopOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8543268587695937734L;

	/** 
	 * 一体化作业主单号
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	/** 
	 * 审核中
	 */
	@ApiField("inteop_order_status")
	private String inteopOrderStatus;

	/** 
	 * 一体化作业子项信息
	 */
	@ApiListField("inteop_sub_order_infos")
	@ApiField("inte_op_sub_order_info")
	private List<InteOpSubOrderInfo> inteopSubOrderInfos;

	/** 
	 * 商户号
	 */
	@ApiField("merchant_oid")
	private String merchantOid;

	/** 
	 * 待办二维码跳转链接
	 */
	@ApiField("wp_qr_code")
	private String wpQrCode;

	/** 
	 * 待办二维码图片链接
	 */
	@ApiField("wp_qr_code_img_url")
	private String wpQrCodeImgUrl;

	/** 
	 * 待办web页面链接
	 */
	@ApiField("wp_web_link")
	private String wpWebLink;

	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}
	public String getInteopOrderNo( ) {
		return this.inteopOrderNo;
	}

	public void setInteopOrderStatus(String inteopOrderStatus) {
		this.inteopOrderStatus = inteopOrderStatus;
	}
	public String getInteopOrderStatus( ) {
		return this.inteopOrderStatus;
	}

	public void setInteopSubOrderInfos(List<InteOpSubOrderInfo> inteopSubOrderInfos) {
		this.inteopSubOrderInfos = inteopSubOrderInfos;
	}
	public List<InteOpSubOrderInfo> getInteopSubOrderInfos( ) {
		return this.inteopSubOrderInfos;
	}

	public void setMerchantOid(String merchantOid) {
		this.merchantOid = merchantOid;
	}
	public String getMerchantOid( ) {
		return this.merchantOid;
	}

	public void setWpQrCode(String wpQrCode) {
		this.wpQrCode = wpQrCode;
	}
	public String getWpQrCode( ) {
		return this.wpQrCode;
	}

	public void setWpQrCodeImgUrl(String wpQrCodeImgUrl) {
		this.wpQrCodeImgUrl = wpQrCodeImgUrl;
	}
	public String getWpQrCodeImgUrl( ) {
		return this.wpQrCodeImgUrl;
	}

	public void setWpWebLink(String wpWebLink) {
		this.wpWebLink = wpWebLink;
	}
	public String getWpWebLink( ) {
		return this.wpWebLink;
	}

}
