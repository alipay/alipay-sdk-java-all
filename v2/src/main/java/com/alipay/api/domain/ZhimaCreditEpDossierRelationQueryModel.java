package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻企业信用企业关联关系查询
 *
 * @author auto create
 * @since 1.0, 2024-06-04 12:04:03
 */
public class ZhimaCreditEpDossierRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2787195248847858418L;

	/**
	 * 企业社会统一信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业关联关系子产品码。目前支持3类查询：
UBO关系查询：uboQuery；
股权关系查询：stockQuery；
工商关系查询：gsQuery
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 关联关系类型列表

「关联关系类型」需与「产品码」搭配使用，详细参数见下：1）product_code = uboQuery 时，ubo ：最终受益人；2）product_code = stockQuery 时，root：实际控制方；mom：母公司；parent：母公司的其他控股股东；child：子公司；sibling：兄弟公司(受同一控制方控制的其他企业)；uncle：重大影响/共同控制投资方；joint：联营/合营公司；3）product_code = gsQuery 时，head：总公司；branch：子公司；
	 */
	@ApiListField("relation_code_list")
	@ApiField("string")
	private List<String> relationCodeList;

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<String> getRelationCodeList() {
		return this.relationCodeList;
	}
	public void setRelationCodeList(List<String> relationCodeList) {
		this.relationCodeList = relationCodeList;
	}

}
