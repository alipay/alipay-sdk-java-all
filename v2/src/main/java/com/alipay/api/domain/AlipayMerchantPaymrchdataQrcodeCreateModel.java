package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付商家渠道开通经营码开放接口
 *
 * @author auto create
 * @since 1.0, 2025-01-21 13:27:53
 */
public class AlipayMerchantPaymrchdataQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7195288739956567974L;

	/**
	 * 商户经营地址
	 */
	@ApiField("business_address_info")
	private MdAddressInfo businessAddressInfo;

	/**
	 * 商户证件信息（商户营业执照号、法人身份证号等）
	 */
	@ApiListField("certificate_infos")
	@ApiField("md_certificate_info")
	private List<MdCertificateInfo> certificateInfos;

	/**
	 * 联系人信息
	 */
	@ApiListField("contact_persons")
	@ApiField("contact_person")
	private List<ContactPerson> contactPersons;

	/**
	 * 调用方外部唯一ID
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户mcc信息，mcc模型定义使用调用方的
	 */
	@ApiField("mcc_info")
	private MccInfo mccInfo;

	/**
	 * 开通经营码的店铺名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 门头照链接
	 */
	@ApiField("shop_door_pic")
	private String shopDoorPic;

	/**
	 * 请求来源，用做权限校验和流水记录
	 */
	@ApiField("source")
	private String source;

	public MdAddressInfo getBusinessAddressInfo() {
		return this.businessAddressInfo;
	}
	public void setBusinessAddressInfo(MdAddressInfo businessAddressInfo) {
		this.businessAddressInfo = businessAddressInfo;
	}

	public List<MdCertificateInfo> getCertificateInfos() {
		return this.certificateInfos;
	}
	public void setCertificateInfos(List<MdCertificateInfo> certificateInfos) {
		this.certificateInfos = certificateInfos;
	}

	public List<ContactPerson> getContactPersons() {
		return this.contactPersons;
	}
	public void setContactPersons(List<ContactPerson> contactPersons) {
		this.contactPersons = contactPersons;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public MccInfo getMccInfo() {
		return this.mccInfo;
	}
	public void setMccInfo(MccInfo mccInfo) {
		this.mccInfo = mccInfo;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getShopDoorPic() {
		return this.shopDoorPic;
	}
	public void setShopDoorPic(String shopDoorPic) {
		this.shopDoorPic = shopDoorPic;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
