package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改服务商开放信息
 *
 * @author auto create
 * @since 1.0, 2024-01-30 15:49:09
 */
public class AlipayPcreditHuabeiIsvOpeninfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8155868727437239487L;

	/**
	 * 扩展字段,用于后续其它一些定制化需求.
	 */
	@ApiField("ext_info")
	private FqQrCodeExtendParams extInfo;

	/**
	 * 服务商侧的营销活动的对客表达文案.录入后将展示在前置页面上.
	 */
	@ApiField("isv_marketing_copy")
	private String isvMarketingCopy;

	/**
	 * 商户希望展示的名称.录入后将被展示在前置页面的收款方位置.
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 一次请求的唯一性标识,调用时需要保证在非重试类请求中不重复.
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 二级商户唯一标识
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 店铺的唯一标识,可以不填写.
	 */
	@ApiField("store_id")
	private String storeId;

	public FqQrCodeExtendParams getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(FqQrCodeExtendParams extInfo) {
		this.extInfo = extInfo;
	}

	public String getIsvMarketingCopy() {
		return this.isvMarketingCopy;
	}
	public void setIsvMarketingCopy(String isvMarketingCopy) {
		this.isvMarketingCopy = isvMarketingCopy;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
