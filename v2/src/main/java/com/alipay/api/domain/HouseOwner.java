package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 房产产权人
 *
 * @author auto create
 * @since 1.0, 2021-01-20 14:13:39
 */
public class HouseOwner extends AlipayObject {

	private static final long serialVersionUID = 4623561215317822312L;

	/**
	 * 权证号（完整）
	 */
	@ApiField("house_cert_no")
	private String houseCertNo;

	/**
	 * 权证类型。
enum (PREBUY_CERT-预购证, PROP_RIGHT_CERT-房地产权证, OTHER_RIGHT_CERT-他项权证, COMMRIGHT_CERT-房地产权共有（用）证, PRESERIAL_CERT-贷款抵押登记备案, PREGAGE_CERT-预购房抵押登记证, LANDTRADE_CERT-土地使用权转让证, CONTRACTNUM_CERT-商品房签约合同号, PREMONITORY_CERT-房地产预告登记证明, ABUILDINGGAGE_CERT-在建工程抵押登记证明, GAGEFORETELL_CERT-房地产抵押预告登记证明, COLLANDUSE_CERT-集体土地建设用地使用证, HOUSE_OWNERSHIP_CERT-房屋所有权证, STOCKCONTRACTNUM_CERT-二手房签约合同号, REALTY_OWNERSHIP_CERT-不动产权证书, MORTGAGE_REG_CERT-不动产抵押登记证明, ESTPROFORETELL_CERT-不动产预告登记证明, ESTPRODEMURRAL_CERT-不动产异议登记证明, LAND_SHARE_CERT-土地分摊凭证)
	 */
	@ApiField("house_cert_type")
	private String houseCertType;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	public String getHouseCertNo() {
		return this.houseCertNo;
	}
	public void setHouseCertNo(String houseCertNo) {
		this.houseCertNo = houseCertNo;
	}

	public String getHouseCertType() {
		return this.houseCertType;
	}
	public void setHouseCertType(String houseCertType) {
		this.houseCertType = houseCertType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
