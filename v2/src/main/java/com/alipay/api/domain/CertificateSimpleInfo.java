package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-12 13:47:58
 */
public class CertificateSimpleInfo extends AlipayObject {

	private static final long serialVersionUID = 3724592194431535648L;

	/**
	 * 凭证ID
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 核销准备加密数据
	 */
	@ApiField("encrypted_data")
	private String encryptedData;

	/**
	 * null
	 */
	@ApiListField("goods")
	@ApiField("certificate_goods_info")
	private List<CertificateGoodsInfo> goods;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getEncryptedData() {
		return this.encryptedData;
	}
	public void setEncryptedData(String encryptedData) {
		this.encryptedData = encryptedData;
	}

	public List<CertificateGoodsInfo> getGoods() {
		return this.goods;
	}
	public void setGoods(List<CertificateGoodsInfo> goods) {
		this.goods = goods;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
