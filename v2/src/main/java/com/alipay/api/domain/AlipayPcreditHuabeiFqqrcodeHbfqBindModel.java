package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗分期分期码绑定
 *
 * @author auto create
 * @since 1.0, 2023-06-28 15:55:21
 */
public class AlipayPcreditHuabeiFqqrcodeHbfqBindModel extends AlipayObject {

	private static final long serialVersionUID = 8311429455423557913L;

	/**
	 * 扩展字段,用于满足一些定制化的绑定需求.
	 */
	@ApiField("fqqr_code_ext_info")
	private FqQrCodeExtendParams fqqrCodeExtInfo;

	/**
	 * 外部请求号,用于唯一标识一次请求.仅可以由英文字母和数字组成.需要保证在服务商端不重复.
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 待绑定的二维码的码值.
	 */
	@ApiField("qr_code_token")
	private String qrCodeToken;

	/**
	 * 二级商户唯一标识
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 服务商唯一标识,联系支付宝工作人员获取.
	 */
	@ApiField("source")
	private String source;

	/**
	 * 商店唯一标识,可以为空.
	 */
	@ApiField("store_id")
	private String storeId;

	public FqQrCodeExtendParams getFqqrCodeExtInfo() {
		return this.fqqrCodeExtInfo;
	}
	public void setFqqrCodeExtInfo(FqQrCodeExtendParams fqqrCodeExtInfo) {
		this.fqqrCodeExtInfo = fqqrCodeExtInfo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getQrCodeToken() {
		return this.qrCodeToken;
	}
	public void setQrCodeToken(String qrCodeToken) {
		this.qrCodeToken = qrCodeToken;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
