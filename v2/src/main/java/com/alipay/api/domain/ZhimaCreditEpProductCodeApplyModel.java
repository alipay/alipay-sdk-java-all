package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用企业征信产品码申请
 *
 * @author auto create
 * @since 1.0, 2021-03-30 15:11:02
 */
public class ZhimaCreditEpProductCodeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1216419115481291324L;

	/**
	 * 申请业务描述
	 */
	@ApiField("apply_desc")
	private String applyDesc;

	/**
	 * 申码数量，1-100
	 */
	@ApiField("code_num")
	private Long codeNum;

	/**
	 * 商户一次调用唯一标识，便于后续核对
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

	/**
	 * 聚沙塔定义的产品列表，对接前需要芝麻同学业务同步给商户，列表按逗号分隔，比如同时签约浦发银行和南京银行产品，传入:101_1001_spdb,101_1001_njcb
	 */
	@ApiField("product_list")
	private String productList;

	public String getApplyDesc() {
		return this.applyDesc;
	}
	public void setApplyDesc(String applyDesc) {
		this.applyDesc = applyDesc;
	}

	public Long getCodeNum() {
		return this.codeNum;
	}
	public void setCodeNum(Long codeNum) {
		this.codeNum = codeNum;
	}

	public String getOrgBizNo() {
		return this.orgBizNo;
	}
	public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}

	public String getProductList() {
		return this.productList;
	}
	public void setProductList(String productList) {
		this.productList = productList;
	}

}
