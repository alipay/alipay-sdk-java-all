package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EsignResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.taxbill.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:41:45
 */
public class AlipayFundTaxbillSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3154616994762168398L;

	/** 
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 签约信息列表
	 */
	@ApiListField("result_list")
	@ApiField("esign_result")
	private List<EsignResult> resultList;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setResultList(List<EsignResult> resultList) {
		this.resultList = resultList;
	}
	public List<EsignResult> getResultList( ) {
		return this.resultList;
	}

}
