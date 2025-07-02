package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 证券用户投放内容查询
 *
 * @author auto create
 * @since 1.0, 2024-06-03 15:57:19
 */
public class AntfortuneStockCustomerDeliveryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8244169512928275772L;

	/**
	 * 签约协议号（uid在某个机构处的唯一标识）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 待查询展位码列表、支持批量查询
	 */
	@ApiListField("position_code")
	@ApiField("string")
	private List<String> positionCode;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public List<String> getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(List<String> positionCode) {
		this.positionCode = positionCode;
	}

}
