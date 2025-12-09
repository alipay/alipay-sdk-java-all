package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.guarantee.selleradmittance.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:07
 */
public class MybankCreditGuaranteeSelleradmittanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5685449597746626976L;

	/** 
	 * 查询decision是否准入。为空表示不准入
	 */
	@ApiField("is_admitted")
	private Boolean isAdmitted;

	/** 
	 * 是否签约
	 */
	@ApiField("is_signed")
	private Boolean isSigned;

	/** 
	 * 是否解约AE提前收款，为空表示未解约
	 */
	@ApiField("is_unsigned")
	private Boolean isUnsigned;

	/** 
	 * 解约时间，为空表示无解约时间
	 */
	@ApiField("unsign_date")
	private Date unsignDate;

	public void setIsAdmitted(Boolean isAdmitted) {
		this.isAdmitted = isAdmitted;
	}
	public Boolean getIsAdmitted( ) {
		return this.isAdmitted;
	}

	public void setIsSigned(Boolean isSigned) {
		this.isSigned = isSigned;
	}
	public Boolean getIsSigned( ) {
		return this.isSigned;
	}

	public void setIsUnsigned(Boolean isUnsigned) {
		this.isUnsigned = isUnsigned;
	}
	public Boolean getIsUnsigned( ) {
		return this.isUnsigned;
	}

	public void setUnsignDate(Date unsignDate) {
		this.unsignDate = unsignDate;
	}
	public Date getUnsignDate( ) {
		return this.unsignDate;
	}

}
