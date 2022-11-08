package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 酒店扫码核验做核验服务进件
 *
 * @author auto create
 * @since 1.0, 2022-10-27 11:26:15
 */
public class AlipayCommerceDataHotelVerifySyncModel extends AlipayObject {

	private static final long serialVersionUID = 1137899732819221139L;

	/**
	 * 酒店扫码核验业务场景下，核验人基本信息页面的展示配置
	 */
	@ApiField("certify_config")
	private CertifyConfig certifyConfig;

	/**
	 * 酒店扫码核验场景中码的链接
	 */
	@ApiField("code_values")
	private String codeValues;

	/**
	 * 扩展信息。 若有信息通过扩展字段来传，key值需要联系支付宝技术人员进行配置
	 */
	@ApiListField("ext_info")
	@ApiField("scenic_ext_info")
	private List<ScenicExtInfo> extInfo;

	/**
	 * PSB服务商侧酒店信息
	 */
	@ApiField("psb_hotel_info")
	private PsbHotelInfo psbHotelInfo;

	/**
	 * 门店信息通过MIF蚂蚁门店进件后，返回的shop_id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 接入服务商的标识，请提前联系支付宝技术人员来配置
	 */
	@ApiField("source_code")
	private String sourceCode;

	public CertifyConfig getCertifyConfig() {
		return this.certifyConfig;
	}
	public void setCertifyConfig(CertifyConfig certifyConfig) {
		this.certifyConfig = certifyConfig;
	}

	public String getCodeValues() {
		return this.codeValues;
	}
	public void setCodeValues(String codeValues) {
		this.codeValues = codeValues;
	}

	public List<ScenicExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ScenicExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public PsbHotelInfo getPsbHotelInfo() {
		return this.psbHotelInfo;
	}
	public void setPsbHotelInfo(PsbHotelInfo psbHotelInfo) {
		this.psbHotelInfo = psbHotelInfo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

}
