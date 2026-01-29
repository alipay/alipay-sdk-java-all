package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业生码接口
 *
 * @author auto create
 * @since 1.0, 2025-04-27 10:12:29
 */
public class AlipayCommerceTransportIndustryQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6329974963237158338L;

	/**
	 * null
	 */
	@ApiListField("detail_list")
	@ApiField("ebike_charge_qrcode_param")
	private List<EbikeChargeQrcodeParam> detailList;

	/**
	 * code：只需要生成码值
all：生成码值和图片
	 */
	@ApiField("qr_code_type")
	private String qrCodeType;

	/**
	 * 是否使用短链接（不传则默认值为true）。
值为true时，会转成短链接生成二维码图片
	 */
	@ApiField("use_short_url")
	private Boolean useShortUrl;

	public List<EbikeChargeQrcodeParam> getDetailList() {
		return this.detailList;
	}
	public void setDetailList(List<EbikeChargeQrcodeParam> detailList) {
		this.detailList = detailList;
	}

	public String getQrCodeType() {
		return this.qrCodeType;
	}
	public void setQrCodeType(String qrCodeType) {
		this.qrCodeType = qrCodeType;
	}

	public Boolean getUseShortUrl() {
		return this.useShortUrl;
	}
	public void setUseShortUrl(Boolean useShortUrl) {
		this.useShortUrl = useShortUrl;
	}

}
