package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaxUserDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.taxdata.evaluate response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-19 11:12:41
 */
public class AlipayOverseasTaxTaxdataEvaluateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6577822735745946216L;

	/** 
	 * 收款人对象
	 */
	@ApiField("payee")
	private TaxUserDto payee;

	/** 
	 * 收款人集合
	 */
	@ApiListField("payees")
	@ApiField("tax_user_dto")
	private List<TaxUserDto> payees;

	public void setPayee(TaxUserDto payee) {
		this.payee = payee;
	}
	public TaxUserDto getPayee( ) {
		return this.payee;
	}

	public void setPayees(List<TaxUserDto> payees) {
		this.payees = payees;
	}
	public List<TaxUserDto> getPayees( ) {
		return this.payees;
	}

}
