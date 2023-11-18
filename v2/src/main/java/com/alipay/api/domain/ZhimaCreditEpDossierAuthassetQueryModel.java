package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻企业信用授权企业资产信息查询
 *
 * @author auto create
 * @since 1.0, 2023-07-13 14:13:43
 */
public class ZhimaCreditEpDossierAuthassetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4683235243513812258L;

	/**
	 * 企业资产类型：
OP_CERTIFICATE(经营资质证照),
OP_PATENT(经营专利)
	 */
	@ApiListField("ep_asset_type_list")
	@ApiField("string")
	private List<String> epAssetTypeList;

	/**
	 * 企业证件号：：企业社会统一信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	public List<String> getEpAssetTypeList() {
		return this.epAssetTypeList;
	}
	public void setEpAssetTypeList(List<String> epAssetTypeList) {
		this.epAssetTypeList = epAssetTypeList;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

}
