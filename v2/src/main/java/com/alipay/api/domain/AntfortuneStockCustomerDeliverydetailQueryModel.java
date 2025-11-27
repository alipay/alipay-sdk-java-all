package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 证券用户投放内容详情查询
 *
 * @author auto create
 * @since 1.0, 2025-09-24 11:06:12
 */
public class AntfortuneStockCustomerDeliverydetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8191624457291288994L;

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

	/**
	 * 展位相关的特征参数，如展位关联的通知类型、机构信息等。使用时根据position_code列表内的展位code获取对应展位的特征参数
	 */
	@ApiField("position_feature")
	private String positionFeature;

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

	public String getPositionFeature() {
		return this.positionFeature;
	}
	public void setPositionFeature(String positionFeature) {
		this.positionFeature = positionFeature;
	}

}
