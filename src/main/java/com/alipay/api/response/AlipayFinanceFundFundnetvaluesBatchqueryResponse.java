package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NetValueVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.fund.fundnetvalues.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayFinanceFundFundnetvaluesBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4394435167261475811L;

	/** 
	 * 基金代码
	 */
	@ApiField("fund_code")
	private String fundCode;

	/** 
	 * 基金类型，如：STOCK，BLEND，INDEX，BOND，CURRENCY，QDII，SHORTDATED，FOF
	 */
	@ApiField("fund_type")
	private String fundType;

	/** 
	 * 基金净值列表
	 */
	@ApiListField("net_values")
	@ApiField("net_value_v_o")
	private List<NetValueVO> netValues;

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	public String getFundCode( ) {
		return this.fundCode;
	}

	public void setFundType(String fundType) {
		this.fundType = fundType;
	}
	public String getFundType( ) {
		return this.fundType;
	}

	public void setNetValues(List<NetValueVO> netValues) {
		this.netValues = netValues;
	}
	public List<NetValueVO> getNetValues( ) {
		return this.netValues;
	}

}
