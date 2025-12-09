package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据证券签约协议号查询用户昵称和头像
 *
 * @author auto create
 * @since 1.0, 2025-10-22 15:48:23
 */
public class AntfortuneStockSecuUserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8612121835324873516L;

	/**
	 * 当前访问用户的协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 要查询用户的协议号列表
	 */
	@ApiListField("agreement_no_list")
	@ApiField("string")
	private List<String> agreementNoList;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public List<String> getAgreementNoList() {
		return this.agreementNoList;
	}
	public void setAgreementNoList(List<String> agreementNoList) {
		this.agreementNoList = agreementNoList;
	}

}
