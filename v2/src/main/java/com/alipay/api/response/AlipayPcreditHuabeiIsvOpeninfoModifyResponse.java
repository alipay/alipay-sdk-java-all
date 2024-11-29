package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FqQrCodeExtendParams;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.isv.openinfo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-30 15:52:00
 */
public class AlipayPcreditHuabeiIsvOpeninfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6831659295962969195L;

	/** 
	 * 声明了本响应数据的用途.仅做说明使用,调用方无需消费.
	 */
	@ApiField("disclaimer")
	private String disclaimer;

	/** 
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private FqQrCodeExtendParams extInfo;

	/** 
	 * 服务商侧的营销活动的对客表达文案.与请求中isv_marketing_copy字段值一致.
	 */
	@ApiField("isv_marketing_copy")
	private String isvMarketingCopy;

	/** 
	 * 商户名称.与请求中的merchant_name字段值一致.
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 外部请求号,取自请求中的同名字段,用来标识当前结果对应哪个写入/查询请求.
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 二级商户唯一标识.标识了本响应中的相关信息对应了哪个二级商户.
	 */
	@ApiField("smid")
	private String smid;

	/** 
	 * 店铺的唯一标识.与请求中的同名参数相对应,如果没有店铺编号则为空.
	 */
	@ApiField("store_id")
	private String storeId;

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}
	public String getDisclaimer( ) {
		return this.disclaimer;
	}

	public void setExtInfo(FqQrCodeExtendParams extInfo) {
		this.extInfo = extInfo;
	}
	public FqQrCodeExtendParams getExtInfo( ) {
		return this.extInfo;
	}

	public void setIsvMarketingCopy(String isvMarketingCopy) {
		this.isvMarketingCopy = isvMarketingCopy;
	}
	public String getIsvMarketingCopy( ) {
		return this.isvMarketingCopy;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getSmid( ) {
		return this.smid;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreId( ) {
		return this.storeId;
	}

}
